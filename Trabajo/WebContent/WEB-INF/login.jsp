<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pedicura Gralmen</title>
</head>
<body>
	<h1>Bienvenidos, para poder reservar un turno por favor inicie sesion con su cuenta o registrese.</h1>
	<form action="LoginController" method="post">
		ingrese su usuario : <input type="text" name="username"> <BR>
		ingrese su contraseña : <input type="password" name="password"> <BR>
		<input type="submit" value="enviar" name= "enviar" />
		<input type="button" onclick=" location.href='http://localhost:8080/Trabajo/registro' " value="registrarse" name="registrarse" />
		<input type="button" onclick=" location.href='http://localhost:8080/Trabajo/loginadmin' " value="ingreso admin" name="ingreso admin" />
	</form>
</body>
</html>