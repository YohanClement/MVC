<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<h2>Hello World!</h2>
	<form action="hello" method="post">
		<label>nom :</label><input name="nom" type="text"> <input
			type="submit" value="send">
	</form>
	<br>
	<form action="addemployee" method="get">
		<input type="submit" value="Add Employee">
	</form>

</body>
</html>
