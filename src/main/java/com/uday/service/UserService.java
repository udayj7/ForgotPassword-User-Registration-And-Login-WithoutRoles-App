package com.uday.service;

import com.uday.dto.UserDto;
import com.uday.model.User;

public interface UserService {
	
	User findByEmail(String email);
	User save (UserDto userDto);
	User save (User user);

}
