package com.room.room.repository;

import com.room.room.model.Room;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room, String> {

    Room findByRoomId(String roomId);
}