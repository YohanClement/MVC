<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
</head>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solmoon #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<body>
	<h3>
		<spring:message code="form.zodiac" />
	</h3>
	<form:form method="POST" action="astro" modelAttribute="astro">
		<table>
			<tr>
				<td><form:label path="sun">
						<spring:message code="form.zodiac.sun" />
					</form:label></td>
				<td><form:input path="sun" /></td>
				<td><form:errors path="sun" cssClass="error" /></td>

			</tr>
			<tr>
				<td><form:label path="moon">
						<spring:message code="form.zodiac.moon" />
					</form:label></td>
				<td><form:input path="moon" /></td>
				<td><form:errors path="moon" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="rising">
						<spring:message code="form.zodiac.rising" />
					</form:label></td>
				<td><form:input path="rising" /></td>
				<td><form:errors path="rising" cssClass="error" /></td>

			</tr>
			<tr>
				<td><form:label path="B">
					  is bro a B ?
					  </form:label></td>
				<td><form:checkbox path="B" /></td>
				<td><form:errors path="B" cssClass="error" /></td>

			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>