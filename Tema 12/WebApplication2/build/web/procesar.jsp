<%-- 
    Document   : procesar.jsp
    Created on : 12 abr. 2021, 9:27:33
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
    <h1>Recogiendo datos ...</h1>
    <%
      String parametro1;
      int parametro2;
      
      request.setCharacterEncoding("UTF-8");
      
      parametro1 = request.getParameter("nombre");
      parametro2 = Integer.parseInt(request.getParameter("numero"));
      
      for (int i=0; i<parametro2; i++) {
        out.println(parametro1+" "+(i+1) +"<br>");
      }
        
    %>
    
  </body>
</html>
