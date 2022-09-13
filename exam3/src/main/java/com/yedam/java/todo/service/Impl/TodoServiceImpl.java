package com.yedam.java.todo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.todo.mapper.TodoMapper;
import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoMapper mapper;
	
	@Override
	public int insert(TodoVO vo) {
		return mapper.insert(vo);
	}

	@Override
	public List<TodoVO> getTodo(TodoVO vo) {
		// TODO Auto-generated method stub
		return mapper.getTodo(vo);
	}

	@Override
	public int getTodoNo() {
		// TODO Auto-generated method stub
		return mapper.getTodoNo();
	}


}
