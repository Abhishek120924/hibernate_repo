package com.tut.com.tut;
//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity		//it says that this class is a entity and a table will be created for this class in database
//@Table(name="users")	//now table will be saved with the name of users  instead of student
public class student {
//	@Id		//this annotation will create primary key
//	@GeneratedValue(strategy=GenerationType.IDENTITY)	//this annotation will create automatic value for this field based on strategy
//	@Column(name="Sr. No.") //now column name will be Sr. No. instead of id
//	private int id;
//	private String name;
//	private String city;
//	@Transient //now vill variable will not be stored in table
//	private String vill;
//	//@Temporal(TemporalType.DATE)	//now only date will be stored instead of date and time
//	//private Date dt;
//	//@Lob //it says that image is a large object
//	//private byte[] image;
//	public student(int id, String name, String city) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.city = city;
//	}
//	public student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public String getVill() {
//		return vill;
//	}
//	public void setVill(String vill) {
//		this.vill = vill;
//	}
////	public Date getDt() {
//	//	return dt;
//	//}
//	//public void setDt(Date dt) {
//		//this.dt = dt;
//	//}
//	//public byte[] getImage() {
//		//return image;
//	//}
//	//public void setImage(byte[] image) {
//		//this.image = image;
//	//}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
	@Id
	private int id;
	private String name;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

	
	

