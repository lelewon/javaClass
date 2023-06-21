<%@page import="com.java.www.MemberDao"%>
<%@page import="com.java.www.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			String userId = request.getParameter("id");
			String userPw = request.getParameter("pw");
			MemberDao mdao = new MemberDao();
			Member member = mdao.selectLogin(userId, userPw);
			
			if(member!=null){
				session.setAttribute("sessionId", member.getId());
				session.setAttribute("sessionName", member.getName());
		%>
				<script>
					alert("로그인 되었습니다."+"<%=member.getName()%>"); location.href="main.jsp";
					<%-- response.sendRedirect(<%="main.jsp?loginCheck=1" %>); --%> <!-- java 소스, 스크립트로 다 바꿔야함 -->
				</script>
					
			<%}else{%>
				<script>
					alert("아이디 또는 패스워드가 일치하지 않습니다. 다시 입력하세요");
					history.back();
					<%-- location.href="login.jsp";
					response.sendRedirect(<%="login.jsp?loginCheck=0" %>); --%>
				</script>
				
			<%}%>
	</body>
</html>