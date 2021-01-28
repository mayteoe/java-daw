public class Mediodiagonales {
  public static void main (String [] args) {
    int[][] matrix;
    int filas,columnas;
    int rMin,rMax;
    
    int vMin,vMax;
    double vMedio;
    
    System.out.print("Introduzca el número de filas: ");
    filas = Integer.parseInt(System.console().readLine());
    do {
      System.out.print("Introduzca el número de columnas: ");
      columnas = Integer.parseInt(System.console().readLine());
    } while (columnas <=filas);
    
    matrix = new int[filas][columnas];
    
    System.out.print("Introduzca un extremo del rango aleatorio: ");
    rMin = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el otro extremo del rango aleatorio: ");
    rMax = Integer.parseInt(System.console().readLine());
    if (rMin>rMax) {
      int aux = rMin;
      rMin = rMax;
      rMax = aux;
    }
    
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        matrix[i][j] = (int)(Math.random()*(rMax-rMin+1)+rMin);
      }
    }
    
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        System.out.printf("%4d ",matrix[i][j]);
      }
      System.out.println();
    }
    
    // primera mediodiagonal
    vMin=Integer.MAX_VALUE;
    vMax=Integer.MIN_VALUE;
    vMedio=0.0;
    System.out.print("Valores Mediodiagonal:");
    for (int i=0; i<filas; i++) {
      System.out.printf("%4d ",matrix[i][i]);
      if (matrix[i][i] < vMin) {
        vMin = matrix[i][i];
      }
      if (matrix[i][i] > vMax) {
        vMax = matrix[i][i];
      }
      vMedio = vMedio + matrix[i][i];
    }
    vMedio = vMedio / filas;
    System.out.println();
    System.out.printf("Minimo: %d; Maximo: %d; Media: %.3f\n",vMin,vMax,vMedio);
    System.out.println();
   
    // segunda mediodiagonal
    vMin=Integer.MAX_VALUE;
    vMax=Integer.MIN_VALUE;
    vMedio=0.0;
    System.out.print("Valores Mediodiagonal:");
    for (int i=0; i<filas; i++) {
      System.out.printf("%4d ",matrix[i][filas-1-i]);
      if (matrix[i][filas-1-i] < vMin) {
        vMin = matrix[i][filas-1-i];
      }
      if (matrix[i][filas-1-i] > vMax) {
        vMax = matrix[i][filas-1-i];
      }
      vMedio = vMedio + matrix[i][filas-1-i];
    }
    vMedio = vMedio / filas;
    System.out.println();
    System.out.printf("Minimo: %d; Maximo: %d; Media: %.3f\n",vMin,vMax,vMedio);
    System.out.println();
   
    // tercera mediodiagonal
    vMin=Integer.MAX_VALUE;
    vMax=Integer.MIN_VALUE;
    vMedio=0.0;
    System.out.print("Valores Mediodiagonal:");
    for (int i=0; i<filas; i++) {
      System.out.printf("%4d ",matrix[i][columnas-1-i]);
      if (matrix[i][columnas-1-i] < vMin) {
        vMin = matrix[i][columnas-1-i];
      }
      if (matrix[i][columnas-1-i] > vMax) {
        vMax = matrix[i][columnas-1-i];
      }
      vMedio = vMedio + matrix[i][columnas-1-i];
    }
    vMedio = vMedio / filas;
    System.out.println();
    System.out.printf("Minimo: %d; Maximo: %d; Media: %.3f\n",vMin,vMax,vMedio);
    System.out.println();
   
    // cuarta mediodiagonal
    vMin=Integer.MAX_VALUE;
    vMax=Integer.MIN_VALUE;
    vMedio=0.0;
    System.out.print("Valores Mediodiagonal:");
    for (int i=0; i<filas; i++) {
      System.out.printf("%4d ",matrix[i][columnas-filas+i]);
      if (matrix[i][columnas-filas+i] < vMin) {
        vMin = matrix[i][columnas-filas+i];
      }
      if (matrix[i][columnas-filas+i] > vMax) {
        vMax = matrix[i][columnas-filas+i];
      }
      vMedio = vMedio + matrix[i][columnas-filas+i];
    }
    vMedio = vMedio / filas;
    System.out.println();
    System.out.printf("Minimo: %d; Maximo: %d; Media: %.3f\n",vMin,vMax,vMedio);
    System.out.println();
    
  }
}
