package com.uday.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

	private String email;
	private String password;
	private String fullname;

	public UserDto() {

	}

	public UserDto(String email, String password, String fullname) {
		this.email = email;
		this.password = password;
		this.fullname = fullname;
	}

}
