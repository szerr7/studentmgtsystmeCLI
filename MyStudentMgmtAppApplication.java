package edu.miu.cs.cs425.mystudentmgmtapp;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;
import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.StudentRepository;
import edu.miu.cs.cs425.mystudentmgmtapp.service.ClassRoomService;
import edu.miu.cs.cs425.mystudentmgmtapp.service.StudentService;
import edu.miu.cs.cs425.mystudentmgmtapp.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@SpringBootApplication

public class MyStudentMgmtAppApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService ;


    @Autowired
    private TranscriptService transcriptService ;

    @Autowired
    private ClassRoomService classRoomService ;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world of spring boot version 3.0.2");

        System.out.println("starting studentMgtApp....");

//        var bob = new Student(null ,"000-61-0002","Bob","K","Jones",3.01,
//                LocalDate.of(2001,2, 25), null, null) ;
//        var bobsTranscript = new Transcript(null, "MA Fine Arts", bob);
//        bob.setTranscript(bobsTranscript);
//
//        var addedBob = saveStudent(bob) ;
//
//        System.out.println("Student has been added --> " + addedBob);



        /**
        //TODO --> Add  new Transcript

        var newTranscript = new Transcript(null , "BS Computer Science") ;

        var savedTranscript = saveTranscript(newTranscript) ;

        System.out.println("Transcript added--> " + savedTranscript);

**/

        //TODO -->ADD classRoom

       // var MIUClass = new Classroom(null,"McLaughing building","M105") ;

        //var s = saveClassRoom(MIUClass) ;
        //System.out.println("New class room has added --> " + s);

        // Update Existing Student with their Transcript
        var studentId = 1l;
        var studentAnna = studentService.getStudentById(studentId);
        var annasTranscript = transcriptService.getTranscriptById(5);
        if(studentAnna != null) {
            studentAnna.setTranscript(annasTranscript);
        } else {
            System.out.println("Student with ID" + studentId + "does not exist");
        }
        studentService.saveStudent(studentAnna);

        var studentAnnaClass = studentService.getStudentById(studentId) ;
        var annasClassRoom = classRoomService.getClassRoomById(5) ;
        if (studentAnnaClass!=null){
            studentAnnaClass.setClassroom(annasClassRoom);
        }
        else {

            System.out.println("Student with ID" + studentId + "does not exist");

        }

        var addedClasRoom = studentService.saveStudent(studentAnnaClass) ;

        System.out.println("added student with classRoom is " + addedClasRoom);

        System.out.println("studentMgtApp completed");
    }


    private Student saveStudent(Student newStudent){
        return studentService.saveStudent(newStudent) ;
    }





    private Transcript saveTranscript(Transcript newTranscript){

        return transcriptService.saveTranscript(newTranscript) ;
    }


    private Classroom saveClassRoom(Classroom newClassRoom){
        return classRoomService.addNewClassRoom(newClassRoom) ;
    }

}
