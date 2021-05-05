<%-- 
    Document   : index.jsp
    Created on : 04-may-2021, 12:21:10
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>BBDD Personas</title>
  </head>
  <body>
    <h1>BBDD Personas - Tabla alumnos</h1>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/personas","admin", "admin");
      Statement sentencia = conexion.createStatement();
      
      ResultSet listado = sentencia.executeQuery ("SELECT * FROM alumnos");
      
      
      
      while (listado.next()) {
        int dni;
        String nombre, ape1, ape2;
        dni = Integer.parseInt(listado.getString("dni"));
        nombre = listado.getString("nombre");
        ape1 = listado.getString("apellido1");
        ape2 = listado.getString("apellido2");
        out.print(dni+": "+nombre + " "+  ape1 + " " + ape2 +"<br>");
      }
      conexion.close();

      %>
  </body>
</html>
