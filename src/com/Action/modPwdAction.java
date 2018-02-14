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
 * Servlet implementation class modPwdAction
 */
@WebServlet("/modPwdAction")
public class modPwdAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modPwdAction() {
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
		String NewPwd=null;
		try{
			loginName=request.getParameter("loginName");
			loginPwd =request.getParameter("loginPwd");
			NewPwd = request.getParameter("NewPwd");
			if(ServiceFactory.getUserServiceInstace().modPwd(loginName, loginPwd, NewPwd)){
				response.sendRedirect("login.jsp");
			}else {
				out.println("–ﬁ∏ƒ ß∞‹ªÚ√‹¬Î¥ÌŒÛ");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
