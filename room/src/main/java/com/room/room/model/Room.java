package com.room.room.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;



@AllArgsConstructor
@Builder
@Getter
@Setter
@Document(collection = "room")
public class Room {
    @Id
    
    private String roomId;
    
    private String Name;
    private String Category;
    private String Price;
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public Room(String roomId, String name, String category, String price) {
		super();
		this.roomId = roomId;
		Name = name;
		Category = category;
		Price = price;
	}
	public Room() {
		
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", Name=" + Name + ", Category=" + Category + ", Price=" + Price + "]";
	}
	

	
}