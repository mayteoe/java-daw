public class Tablero {
  public static void main (String[] args) {
    int filas, columnas;
    
    System.out.print("Introduzca el número de filas: ");
    filas = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de columnas: ");
    columnas = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++){
        if ((i+j)%2==0) {
          System.out.print("██");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
    
  }
}
