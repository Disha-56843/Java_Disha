package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.User;
import com.example.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService UserService;
	
	@RequestMapping("/")
	public String index(Model model)
	{
	
		model.addAttribute("user", new User());
		model.addAttribute("users", UserService.viewAllUser());
		return "index";
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/reg")
	public String registration(@ModelAttribute("user") User u,Model model)
	{
		
		
		if(u.getId()>0)
		{
			model.addAttribute("msg", "Update successfully !!!");
		}
		else
		{
			model.addAttribute("msg", "Registration successfully !!!");
		}
		UserService.addOrUpdateUser(u);
		model.addAttribute("user", new User());
		model.addAttribute("users", UserService.viewAllUser());
		return "index";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("did") int id)
	{
		UserService.deleteUser(id);
		return "redirect:/";
	}
	
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("eid") int id,Model model)
	{
		User u =  UserService.userById(id);
		model.addAttribute("user", u);
		model.addAttribute("users", UserService.viewAllUser());
		return "index";
	}
	
}
