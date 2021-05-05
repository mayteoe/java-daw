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

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>BBDD Personas</title>
  </head>
  
    <h1>BBDD Personas - Tabla alumnos - Borrado</h1>
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/personas","admin", "admin");
      Statement sentencia = conexion.createStatement();
      
      ResultSet listado = sentencia.executeQuery ("SELECT * FROM alumnos");
      
      
      out.print("<table border=1>");
      while (listado.next()) {
        out.print("<tr>");
        int dni;
        String nombre, ape1, ape2;
        dni = Integer.parseInt(listado.getString("dni"));
        nombre = listado.getString("nombre");
        ape1 = listado.getString("apellido1");
        ape2 = listado.getString("apellido2");
        out.print("<td>"+dni+": </td><td>"+nombre + "</td><td>"+  ape1 + "</td><td>" + ape2 +"</td>");
        %>
        <td>
        <form action="procesarBorrado.jsp" method="POST">
          <input type="hidden" name="dni" value="<%=dni%>">
          <input type="submit" value="Borrar">
        </form>
        </td>
        <%
        out.print("</tr>");
      }
      conexion.close();
      
      out.print("</table>");

      %>
  

