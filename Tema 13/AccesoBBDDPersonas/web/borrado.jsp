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
    <title>Baja</title>
  </head>
  <body>
    <h1>Baja de usuario</h1>
    <form action="procesarBorrado.jsp" method="POST">
      DNI: <input type="number" name="dni"><br>
      
      <input type="submit" value="Dar de baja">
    </form>
  </body>
</html>
