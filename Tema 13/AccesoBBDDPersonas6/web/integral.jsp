<%-- 
    Document   : index.jsp
    Created on : 04-may-2021, 12:21:10
    Author     : usuario
--%>

<%@page import="auxiliar.Alumno"%>
<%@page import="java.util.ArrayList"%>
<%@page import="auxiliar.MiConexionMySQL"%>
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
  
  <body>
  
    <h1>BBDD Personas - Tabla alumnos - Gestión integral</h1>
    
    <%
    
      MiConexionMySQL laconexion = new MiConexionMySQL();
           
      %>
      <table border=1>
      
      
        <tr><td>Dni</td><td>Nombre</td><td>Apellido1</td><td>Apellido2</td><td>Ciudad</td></tr>
      
      <tr>      
        <td><form action="procesarAlta.jsp" method="POST"><input type="number" name="dni"></td>
        <td><input type="text" name="nombre"></td>
        <td><input type="text" name="apellido1"></td>
        <td><input type="text" name="apellido2"></td>
        <td><select name="ciudad"><option value="" selected>Elija opción</option>
            <%
              ArrayList<String> listaCiudades = laconexion.consultaCiudades();
              ArrayList<Alumno> listaAlumnos = laconexion.consultaAlumnos();
              
              for (String s:listaCiudades) {
                %>
                <option value="<%=s%>"><%=s%></option>
                <%
              }
            
            %>
        </select></td>
        <td><input type="submit" value="Dar de alta"></form></td>
      </tr>
      <%
      
      for (Alumno a:listaAlumnos) {
        out.print("<tr>");
        int dni;
        String nombre, ape1, ape2, ciudad;
        dni = a.getDNI();
        nombre = a.getNombre();
        ape1 = a.getApellido1();
        ape2 = a.getApellido2();
        ciudad = a.getCiudad();
        out.print("<td>"+dni+"</td><td>"+nombre + "</td><td>"+  ape1 + "</td><td>" + ape2 +"</td><td>" + ciudad +"</td>");
        %>
        <td>
        <form action="modificacion2b.jsp" method="POST">
          <input type="hidden" name="dni" value="<%=dni%>">
          <input type="submit" value="Modificar">
        </form>
        </td>
        <td>
        <form action="procesarBorrado.jsp" method="POST">
          <input type="hidden" name="dni" value="<%=dni%>">
          <input type="submit" value="Borrar">
        </form>
        </td>
        
        </tr>
        <%
      }
      laconexion.cierraConexion();
      %>
      </table>
  </body>
</html>
      
  

