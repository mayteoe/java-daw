public class PintaPiramideLinea {
  public static void main (String[] args) {
    int h;
    System.out.print ("Introduzca la altura de la pirámide: ");
    h = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    for (int i=0; i<h; i++) {
      System.out.print(linea(h-i-1,' ',' '));
      if (i<h-1) {
        System.out.print(linea(i*2+1,'*',' '));
      } else {
        System.out.print(linea(i*2+1,'*','*'));
      }
      System.out.println();
    }
  }
  
  public static String linea(int longitud, char extremo, char relleno) {
    String resultado ="";
   
    for (int i=0; i<longitud; i++) {
      if ((i==0) || i == (longitud-1)) {
        resultado = resultado + extremo;
      } else {
        resultado = resultado + relleno;
      }
    }
    
    return resultado;
  }

}
