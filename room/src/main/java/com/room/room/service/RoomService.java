package com.room.room.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.room.room.model.Room;
import com.room.room.repository.RoomRepository;
import com.room.room.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RoomService {
	
final Logger logger = LoggerFactory.getLogger(RoomService.class);

	
	

    @Autowired
    private RoomRepository roomRepository;

    public Room saveRoom(Room room) {
        logger.info("Inside saveDepartment of DepartmentService");
        return roomRepository.save(room);
    }

    public Room findRoomById(String roomId) {
        logger.info("Inside saveDepartment of DepartmentService");
        return roomRepository.findByRoomId(roomId);
    }
}
	


