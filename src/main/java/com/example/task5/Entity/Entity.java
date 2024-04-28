package com.example.task5.Entity;

import org.springframework.stereotype.Component;

@Component
public class Entity {
    private int id;
	private String Name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Entity(int id,String name, int age) {
		super();
		this.id=id;
		Name = name;
		this.age = age;
	}
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
