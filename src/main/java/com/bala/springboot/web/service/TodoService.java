package com.bala.springboot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bala.springboot.web.model.Todo;

@Service
public class TodoService {

	private static List<Todo> todos =new ArrayList<Todo>();
	private static int intCount=3;
	
	static {
		todos.add(new Todo(1, "bala", "java", new Date(), false));
		todos.add(new Todo(1, "krishna", "spring", new Date(), false));
		todos.add(new Todo(1, "naidu", "Spring boot", new Date(), false));
	}
	
	public List<Todo> retrieveTodos(String user){
		List<Todo> filterList=new ArrayList<Todo>();
		for(Todo todo:todos)
		{
			if(todo.getUser().equals(user))
				filterList.add(todo);
		}
		return filterList;
		
	}
	
}
