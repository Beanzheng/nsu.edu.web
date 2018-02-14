package com.Action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Factory.ServiceFactory;

/**
 * Servlet implementation class UserAction
 */
@WebServlet("/UserAction")
public class UserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserAction() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		String loginName="";
		String loginPwd="";
		try{
			loginName=request.getParameter("loginName");
			loginPwd=request.getParameter("loginPwd");
			System.out.print("”√ªß:"+loginName+"√‹¬Î:"+loginPwd);
			if(ServiceFactory.getUserServiceInstace().loginCheck(loginName, loginPwd)){
					response.sendRedirect("welcome.jsp");
			}else {
					response.sendRedirect("login.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
