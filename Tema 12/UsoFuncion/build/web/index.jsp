<%-- 
    Document   : index
    Created on : 14 abr. 2021, 9:27:04
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
    <h1>Hello World!</h1>
    <%
     out.print(esPrimo(17));
    %>
    

  </body>
</html>
    <%!
      public static boolean esPrimo(int x) {
        for (int i=2; i<x; i++) {
          if (x%i==0) {
            return false;
          }
        }
        return true;
      }
    %>