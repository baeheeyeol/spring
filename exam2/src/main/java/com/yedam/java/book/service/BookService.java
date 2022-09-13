package com.yedam.java.book.service;

import java.util.List;

public interface BookService {
	public BookVO getBook(BookVO vo);
	public List	<BookVO> getBookList(BookVO vo);
	int insert(BookVO vo);
	public int getBookNo();
	public List<RentVO> getBookRent(RentVO vo);
}
