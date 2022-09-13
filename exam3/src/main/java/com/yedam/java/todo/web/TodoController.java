package com.yedam.java.todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;


@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getTodoList(Model model,TodoVO vo) {
		model.addAttribute("todoList", todoService.getTodo(vo));
		return "todo/todoList";
	}
}
