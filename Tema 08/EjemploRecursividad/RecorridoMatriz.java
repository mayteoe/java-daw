public class RecorridoMatriz {
  public static void main (String[] args) {
    int [] valores = {2,345,66,3,23,67};

    presentaPorPantalla(valores,0);
    System.out.println();
    System.out.println(presentaComoString(valores,0));
  }

  public static void presentaPorPantalla (int[] m, int pos) {
    if (pos<m.length) {      
      System.out.print(m[pos]+" ");
      presentaPorPantalla(m,pos+1);      
    } 
    /* el caso base es no entrar en el if */
  }
  
  public static String presentaComoString (int[] m, int pos) {
    String resultado = "";
    if (pos<m.length) {      
      resultado = m[pos] + " " + presentaComoString(m,pos+1);
    } 
    return resultado;
    /* el caso base es no entrar en el if */
  }
  
}


