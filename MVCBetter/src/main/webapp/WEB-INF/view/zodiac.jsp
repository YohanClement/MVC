<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<a href="astro?mylocale=en">English </a> |
	<a href="astro?mylocale=fr">Français </a>
	<h3> What is your theme ?</h3>
	<form:form method="POST" action="astro" modelAttribute="astro">
		<table>
			<tr>
				<td><form:label path="sun">Sun</form:label></td>
				<td><form:input path="sun" /></td>
				<td><form:errors path="sun" cssClass="error" /></td>

			</tr>
			<tr>
				<td><form:label path="moon">Moon</form:label></td>
				<td><form:input path="moon" /></td>
				<td><form:errors path="moon" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="rising">
                      Rising</form:label></td>
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