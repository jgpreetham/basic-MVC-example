<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Person</title>
</head>
<body>


	<form action="personInt.jsp" method="post">

		First name<input type="text" name="firstName"
			value="<%=request.getParameter( "firstName" ) == null ? "" : request.getParameter( "firstName" )%>" /><br />
		Last name <input type="text" name="lastName"
			value="<%=request.getParameter( "lastName" ) == null ? "" : request.getParameter( "lastName" )%>" /><br />
		<input type="submit">
	</form>


<%
if(request.getAttribute( "error" )!=null)
{
   out.println("<h2>Error!!</h2>");
   out.println(request.getAttribute( "error" ));
}
%>
<p>&copy 2016 Preetham</p>
</body>
</html>