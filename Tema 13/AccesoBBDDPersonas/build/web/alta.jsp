<%-- 
    Document   : alta
    Created on : 05-may-2021, 8:33:08
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Alta</title>
  </head>
  <body>
    <h1>Alta de usuario</h1>
    <form action="procesarAlta.jsp" method="POST">
      DNI: <input type="number" name="dni"><br>
      Nombre: <input type="text" name="nombre"><br>
      Primer apellido: <input type="text" name="apellido1"><br>
      Segundo apellido: <input type="text" name="apellido2"><br>
      <input type="submit" value="Dar de alta">
    </form>
  </body>
</html>
