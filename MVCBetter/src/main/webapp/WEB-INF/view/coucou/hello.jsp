<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
	<h1>
		<spring:message code="welcome" />
		${nom}
	</h1>
	<h2>
		<spring:message code="form.hello" />
	</h2>
	<form:form action="enregistrer" modelAttribute="user" method="post">
		<div>
			<label><spring:message code="form.hello.nom" /></label>
			<!-- path permet de lier au model via les getters et les setters-->
			<form:input path="nom" />
			<form:errors path="nom" cssClass="error" />
		</div>
		<div>
			<label><spring:message code="form.hello.prenom" /></label>
			<form:input path="prenom"/>
			<form:errors path="prenom" cssClass="error" />
		</div>
		<div>
			<form:label path="email">
				<spring:message code="form.hello.email" />
			</form:label>
			<form:input path="email" />
			<form:errors path="email" cssClass="error" />
		</div>
		<div>
			<form:label path="element">
				<spring:message code="form.hello.zodiac" />
			</form:label>
			<form:radiobutton path="element" value="feu" />
			Feu
			<form:radiobutton path="element" value="metal" />
			Métal
			<form:radiobutton path="element" value="terre" />
			Terre
			<form:radiobutton path="element" value="eau" />
			Eau
			<form:radiobutton path="element" value="air" />
			Air

		</div>
		<div>
			<form:label path="animal">
				<spring:message code="form.hello.animal" />
			</form:label>
			<form:select path="animal">
				<form:option value="rat" label="rat" />
				<form:option value="tigre" label="tigre" />
				<form:option value="dragon" label="dragon" />
				<form:option value="boeuf" label="boeuf" />
				<form:option value="lapin" label="lapin" />
				<form:option value="serpent" label="serpent" />
				<form:option value="coq" label="coq" />
				<form:option value="chevre" label="chevre" />
				<form:option value="cheval" label="cheval" />
				<form:option value="singe" label="singe" />
				<form:option value="chien" label="chien" />
				<form:option value="cochon" label="cochon" />
			</form:select>
		</div>
		<div>
			<input type="submit" value="<spring:message code="confirm"/>">
		</div>


	</form:form>

</body>
</html>