<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Welcome Page</title>
</head>
<body>
	<p align="right">
		<s:url id="localeEN"  namespace="/" action="locale" >
		   <s:param name="request_locale" >en</s:param>
		</s:url>
		<s:url id="localeFR"  namespace="/" action="locale" >
		   <s:param name="request_locale" >fr</s:param>
		</s:url>
 	
		<strong>Select Language:</strong>
		<s:if test="%{#session.language == 'fr'}">
				<s:a href="%{localeEN}" >English</s:a>&nbsp;&nbsp;France
				
		</s:if>
		<s:else>
				English&nbsp;&nbsp;<s:a href="%{localeFR}" >France</s:a>
		</s:else>		
		<br>		
	</p>
	
	<s:form action="dateDisplay" method="post" validate="true">		
		<table align="center" border="0">
			<tr>
				<th><s:textfield name="name" key="label.enterName" size="20" /></th>
			<tr>
			<tr>
				<th>
					<s:submit action="dateDisplay" method="execute" key="label.submitAnnotation" align="center" />
				</th>
			</tr>
		</table>		
	</s:form>
</body>
</html>