package com.AllDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Teacher_Details")
public class TeacherDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int Id;
	@Column(name="Tearchers_name")
	private String Name;
	@Column(name="KISHA")
	private String Subject;
	@Column(name="MATH")
	private String TeacherClass;
	
	public TeacherDetails() {}
	
	public TeacherDetails(String KISHA, String MATH, String room1) {
		Name = KISHA;
		Subject = MATH;
		TeacherClass = room1;
	}
	
	public TeacherDetails(int id, String KISHA, String MATH, String room1) {
		super();
		Id = id;
		Name = KISHA;
		Subject = MATH;
		TeacherClass = room1;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String KISHA) {
		Name = KISHA;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String MATH) {
		Subject = MATH;
	}

	public String getTeacherClass() {
		return TeacherClass;
	}

	public void setTeacherClass(String room1) {
		TeacherClass = room1;
	}

	@Override
	public String toString() {
		return "TeacherDetails [Id=" + Id + ", KISHA=" + Name + ", MATH=" + Subject + ", room1=" + TeacherClass
				+ "]";
	}
	
}
