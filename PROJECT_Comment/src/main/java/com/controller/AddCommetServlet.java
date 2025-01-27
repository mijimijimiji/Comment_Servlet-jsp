package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.STRING;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CommentDTO;
import com.service.CommentService;

/**
 * Servlet implementation class AADCommetServlet
 */
@WebServlet("/AADCommetServlet")
public class AddCommetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCommetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		
		
		int postid = Integer.parseInt(request.getParameter("postid"));
		String userid = request.getParameter("userid").trim();
		String comdate = request.getParameter("comdate");
		String comtext = request.getParameter("comtext").trim();
		System.out.println(userid); //값 잘 나오는지 확인했음
		CommentService service = new CommentService();
		HttpSession session = request.getSession();
		
		//1. comment DB에 내용 저장
		CommentDTO commentDB = new CommentDTO(0, postid, userid, comdate, comtext, 0);
		//comid, postid, userid, comdate, comtext, abovecom 로 생성
		
		int recordCount = service.AddCommnet(commentDB); //생성된 commentDB객체로 add(insert하고 있음)
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
