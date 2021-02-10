public class RecorridoMatrizBid {
  public static void main (String[] args) {
    int [][] valores = {{2,345,66},{3,23,67}};
    
    System.out.println(presentaComoString(valores,0));
  }

   //presenta por columnas; va seleccionando las columnas de la fila que se le pase
  public static String presentaComoString (int[] m, int pos) {
    String resultado = "";
    if (pos<m.length) {      
      String formato = "%"+4+"d";
      resultado = String.format(formato,m[pos]) + " " + presentaComoString(m,pos+1);
    } 
    return resultado;
    /* el caso base es no entrar en el if */
  }
  
  
  //va seleccionando las filas
  public static String presentaComoString (int[][] m, int fil) {
    String resultado = "";
    if (fil < m.length) {
      resultado = presentaComoString (m[fil],0) +"\n"+ presentaComoString(m,fil+1);
    }
    return resultado;
  }
}


