package com.tsf.studentmodel;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_details")
public class StudentModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name="Name")
  private String name;
  
  public StudentModel() {
	  
  }
  
  public StudentModel(long id,String name) {
	  this.id = id;
	  this.name = name;
  }



public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
  
  
	
}
