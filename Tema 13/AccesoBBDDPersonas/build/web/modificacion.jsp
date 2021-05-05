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
    <title>Modificación</title>
  </head>
  <body>
    <h1>Modificación de usuario</h1>
    Se entiende que se modificarán los datos del usuario correspondiente al DNI indicado.<br>
    <form action="procesarModificacion.jsp" method="POST">
      DNI: <input type="number" name="dni"><br>
      Nombre: <input type="text" name="nombre"><br>
      Primer apellido: <input type="text" name="apellido1"><br>
      Segundo apellido: <input type="text" name="apellido2"><br>
      <input type="submit" value="Modificar">
    </form>
  </body>
</html>
