<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<form action="modPwdAction" method="POST">
		姓名:<input name="loginName" type="text">
		旧密码:<input name="loginPwd" type="password">
		新密码:<input name="NewPwd" type="password">
		
			<input name="submit" value="提交" type="submit">
	</form>
</body>
</html>