package com.yedam.java.todo.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;


@RestController
@CrossOrigin(origins = "http://192.168.219.152:8088")
public class TodoRentController {
	
	Logger logger = LoggerFactory.getLogger(TodoRentController.class);

	@Autowired
	TodoService service;
	
	//등록
	@PostMapping("/todo")
	public TodoVO todoInsert(@RequestParam("contents") String contents,Model model) {
		TodoVO vo1 = new TodoVO();
		System.out.println(contents);
		System.out.println(service.getTodoNo());
		vo1.setNo(service.getTodoNo());
		vo1.setContents(contents);
		System.out.println(contents);
		service.insert(vo1);
		return vo1;
	}
}
