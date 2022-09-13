package com.yedam.java.book.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;
import com.yedam.java.book.service.RentVO;


@Controller
public class BookController {

	Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	BookService service;

	// 단건조회
	@RequestMapping("/book")
	public String book(BookVO vo, Model model, HttpServletRequest request) {
		logger.info("파라미터:" + vo.toString());
		model.addAttribute("book", service.getBook(vo));
		return "book/book";
	}

	// 목록
	@RequestMapping("/bookList")
	public String bookList(Model model, BookVO vo) {
		model.addAttribute("booklist", service.getBookList(vo));
		return "book/bookList";
	}

	// 등록페이지 이동
	@GetMapping("/bookInsert")
	public String bookInsert(Model model) {
		model.addAttribute("no",service.getBookNo());
		return "book/bookInsert";
	}

	// 등록처리
	@RequestMapping(value = "/bookInsert", method = RequestMethod.POST)
	public String bookInsertProc(BookVO vo) {
		// 커맨드객체
		logger.debug(vo.toString());
		service.insert(vo);
		return "redirect:bookList";
	}
	
	//렌트 페이지
	@RequestMapping("/bookRent")
	public String bookRent(Model model, RentVO vo) {
		model.addAttribute("rentlist", service.getBookRent(vo));
		return "book/bookRent";
	}
}
