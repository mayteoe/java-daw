<%-- 
    Document   : index
    Created on : 22 abr. 2021, 14:01:20
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="misClases.Persona" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <%
      out.print("hola");
      Persona p = new Persona("Juan");
    %>
  </body>
</html>
