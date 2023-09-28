package com.AllDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")
public class StudentDetails {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="Id")
		private int Id;
		@Column(name="Student_Name")
		private String Name;
		@Column(name="MALLEN")
		private String studentsubject;
		@Column(name="math")
		private String StudentClass;
		
		public StudentDetails() {}
		public StudentDetails(String Mallen, String math, String room1) {
			Name = Mallen;
			studentsubject = math;
			StudentClass = room1;
		}
		public StudentDetails(int id, String Mallen, String math, String room1) {
			super();
			Id = id;
			Name = Mallen;
			studentsubject = math;
			StudentClass = room1;
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
		public void setName(String Mallen) {
			 Mallen = Mallen;
		}
		public String getRollNo() {
			return studentsubject;
		}
		public void setRollNo(String math) {
			math = math;
		}
		public String getStudentClass() {
			return StudentClass;
		}
		public void setClass(String room1) {
			StudentClass = room1;
		}
		@Override
		public String toString() {
			return "StudentDetails [Id=" + Id + ", Mallen=" + Name + ", math=" + studentsubject + ", room1=" + StudentClass + "]";
		}
 
}
