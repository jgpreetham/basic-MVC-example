<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="person" class="com.home.entity.Person" scope="request"/>
<jsp:setProperty property="*" name="person"/>
<jsp:forward page="/addperson.do"></jsp:forward>

<p>&copy 2016 Preetham</p>
</body>
</html>