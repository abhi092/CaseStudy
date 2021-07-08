package com.user.user.model;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;



//@AllArgsConstructor
//@Builder
//@Getter
//@Setter
@Document(collection = "user")
public class User {
    @Id
    
    
    
  
    private String userId;
    
    @Size(max = 20)
    private String username;

    @Size(max = 20)   
    private String email;

    @Size(max = 20)
    private String name;

   

    @Size(max = 120)
    private String password;

    @Size(max = 120)
    private String mobilePhone;

    @Size(max = 120)
    private String address;

  
    @Size(max = 120)
    private String identificationNumber;


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobilePhone() {
		return mobilePhone;
	}


	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getIdentificationNumber() {
		return identificationNumber;
	}


	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}


	public User(String userId, @Size(max = 20) String username, @Size(max = 20) String email,
			@Size(max = 20) String name, @Size(max = 120) String password, @Size(max = 120) String mobilePhone,
			@Size(max = 120) String address, @Size(max = 120) String identificationNumber) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.name = name;
		this.password = password;
		this.mobilePhone = mobilePhone;
		this.address = address;
		this.identificationNumber = identificationNumber;
	}


	public User() {
		
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", name=" + name
				+ ", password=" + password + ", mobilePhone=" + mobilePhone + ", address=" + address
				+ ", identificationNumber=" + identificationNumber + "]";
	}
  
}