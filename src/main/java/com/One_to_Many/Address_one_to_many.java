package com.One_to_Many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address_one_to_many {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Long pincode;
	private String city;
	
	public Address_one_to_many() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address_one_to_many(int id, Long pincode, String city) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
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
		return "Address_one_to_many [id=" + id + ", pincode=" + pincode + ", city=" + city + "]";
	}
	
	
}
