package model.service;

import dto.UserDto;

public interface UserService 
{
	boolean userRegisterService(UserDto user);
	boolean userLoginService(UserDto user);
}
