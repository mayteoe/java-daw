<%-- 
    Document   : matriz.jsp
    Created on : 19 abr. 2021, 10:05:03
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
        int filas = Integer.parseInt(request.getParameter("filas"));
        int columnas = Integer.parseInt(request.getParameter("columnas"));
        int min = Integer.parseInt(request.getParameter("min"));
        int max = Integer.parseInt(request.getParameter("max"));
          
        int [][] matriz = new int[filas][columnas];
        for (int i=0; i<filas; i++) {
          for (int j=0; j<columnas; j++) {
            matriz[i][j] = (int)(Math.random()*(max-min+1))+min;         
          }
        }
        %>
        <table border="1">
        <%

        for (int i=0; i<filas; i++) {
          out.print("<tr>");
          for (int j=0; j<columnas; j++) {
            out.print("<td>"+matriz[i][j]+"</td>");
          }
          out.println("</tr>");
        }

        %>
        </table>
    </body>
</html>
