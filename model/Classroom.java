package edu.miu.cs.cs425.mystudentmgmtapp.model;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "classRooms")
public class Classroom {
   @Id
   @Column(nullable = true)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classRoomId ;



    private String buildingName ;
    private String roomNumber ;


    @Override
    public String toString() {
        return "Classroom{" +
                "classRoomId=" + classRoomId +
                ", buildingName='" + buildingName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }
}
