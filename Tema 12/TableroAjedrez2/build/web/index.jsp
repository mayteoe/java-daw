<%-- 
    Document   : index
    Created on : 21 abr. 2021, 9:56:25
    Author     : usuario
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ajedrez.Ficha"%>
<%  
  Ficha miCaballo = new Ficha("Caballo","caballo-blanco.png");
  Ficha miAlfil; 

  do {
    miAlfil= new Ficha("Alfil","alfil-negro.png");
  } while (miAlfil.igualPosicion(miCaballo));
  
  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
        <%
          out.println();
          out.print("<tr><td></td>");
          for (int i=0; i<8; i++) {
            out.print("<td align='center'>"+(char)('a'+i)+"</td>");
          }
          out.println("<td></td></tr>");
          
          for (int i=0; i<8; i++) {
            out.print("<tr>");
            out.println("<td>"+(8-i)+"</td>");
            for (int j=0; j<8; j++) {
              out.print("<td align=\"center\" valign=\"center\" width=50 height=50 bgcolor=\""+((i+j)%2!=0?"gray":"white")+"\">");
              if (miCaballo.dameFila() == i && miCaballo.dameColumna() == j) {
                out.print("<img src=\""+miCaballo.dameRuta()+"\" height=45>");
              } else if (miAlfil.dameFila() == i && miAlfil.dameColumna() == j) {
                out.print("<img src=\""+miAlfil.dameRuta()+"\" height=45>");
              }
              out.println("</td>");
            }
            out.println("<td>"+(8-i)+"</td>");
            out.println("<tr>");
          }
          out.print("<tr><td></td>");
          for (int i=0; i<8; i++) {
            out.print("<td align='center'>"+(char)('a'+i)+"</td>");
          }
          out.print("<td></td></tr>");
          %>
        </table>
    </body>
</html>
