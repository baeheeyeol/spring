package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookVO;
import com.yedam.java.book.service.RentVO;

public interface BookMapper {
	public BookVO getBook(BookVO vo);
	public List	<BookVO> getBookList(BookVO vo);
	int insert(BookVO vo);
	public BookVO getBookNo();
	public List<RentVO> getBookRent(RentVO vo);
}
