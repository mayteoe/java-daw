<%-- 
    Document   : procesarAlta
    Created on : 05-may-2021, 8:40:18
    Author     : usuario
--%>

<%@page import="auxiliar.Alumno"%>
<%@page import="auxiliar.MiConexionMySQL"%>
<%--
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Proceso Alta</title>
  </head>
  <body>
    <%
      MiConexionMySQL laconexion = new MiConexionMySQL();
     
    
      int dni = Integer.parseInt(request.getParameter("dni"));
      String nombre = request.getParameter("nombre");
      String apellido1 = request.getParameter("apellido1");
      String apellido2 = request.getParameter("apellido2");
      String ciudad = request.getParameter("ciudad");
                 
      Alumno modificable = new Alumno(dni,nombre,apellido1,apellido2,ciudad);
      
      laconexion.actualizarAlumno(modificable);

      laconexion.cierraConexion();
    %>
    Modificación realizada.
    <br><a href="integral.jsp">Ir a general</a>
  </body>
</html>
