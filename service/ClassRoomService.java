package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;



public interface ClassRoomService {


     Classroom addNewClassRoom(Classroom newClassRoom) ;

     Classroom getClassRoomById(Integer classroomId) ;



}
