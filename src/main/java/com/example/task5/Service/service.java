package com.example.task5.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.task5.Entity.Entity;

@Service
public class service {
	private static List<Entity> list = new ArrayList<>();

	static {
		list.add(new Entity(1,"Kamal", 23));
		list.add(new Entity( 2,"Arun", 34));
		list.add(new Entity(3, "Pooja",42));
	}
	
	public Entity getbyId(int id) {
		Optional<Entity> entity=list.stream().filter(e->e.getId()==id).findFirst();
		return entity.get();	
		}
	
	public String addName(int id,String name,int age) {
		list.add(new Entity(id,name,age));
		return "Sucessfully Added: "+name  ;
	}
}
