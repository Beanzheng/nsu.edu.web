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
 * Servlet implementation class ResigterAction
 */
@WebServlet("/ResigterAction")
public class ResigterAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResigterAction() {
        super();
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
		String loginName=null;
		String loginPwd=null;
		String Sex= null;
		try{
			loginName=request.getParameter("loginName");
			loginPwd= request.getParameter("loginPwd");
			Sex	= request.getParameter("Sex");
			if(ServiceFactory.getUserServiceInstace().resigter(loginName, loginPwd, Sex)){
				response.sendRedirect("login.jsp");
			}else {
				out.println("注册失败或用户名已存在");
				response.sendRedirect("resigter.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
