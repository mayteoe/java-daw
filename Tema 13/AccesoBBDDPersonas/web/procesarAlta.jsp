<%-- 
    Document   : procesarAlta
    Created on : 05-may-2021, 8:40:18
    Author     : usuario
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Proceso Alta</title>
  </head>
  <body>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/personas","admin", "admin");
      Statement sentencia = conexion.createStatement();
    
      String dni = request.getParameter("dni");
      String nombre = request.getParameter("nombre");
      String apellido1 = request.getParameter("apellido1");
      String apellido2 = request.getParameter("apellido2");
                 
      String sqlInsert = "INSERT INTO alumnos VALUES ("+dni+",'"+nombre+"','"+apellido1+"','"+apellido2+"')";
           
      sentencia.execute(sqlInsert);
      

      conexion.close();
    %>
    Inserción realizada.
  </body>
</html>
