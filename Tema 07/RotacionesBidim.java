public class RotacionesBidim {
  public static void main (String[] args) {
    final int FILAS=3;
    final int COLUMNAS=6;
    final int MINIMO=23;
    final int MAXIMO=78;
    int [][] original = new int[FILAS][COLUMNAS];
    
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        original[i][j] = (int)(Math.random()*(MAXIMO-MINIMO+1))+MINIMO;
      }
    }
    
    System.out.println();
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        System.out.printf("%3d",original[i][j]);
      }
      System.out.println();
    }
    
    //rotacion por filas
    int [][] auxiliar1 = new int[FILAS][COLUMNAS];
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS-1; j++) {
        auxiliar1[i][j+1] = original[i][j];
      }
      auxiliar1[i][0] = original[i][COLUMNAS-1];
    }
    
    System.out.println();
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        System.out.printf("%3d",auxiliar1[i][j]);
      }
      System.out.println();
    }
    
    //rotacion por columnas
    int [][] auxiliar2 = new int[FILAS][COLUMNAS];
    for (int i=0; i<COLUMNAS-1; i++) {
      for (int j=0; j<FILAS; j++) {
        auxiliar2[j][i+1] = original[j][i];
      }
    }
    for (int i=0; i<FILAS; i++) {
      auxiliar2[i][0] = original[i][COLUMNAS-1];
    }
    
    System.out.println();
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        System.out.printf("%3d",auxiliar2[i][j]);
      }
      System.out.println();
    }
    
    //rotación por filas sin matriz auxiliar
    int ultimaCasilla;
    for (int i=0; i<FILAS; i++) {
      ultimaCasilla = original[i][COLUMNAS-1];
      for (int j=COLUMNAS-2; j>=0; j--) {
        original[i][j+1] = original[i][j];
      }
      original[i][0]= ultimaCasilla;
    }
    
    System.out.println();
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        System.out.printf("%3d",original[i][j]);
      }
      System.out.println();
    }
    
    //rotacion por columnas sin matriz auxiliar
    int casillaAux;
    for (int i=COLUMNAS-2; i>=0; i--) {
      for (int j=0; j<FILAS; j++) {
        casillaAux = original[j][i+1];
        original[j][i+1] = original[j][i];
        original[j][i] = casillaAux;
      }
    }
    
    System.out.println();
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        System.out.printf("%3d",original[i][j]);
      }
      System.out.println();
    }
  
  }
}
