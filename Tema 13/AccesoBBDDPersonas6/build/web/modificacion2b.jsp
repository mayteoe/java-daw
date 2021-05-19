<%-- 
    Document   : alta
    Created on : 05-may-2021, 8:33:08
    Author     : usuario
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="auxiliar.Alumno"%>
<%@page import="auxiliar.MiConexionMySQL"%>
<%--
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
    <%
      MiConexionMySQL laconexion = new MiConexionMySQL();
      

      
      int dni = Integer.parseInt(request.getParameter("dni"));
      
      Alumno modificable = laconexion.consultaAlumno(dni);
      String nombre = modificable.getNombre();
      String apellido1 = modificable.getApellido1();
      String apellido2 = modificable.getApellido2();
      String ciudad = modificable.getCiudad();
    %>
    <form action="procesarModificacion.jsp" method="POST">
      DNI: <input type="number" name="dni" value=<%=dni%>><br>
      Nombre: <input type="text" name="nombre" value="<%=nombre%>"><br>
      Primer apellido: <input type="text" name="apellido1" value="<%=apellido1%>"><br>
      Segundo apellido: <input type="text" name="apellido2" value="<%=apellido2%>"><br>
      Ciudad: <select name="ciudad"><option value="">Elija opción</option>
        <%
          
          ArrayList<String> listadoCiudades = laconexion.consultaCiudades();
          
          String selected;
                   
          for (String ciudadAux : listadoCiudades) {
          
            if (ciudadAux.equals(ciudad)) {
              selected =" selected ";
            } else {
              selected = "";
            }
            %>
            <option <%=selected%> value="<%=ciudadAux%>"><%=ciudadAux%></option>
            <%
          }
            
        %>
      </select><br>
      <input type="submit" value="Modificar">
    </form>
  </body>
</html>
