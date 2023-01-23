<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertion nouvel.le employe.e</title>
</head>
<body>


	<form:form action="addemployee" method="post">

		<h2 class="fw-normal text-center">Ajouter un.e nouvel.le
			employé.e</h2>

		<div class="form-outline mb-4">
			<label for="firstname"><b>Prénom</b></label> <input type="text"
				class="form-control form-control-lg" name="firstname">
		</div>

		<div class="form-outline mb-4">
			<label for="lastname"><b>Nom de famille</b></label> <input
				type="text" class="form-control form-control-lg" >
		</div>
		<div>
			<label for="start"><b>Date d'entrée</b></label> <input type="date"
				class="form-control form-control-lg" name="date">
		</div>

		<div class="form-outline mb-4">
			<label for="rolename"><b>Titre du poste</b></label> <input
				type="text" class="form-control form-control-lg" name="rolename">
		</div>


		<div class="pt-1 mb-4">
			<button class="btn btn-primary mb-4" type="submit">Ajouter</button>
		</div>
	</form:form>

</body>
</html>