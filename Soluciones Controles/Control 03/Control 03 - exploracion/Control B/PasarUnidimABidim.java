public class PasarUnidimABidim {
  public static void main (String[] args) {
    int[] origen;
    int tamanioOrigen;
    int[][] destino;
    int filasDestino,columnasDestino;
    
    System.out.print("Introduzca el tamaño de la matriz unidimensional: ");
    tamanioOrigen = Integer.parseInt(System.console().readLine());
    
    origen = new int[tamanioOrigen];
    
    for (int i=0; i<tamanioOrigen; i++) {
      System.out.print("Introduzca elemento "+(i+1)+"º: ");
      origen[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    
    System.out.print("Introduzca el tamaño de la matriz bidimensional - filas: ");
    filasDestino = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el tamaño de la matriz bidimensional - columnas: ");
    columnasDestino = Integer.parseInt(System.console().readLine());
    
    destino = new int[filasDestino][columnasDestino];
    
    int aux=0;
    for (int i=0; i<filasDestino; i++) {
      for (int j=0; j<columnasDestino; j++) {
        if (aux<tamanioOrigen) {
          destino[i][j] = origen[aux];
          aux++;
        } else {
          destino[i][j] = -1;
        }
      }
    }
    
    System.out.println();
    
    System.out.println("La matriz unidimensional de origen es: ");
    for (int i=0; i<tamanioOrigen; i++) {
      System.out.printf("%4d ",origen[i]);
    }
    System.out.println();
    System.out.println();
    
    System.out.println("La matriz bidimensional de destino queda así: ");
    for (int i=0; i<filasDestino; i++) {
      for (int j=0; j<columnasDestino; j++) {
        System.out.printf("%4d ",destino[i][j]);
      }
      System.out.println();
    }
    
    
  }
}
