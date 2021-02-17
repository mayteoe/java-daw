public class TresDados {
  public static void main (String[] args) {
    final int TOPE = 3;
    final int MAX = 2;
    int [] linea = new int[TOPE];
    
    do {
      generaLinea(linea);
      presentaLinea(linea);
    } while (cuentaMaxRepeticiones(linea)<2);
    
  }
  
  public static int tiradaDado () {
    return ((int)(Math.random()*6)+1);
  }
  
  public static int cuentaMaxRepeticiones (int[] linea) {
    int cont=0;
    int aux;
    for (int i=0; i<linea.length; i++) {
      aux = cuentaRepeticiones(linea, linea[i]);
      if (aux > cont) {
        cont = aux;
      }
    }
    return cont;
  }
  
  public static void generaLinea (int[] linea) {
    for (int i=0; i<linea.length; i++) {
      linea[i] = tiradaDado();
    }
  }
  
  public static void presentaLinea (int [] linea) {
    for (int i=0; i<linea.length; i++) {
      System.out.print(linea[i]+" ");
    }
    System.out.println();
  }
  
  public static int cuentaRepeticiones(int[] linea, int x) {
    int cont = 0;
    for (int i=0; i<linea.length; i++) {
      if (x == linea[i]) {
        cont++;
      }
    }
    return cont;
  } 
  
}
