package com.example.task5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.task5.Entity.Entity;
import com.example.task5.Service.service;

@RestController
public class Controller {

	@Autowired
	service s;
	
	
	//pathVariable
	@GetMapping("getbyId/{id}")
	public Entity getbyName(@PathVariable(value="id") int id) {
		Entity entity=s.getbyId(id);
		return entity;
	}
	//RequestParam
	@GetMapping("addName")
	public String addname(@RequestParam int id,@RequestParam String name,@RequestParam int age) {
		String h=s.addName(id,name, age);
		return h;
	}
	
	//RequestParam with Default Value
	@GetMapping("addNamewithdefault")
	public String addnamewithdefault(@RequestParam int id,@RequestParam String name,@RequestParam(required=true,defaultValue="20") int age) {
		System.out.println(age);
		String h=s.addName(id,name, age);
		return h;
	}
}
