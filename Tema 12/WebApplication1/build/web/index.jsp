<%-- 
    Document   : index.jsp
    Created on : 8 abr. 2021, 10:35:22
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
            for (int i=0; i<10; i++) {
                out.print(i+1);
                out.print(" ");
                out.print("<a href=\"pagina"+(i+1)+".html\">Mi pagaina "+(i+1)+"</a>");
                out.println();
                //out.print("<br>");                
                %>
                <br>
                <%
            }
        %>
        
    </body>
</html>
