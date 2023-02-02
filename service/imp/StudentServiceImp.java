package edu.miu.cs.cs425.mystudentmgmtapp.service.imp;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.StudentRepository;
import edu.miu.cs.cs425.mystudentmgmtapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

  @Autowired
  private StudentRepository studentRepository ;



    @Override
    public Student saveStudent(Student newStudent) {
        return  studentRepository.save(newStudent);
    }

  @Override
  public Student getStudentById(Long studentId) {
    return studentRepository.findById(studentId).orElse(null);
  }
}
