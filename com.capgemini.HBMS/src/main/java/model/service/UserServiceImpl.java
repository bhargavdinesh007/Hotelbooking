package model.service;

import dto.UserDto;
import model.dao.UserDaoImpl;

public class UserServiceImpl implements UserService
{

	public boolean userRegisterService(UserDto user) 
	{
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		boolean status=userDaoImpl.userRegister(user);
		System.out.println("service");
		return status;
		
	}

	public boolean userLoginService(UserDto user) {
		// TODO Auto-generated method stub
		return false;
	}


	

}
