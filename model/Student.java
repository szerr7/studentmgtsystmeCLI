package edu.miu.cs.cs425.mystudentmgmtapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId ;

    @NotBlank
    @Column(unique = true,nullable = false)
    private String studentNumber ;



    private String firstName ;

    private String middleName ;

    @NotBlank
    @Column(nullable = false)
    private String lastName;


    private Double cgpa ;


    @DateTimeFormat(pattern = "yyyy/M/dd")
    private LocalDate dateOfEnrollment ;




    @ManyToOne   //many students  has one classRoom
    @JoinColumn(name = "building_id", nullable = true)
    private Classroom classroom ;





    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transcript_id")
    private Transcript transcript ;


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dateOfEnrollment=" + dateOfEnrollment +
                '}';
    }
}
