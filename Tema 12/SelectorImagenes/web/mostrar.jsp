<%-- 
    Document   : mostrar
    Created on : 12 abr. 2021, 9:48:35
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Mostrando imagen</h1>
    <%
      request.setCharacterEncoding("UTF-8");
      String nombreFich = request.getParameter("fichero");
    %>
    <img src="<% out.print(nombreFich);%>.jpeg" height="400">
  </body>
</html>
