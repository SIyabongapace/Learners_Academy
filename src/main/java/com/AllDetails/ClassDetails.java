package com.AllDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Class_Details")
public class ClassDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int Id;
	@Column(name="room 1")
	private String ClassName;
	@Column(name="rooom 2")
	private String ClassSection;
	@Column(name="Room 3")
	private String ClassRoom;
	
	public ClassDetails() {}
	
	public ClassDetails(String className, String classSection, String classRoom) {
		ClassName = className;
		ClassSection = classSection;
		ClassRoom = classRoom;
	}
	
	public ClassDetails(int id, String className, String classSection, String classRoom) {
		super();
		Id = id;
		ClassName = className;
		ClassSection = classSection;
		ClassRoom = classRoom;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}

	public String getClassSection() {
		return ClassSection;
	}

	public void setClassSection(String classSection) {
		ClassSection = classSection;
	}

	public String getClassRoomNo() {
		return ClassRoom;
	}

	public void setClassRoomNo(String classRoom) {
		ClassRoom = classRoom;
	}

	@Override
	public String toString() {
		return "ClassDetails [Id=" + Id + ",Room 1=" + ClassName + ", Room2=" + ClassSection
				+ ", Room 3=" + ClassRoom + "]";
	}
	
	
}
