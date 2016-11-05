package com.student.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="Id")
private long id;

@Column(name="Name")
private String name;

@Column(name="Surname")
private String surname;

@Column(name="AddDate")
private Date addDate;

@Column(name="UpdateDate")
private Date updateDate;

public Student() {
	
}

public Student(long id, String name, String surname, Date addDate, Date upateDate) {
	super();
	this.id = id;
	this.name = name;
	this.surname = surname;
	this.addDate = addDate;
	this.updateDate = upateDate;
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

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public Date getAddDate() {
	return addDate;
}

public void setAddDate(Date addDate) {
	this.addDate = addDate;
}



public Date getUpdateDate() {
	return updateDate;
}

public void setUpdateDate(Date updateDate) {
	this.updateDate = updateDate;
}

@Override
public String toString() {
	return new StringBuilder("StudentDetails [")
			.append("id = ").append(id)
			.append(" , name = ").append(name)
			.append(" , surname = ").append(surname)
			.append(" , addDate = ").append(addDate)
			.append(" , updateDate = ").append(updateDate)
			.append("]").toString();
}


}
