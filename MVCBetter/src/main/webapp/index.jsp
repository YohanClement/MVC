<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>

<html>
<head>

</head>
<body>

	<h1><fmt:message key="label.welcome" /></h1>
	<form action="hello">
		<input type="text" name="nom"> <input type="submit"
			value="J'entre">

	</form>
	<form action="astro">
		<input type="submit" value="Mon thème astral">
	</form>


</body>

</html>
