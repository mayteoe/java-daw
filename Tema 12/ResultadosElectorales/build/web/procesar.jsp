<%-- 
    Document   : procesar
    Created on : 28-abr-2021, 10:11:53
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <style>
      .continente {
        display: flex;
        width: 30%;
        height: 30%;
        justify-content: center;
      }
    </style>
  </head>
  
  <body>
    <h1>Resultados</h1>
    <%
      int [] partidos = new int[5];
      int totalVotos=0;
      String [] nombrePartidos = new String[5];
      for (int i=0; i<5; i++) {
        partidos[i]=Integer.parseInt(request.getParameter("partido"+(i+1)));
        nombrePartidos[i] = "Partido "+(i+1);
        totalVotos = totalVotos + partidos[i];
      }
    %>
    <div class="continente">
      <canvas id="myChart"></canvas>
    </div>

    <script>
      var ctx = document.getElementById('myChart');
      var myChart = new Chart(ctx, {
        type: 'pie',
        data: {
          labels: [<%
                      for (int i=0; i<5; i++) {
                        out.print("'"+nombrePartidos[i]+"'");
                        if (i<4) {
                          out.print(", ");
                        }
                      }
                %>],
          datasets: [{
            label: '# of Votes',
              data: [<%
                      for (int i=0; i<5; i++) {
                        out.print(partidos[i]);
                        if (i<4) {
                          out.print(", ");
                        }
                      }
                  %>],
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],
            borderWidth: 1
          }]
        },
        options: {
          scales: {
            y: {
                beginAtZero: true
            }
          }
        }
      });
  </script>
  <table border="1">
    <tr>
      <th></th>
      <%
        for (int i=0; i<5; i++) {
          out.print("<th>"+nombrePartidos[i]+"</th>");
        }
      %>
      <th>TOTAL</th>
    </tr>
    <tr>
      <th>Votos:</th>
      <%
        for (int i=0; i<5; i++) {
          out.print("<td>"+partidos[i]+"</td>");
        }
      %>
      <td><%=totalVotos%></td>
    </tr>
    <tr>
      <th>Porcentaje:</th>
      <%
        float parcial;
        String formato;
        for (int i=0; i<5; i++) {
          parcial = partidos[i]/(float)totalVotos*100;
          formato = String.format("%.2f",parcial);
          out.print("<td>"+formato+" %</td>");
        }
      %>
      <td>100 %</td>
    </tr>
  </table>
  </body>
</html>
