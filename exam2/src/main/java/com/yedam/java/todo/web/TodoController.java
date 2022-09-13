package com.yedam.java.todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.todo.service.TodoService;

@Controller
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@GetMapping("/allList") 
	public String getTodoList(Model model) {
		model.addAttribute("todoList", todoService.getTodo());
		return "todo/todoList";
	}
}
