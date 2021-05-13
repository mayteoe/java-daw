<%-- 
    Document   : procesarAlta
    Created on : 05-may-2021, 8:40:18
    Author     : usuario
--%>

<%@page import="auxiliar.MiConexionMySQL"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Proceso Baja</title>
  </head>
  <body>
    <%
      MiConexionMySQL laconexion = new MiConexionMySQL();
      Statement sentencia = laconexion.dameManejadorSentencia();
    
      String dni = request.getParameter("dni");
      
      String sqlDelete = "DELETE FROM alumnos WHERE dni="+dni;
           
      sentencia.execute(sqlDelete);
      

      laconexion.cierraConexion();
    %>
    Baja realizada.
    <br><a href="integral.jsp">Ir a general</a>
  </body>
</html>
