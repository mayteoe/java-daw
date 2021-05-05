<%-- 
    Document   : alta
    Created on : 05-may-2021, 8:33:08
    Author     : usuario
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/personas","admin", "admin");
      Statement sentencia = conexion.createStatement();
      
      String dni = request.getParameter("dni");
      
      ResultSet listado = sentencia.executeQuery ("SELECT * FROM alumnos WHERE dni="+dni);
      listado.next();
      String nombre = listado.getString("nombre");
      String apellido1 = listado.getString("apellido1");
      String apellido2 = listado.getString("apellido2");
    %>
    <form action="procesarModificacion.jsp" method="POST">
      DNI: <input type="number" name="dni" value=<%=dni%>><br>
      Nombre: <input type="text" name="nombre" value="<%=nombre%>"><br>
      Primer apellido: <input type="text" name="apellido1" value="<%=apellido1%>"><br>
      Segundo apellido: <input type="text" name="apellido2" value="<%=apellido2%>"><br>
      <input type="submit" value="Modificar">
    </form>
  </body>
</html>
