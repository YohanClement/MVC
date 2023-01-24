<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" href="<c:url value="resources/css/Style.css"/>">
</head>
<body>
	<div>
		<a href="?lang=en"><img src="resources/img/En.png" width="50" height="30"/> </a> 
		<a href="?lang=fr"><img src="resources/img/Fr.jpg" width="50" height="35"/> </a>
	</div>

<h1 class="bg">54f5841515</h1>

	<h1>
	<spring:message code="welcome" />
	</h1>


	<form action="hello">
		<label><spring:message code="welcome.label" /></label> <input
			type="text" name="nom"> <input type="submit"
			value='<spring:message code="confirm" />'>

	</form>
	<form action="astro">
		<input type="submit" value="<spring:message code="astral" />">
	</form>

</body>

</html>
