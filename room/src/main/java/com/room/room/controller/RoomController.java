package com.room.room.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.room.room.model.Room;
import com.room.room.service.RoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    public RoomService roomService;

    private final Logger logger =
            LoggerFactory.getLogger(RoomController.class);

    @PostMapping("/")
    public Room saveRoom(@Valid @RequestBody Room room) {
        logger.info("Inside saveDepartment of RoomController");
        return roomService.saveRoom(room);
    }

    @GetMapping("/{id}")
    public Room findRoomById(@PathVariable("id") String roomId) {
        logger.info("Inside findDepartmentById method of DepartmentController");
        return roomService.findRoomById(roomId);
    }

}