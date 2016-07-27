<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="RegistroController" method="post">
		Ingrese su nombre de usuario : <input type="text" name="usuario"> <BR>
		Ingrese su contraseña : <input type="password" name="contraseña"> <BR>
		Ingrese su direccion : <input type="text" name="direccion"> <BR>
		Ingrese su numero de telefono : <input type="text" name="telefono"> <BR>
		<input type="submit" value="aceptar" />

	</form>
</body>
</html>