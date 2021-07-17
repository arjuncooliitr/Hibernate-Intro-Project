package com.one_to_one;

import javax.persistence.*;

@Entity
public class Address_One_to_One {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private long pincode;
	private String city;
	
	public Address_One_to_One(int id, long pincode, String city) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.city = city;
	}
	
	public Address_One_to_One() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address_One_to_One [id=" + id + ", pincode=" + pincode + ", city=" + city + "]";
	}
	
	

}
