package com.One_to_Many;

import javax.persistence.*;
import java.util.*;


@Entity
public class Person_one_to_many {
	@Id
	private int personId;
	private String name;
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	List<Address_one_to_many> addresses;
	
	public Person_one_to_many() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person_one_to_many(int personId, String name, List<Address_one_to_many> addresses) {
		super();
		this.personId = personId;
		this.name = name;
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Person_one_to_many [personId=" + personId + ", name=" + name + ", addresses=" + addresses + "]";
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address_one_to_many> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address_one_to_many> addresses) {
		this.addresses = addresses;
	}

	
}
