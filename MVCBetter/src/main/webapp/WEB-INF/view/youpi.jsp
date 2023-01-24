<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Astro Theme</title>
</head>
<body>

	<h2>
		<spring:message code="recap.hello" />
	</h2>
	<table>
		<tr>
			<td><spring:message code="form.zodiac.sun" /></td>
			<td>${sun}</td>
		</tr>
		<tr>
			<td><spring:message code="form.zodiac.moon" /></td>
			<td>${moon}</td>
		</tr>
		<tr>
			<td><spring:message code="form.zodiac.rising" /></td>
			<td>${rising}</td>
		</tr>
		<tr>
			<td>Declared as a B</td>
			<td>${isB}</td>
		</tr>
	</table>
</body>
</html>