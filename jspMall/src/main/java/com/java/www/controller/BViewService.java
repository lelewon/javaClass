package com.java.www.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.Board;
import com.java.www.dao.BoardDao;
import com.java.www.service.BService;

public class BViewService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bno = Integer.parseInt(request.getParameter("bno")); //파라미터 값
		BoardDao bdao = new BoardDao(); //객체선언
		bdao.updateHit(bno); //조회수 1증가
		Board board = bdao.selectOne(bno); //메소드호출 후 객체 받음
		
		request.setAttribute("board", board); //request 에 추가
	}

}
