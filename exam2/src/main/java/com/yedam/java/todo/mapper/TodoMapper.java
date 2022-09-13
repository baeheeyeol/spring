package com.yedam.java.todo.mapper;

import java.util.List;

import com.yedam.java.todo.service.TodoVO;

public interface TodoMapper {
	int insert(TodoVO vo);
	public List<TodoVO> getTodo() ;
	
}
