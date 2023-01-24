<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false"%>
<meta charset="UTF-8">
<title>Astro Theme</title>
</head>
<body>
	<h2>Thème</h2>
	<table>
		<tr>
			<td>Sun :</td>
			<td>${sun}</td>
		</tr>
		<tr>
			<td>Moon :</td>
			<td>${moon}</td>
		</tr>
		<tr>
			<td>Rising :</td>
			<td>${rising}</td>
		</tr>
		<tr>
			<td>Declared as a B</td>
			<td>${isB}</td>
		</tr>
	</table>
</body>
</html>