package com.example.nikhil.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name = "TODO")
public class ToDo {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESC")
    private String description;
    @Column(name = "COMPLETION_DATE")
    private Date completionDate;
    @Column(name = "IS_DONE")
    private boolean isDone;
    
    @ManyToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    @JoinColumn(name="USER_ID")
    @JsonManagedReference
    private User user;
    
    
    
     public ToDo() {}


   public ToDo(String name, String description, Date completionDate, boolean isDone) {
		super();
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
   
   



   public User getUser() {
	return user;
}



public void setUser(User user) {
	this.user = user;
}



public ToDo(int id, String name, String description, Date completionDate, boolean isDone) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.completionDate = completionDate;
        this.isDone = isDone;
    }



   @Override
    public String toString() {
        return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", completionDate="
                + completionDate + ", isDone=" + isDone + "]";
    }



}
