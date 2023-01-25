<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recap</title>
</head>
<body>

	<p>
		<spring:message code="recap.hello" />
	</p>
	<spring:message code="form.hello.prenom" />
	: ${user.prenom }
	<br>
	<spring:message code="form.hello.nom" />
	: ${user.nom }
	<br>
	<spring:message code="form.hello.email" />
	: ${user.email }
	<br>
	<spring:message code="recap.hello.zodiac" />
	: ${user.animal } ${user.element }

</body>
</html>