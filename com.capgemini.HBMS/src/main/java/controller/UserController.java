package controller;

import javax.enterprise.inject.Model;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dto.UserDto;
import model.service.UserServiceImpl;

@Controller
public class UserController 
{
	@RequestMapping("/views/Register")
	public ModelAndView getQueryString(
			@RequestParam("ui") String  userid,
			@RequestParam("pass") String password,
			@RequestParam("email") String email,
			@RequestParam("un") String username,
			@RequestParam("mn") String mobile,
			@RequestParam("address") String address)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(address);
		System.out.println(userid);
		
		
		UserDto user = new UserDto();
		user.setAddress(address);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setPassword(password);
        user.setUsername(username);
      
        System.out.println("controller");
        
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        boolean status = userServiceImpl.userRegisterService(user);
        System.out.println("success");
        if(status)
        {
        	ModelAndView modelAndView = new ModelAndView("Loginjsp");
        	return modelAndView;
        }
        
        	ModelAndView modelAndView = new ModelAndView("Register");
        	return modelAndView;
		
	}
	

}
