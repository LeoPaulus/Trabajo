<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenido admin, por favor ingrese sus datos:</h1>
	<form action="LoginController" method="post">
		ingrese su usuario : <input type="text" name="username"> <BR>
		ingrese su contraseña : <input type="password" name="password"> <BR>
		<input type="submit" />
		<input type="button" onclick=" location.href='http://localhost:8080/Trabajo/' " value="volver" name="volver" />
	</form>
</body>
</html>