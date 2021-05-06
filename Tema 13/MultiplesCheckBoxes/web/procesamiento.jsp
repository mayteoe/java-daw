<%-- 
    Document   : procesamiento
    Created on : 06-may-2021, 11:06:03
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
    <h1>Opciones que has elegido:</h1>
    <%
      
      request.setCharacterEncoding("UTF-8");
      
      String [] opcionesElegidas = request.getParameterValues("opciones");
      
      if (opcionesElegidas == null) {
        opcionesElegidas = new String[0];
      }
      
      for (int i=0; i<opcionesElegidas.length; i++) {
        out.println(opcionesElegidas[i]+"<br>");
      }
    
    %>
  </body>
</html>
