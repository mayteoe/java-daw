<%-- 
    Document   : index
    Created on : 13 abr. 2021, 12:30:32
    Author     : javmo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%
        String euros=request.getParameter("euros");
        String ptas=request.getParameter("pesetas");
        
        long valorPtas=0;
        double valorEuros=0;
        
        if (euros == null) {
          euros = "";
        }
        
        if (ptas == null) {
          ptas = "";
        }
        
        if (!euros.equals("")) {
          // convertir a ptas
          valorEuros = Double.parseDouble(euros);
          valorPtas = (long)(valorEuros*166.386);
          valorEuros = 0;
          
        } else if (!ptas.equals("")) {
          // convertir a euros
          valorPtas = Long.parseLong(ptas);
          valorEuros = valorPtas/166.386;
          valorPtas = 0;
        }
        
        if (valorPtas ==0) {
          ptas = "";
        } else {
          ptas = String.format("%d",valorPtas);
        }
        
        if (valorEuros == 0) {
          euros = "";
        } else {
          euros = String.format("%.2f",valorEuros);
          euros = euros.replace(',','.');
        }    
        
            
            
        %>
        <form method="post" action="index.jsp">
            Euros: <input type="number" name="euros" value="<%out.print(euros);%>" step="0.01">
            Pesetas: <input type="number" name="pesetas" value="<%out.print(ptas);%>">
            <input type="submit" value="ok">
        </form>
    </body>
</html>
