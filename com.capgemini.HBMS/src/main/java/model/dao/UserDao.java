package model.dao;

import dto.UserDto;

public interface UserDao 
{
	boolean userRegister(UserDto user);
	boolean userLogin(UserDto user);
}
