<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags"  prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Details Page</title>
</head>
<body>
<h1>Following are the regisration details successfully saved:</h1>
<table border="1" cellspacing="5" cellpadding="5">
	<tr>
		<th>User Name:</th>
		<td><s:property value="userName" /></td>
	</tr>
	<tr>
		<th>Gender::</th>
		<td><s:property value="gender" /></td>
	</tr>
	<tr>
		<th>About You:</th>
		<td><s:property value="about" /></td>
	</tr>
</table>
</body>
</html>