package com.pattern.Builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserDTO dto;
	
	@Override
	public UserDTOBuilder withFirstName(String fname) {
	firstName=fname;	
	return this;
	}

	@Override
	public UserDTOBuilder withlastName(String lname) {
		lastName=lname;
		return this;
	}

	@Override
	public UserDTOBuilder withAge(LocalDate age) {
		Period ageDiff=Period.between(age, LocalDate.now());
		this.age=Integer.toString(ageDiff.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address=address.getHouseNumber()+" ,"+address.getStreet()+" \n"+address.getCity()+" ,"
				     +" \n"+address.getState()+"- "+address.getZipcode();
		return this;
	}

	@Override
	public UserDTO build() {
		dto=new UserWebDTO(firstName+" "+lastName, address,age);
		return dto;
	}

	@Override
	public UserDTO getUserDto() {
		return dto;
	}

}
