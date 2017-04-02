<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Welcome Page</title>
</head>

<body>
	<h2 align="center"><s:text name="label.welcome" /> <s:property value="name" />...! <s:text name="label.currServerTime" />&nbsp; <s:property value="dateString" /></h2>
	<p align="center"><a href="javascript:history.back()">Back</a></p>
</body>
</html>
