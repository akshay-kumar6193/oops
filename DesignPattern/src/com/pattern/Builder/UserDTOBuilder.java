package com.pattern.Builder;

import java.time.LocalDate;

//Abstract builder
public interface UserDTOBuilder {

	public UserDTOBuilder withFirstName(String fname);
	
	public UserDTOBuilder withlastName(String lname);
	
	public UserDTOBuilder withAge(LocalDate age);
	
	public UserDTOBuilder withAddress(Address address);
	
	public UserDTO build();
	
	public UserDTO getUserDto();
}
