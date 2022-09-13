package com.yedam.java.todo.service;

import java.util.List;

public interface TodoService {
	int insert(TodoVO vo);
	public List<TodoVO> getTodo() ;
}
