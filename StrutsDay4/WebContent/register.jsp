<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Register Page</title>
  </head>
  <body>
  <s:actionerror/>
  <s:actionmessage/>
    <s:form action="registerUser"  method="post" validate="true">
    
      <s:textfield name="userName" key="label.user.name" />
      <s:password name="password" key="label.password" />
      <s:radio name="gender" key="label.gender" list="{'Male','Female'}" />
      <s:textfield key="label.country" name="country" />
      <s:textarea name="about" key="label.about" />
      
      <s:submit />
    </s:form>
  </body>
</html>