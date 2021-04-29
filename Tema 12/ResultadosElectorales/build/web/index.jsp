<%-- 
    Document   : index.jsp
    Created on : 28-abr-2021, 10:09:17
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
    <h1>Datos</h1>
    <form name="formulario" action="procesar.jsp" method="post">
      <%
        for (int i=0; i<5; i++) {
          %>
          Partido <%=i+1%>: <input type="text" name="partido<%=i+1%>" value="<%=(int)(Math.random()*10000)%>"><br>
          <%
        }
        %>
      <input type="submit" value="Procesar" onclick="document.formulario.action='procesar.jsp'">
      <input type="submit" value="Procesar0" onclick="document.formulario.action='procesar0.jsp'">
    </form>
  </body>
</html>
