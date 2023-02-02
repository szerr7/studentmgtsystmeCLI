package edu.miu.cs.cs425.mystudentmgmtapp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "transcript")
public class Transcript {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transcriptId;


    private String degreeTitle ;


    @OneToOne(mappedBy = "transcript")
    private Student student ;




}
