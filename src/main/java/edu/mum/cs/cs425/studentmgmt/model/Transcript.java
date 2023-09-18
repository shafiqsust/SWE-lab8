package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;

@Entity
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transcriptId;

    private String degreeTitle;

    @OneToOne(mappedBy = "transcript")
    private Student student;

    // Constructors, getters, setters
}

