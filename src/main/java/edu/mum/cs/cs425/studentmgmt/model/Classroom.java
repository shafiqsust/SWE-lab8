package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;

@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long classroomId;

    private String buildingName;

    private String roomNumber;

    @OneToOne(mappedBy = "classroom")
    private Student student;

    // Constructors, getters, setters
}
