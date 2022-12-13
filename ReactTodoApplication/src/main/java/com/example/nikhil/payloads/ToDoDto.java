package com.example.nikhil.payloads;

import java.util.Date;

import javax.validation.constraints.Min;

import com.example.nikhil.entities.User;
import com.fasterxml.jackson.annotation.JsonBackReference;



public class ToDoDto {
    private int id;
    
  //  @Min(value = 2 , message = "name must be minimum 4 characters")
    private String name;
    private String description;
    private Date completionDate;
    private boolean isDone;
    
    @JsonBackReference
    private UserDto user;



   ToDoDto() {
    }




    public ToDoDto(int id, String name, String description, Date completionDate, Boolean isDone) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.completionDate = completionDate;
        this.isDone = isDone;
    }




    public int getId() {
        return id;
    }



   public void setId(int id) {
        this.id = id;
    }



   public String getName() {
        return name;
    }



   public void setName(String name) {
        this.name = name;
    }




    public String getDescription() {
        return description;
    }




    public void setDescription(String description) {
        this.description = description;
    }




    public Date getCompletionDate() {
        return completionDate;
    }




    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }




    public boolean isDone() {
        return isDone;
    }




    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
    
    








	public UserDto getUser() {
		return user;
	}




	public void setUser(UserDto user) {
		this.user = user;
	}




	@Override
    public String toString() {
        return "TodoDto [id=" + id + ", name=" + name + ", description=" + description + ", completionDate="
                + completionDate + ", isDone=" + isDone + "]";
    }




}
