<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1><center>Result for <%=request.getParameter("a1")%></center></h1>
<%
int i=Integer.parseInt(request.getParameter("t1"));
int j=Integer.parseInt(request.getParameter("t2"));
int k=0;
String str =request.getParameter("a1");
if(str.equals("add")) 
	k=i+j;
if(str.equals("mul")) 
	k=i*j;
if(str.equals("Div")) 
	k=i/j;
%>
Result is <%=k%>

</body>
</html>