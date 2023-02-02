package edu.miu.cs.cs425.mystudentmgmtapp.service.imp;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;
import edu.miu.cs.cs425.mystudentmgmtapp.repository.ClassRoomRepository;
import edu.miu.cs.cs425.mystudentmgmtapp.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    @Autowired
    private ClassRoomRepository classRoomRepository ;


    @Override
    public Classroom addNewClassRoom(Classroom newClassRoom) {
        return classRoomRepository.save(newClassRoom);
    }

    @Override
    public Classroom getClassRoomById(Integer classroomId) {
        return classRoomRepository.findById(classroomId).orElse(null);
    }
}
