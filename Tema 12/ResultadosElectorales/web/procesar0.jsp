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
  </head>
  
  <body>
    <h1>Resultados</h1>
    <%
      int [] partidos = new int[5];
      String [] nombrePartidos = new String[5];
      for (int i=0; i<5; i++) {
        partidos[i]=Integer.parseInt(request.getParameter("partido"+(i+1)));
        nombrePartidos[i] = "Partido "+(i+1);
      }
    %>
    <table><td width="400">
    <div>
      <canvas id="myChart" width="100" height="100"></canvas>
    </div>
      </td></table>
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
  </body>
</html>
