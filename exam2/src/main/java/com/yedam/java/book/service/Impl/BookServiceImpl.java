package com.yedam.java.book.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;
import com.yedam.java.book.service.RentVO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookMapper mapper;
	
	@Override
	public BookVO getBook(BookVO vo) {
		// TODO Auto-generated method stub
		return mapper.getBook(vo);
	}

	@Override
	public List<BookVO> getBookList(BookVO vo) {
		// TODO Auto-generated method stub
		return mapper.getBookList(vo);
	}

	@Override
	public int insert(BookVO vo) {
		// TODO Auto-generated method stub
		return mapper.insert(vo);
	}

	@Override
	public int getBookNo() {
		BookVO vo= mapper.getBookNo();
		return vo.getBookNo();
	}

	@Override
	public List<RentVO> getBookRent(RentVO vo) {

		return mapper.getBookRent(vo);
	}




}
