public class ExtraerAleatDeMatrizBidim {
  public static void main (String[] args) {
    int filas,columnas;
    int extremo1,extremo2;
    int[][] matrix;
    boolean[][] elegido;
    
    int cantidadAleatorios;
    
    System.out.print("Indique el tamaño de la matriz bidimensional - filas: ");
    filas = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el tamaño de la matriz bidimensional - columnas: ");
    columnas = Integer.parseInt(System.console().readLine());
    
    matrix = new int [filas][columnas];
    elegido = new boolean [filas][columnas];
    
    System.out.print("Indique extremo inferior rango aleatorio para rellenar matriz: ");
    extremo1 = Integer.parseInt(System.console().readLine());
    System.out.print("Indique extremo superior rango aleatorio para rellenar matriz: ");
    extremo2 = Integer.parseInt(System.console().readLine());
    
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        matrix[i][j] = (int)(Math.random()*(extremo2-extremo1+1)+extremo1);
        elegido[i][j] = false;
      }
    }
    
    do {
      System.out.print("Indique la cantidad de valores aleatorios que desea extraer: ");
      cantidadAleatorios = Integer.parseInt(System.console().readLine());
      if (cantidadAleatorios > (filas*columnas)) {
        System.out.print("Valor excesivo. ");
      }
    } while (cantidadAleatorios>(filas*columnas));
    
    
    System.out.println("La matriz bidimensional tiene los siguientes valores: ");
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        System.out.printf("%4d ",matrix[i][j]);        
      }
      System.out.println();
    }
    System.out.println();
    
    System.out.println("Los valores aleatoriamente obtenidos de la matriz son: ");
    int k,l;
    for (int i=0; i<cantidadAleatorios; i++) {
      do {
        k = (int) (Math.random()*filas);
        l = (int) (Math.random()*columnas);
      } while (elegido[k][l] == true);
      elegido[k][l] = true;
      System.out.print(matrix[k][l]+" ");
    }
    System.out.println();
    
  }
}
