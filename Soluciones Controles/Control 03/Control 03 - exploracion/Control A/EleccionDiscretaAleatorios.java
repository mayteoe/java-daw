public class EleccionDiscretaAleatorios {
  public static void main (String[] args) {
    int[] valoresUsuario;
    int tamanioValoresUsuario;
    
    int[][]matrix;
    int filas,columnas;
    
    System.out.print("Introduzca la cantidad de elementos del conjunto aleatorio base: ");
    tamanioValoresUsuario = Integer.parseInt(System.console().readLine());
    
    valoresUsuario = new int[tamanioValoresUsuario];
    
    for (int i=0; i<tamanioValoresUsuario; i++) {
      boolean repetido;
      do {
        System.out.print("Introduzca un valor aleatorio base: ");
        valoresUsuario[i] = Integer.parseInt(System.console().readLine());
        repetido = false;
        for (int j=0; j<i && !repetido; j++) {
          if (valoresUsuario[i] == valoresUsuario[j]) {
            repetido = true;
          }
        }        
        if (repetido) {
          System.out.print("Dato repetido. ");
        }
      } while (repetido);
    }
    
    System.out.println("Los valores que podrán ser elegidos aleatoriamente son los siguientes:");
    for (int i=0; i<tamanioValoresUsuario; i++) {
      System.out.printf("%4d ",valoresUsuario[i]);
    }
    
    System.out.println();
    System.out.println();
    
    System.out.print("Indique el tamaño de la matriz bidimensional a ser rellenada - filas: ");
    filas = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el tamaño de la matriz bidimensional a ser rellenada - columnas: ");
    columnas = Integer.parseInt(System.console().readLine());
    
    matrix = new int[filas][columnas];
    
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        matrix[i][j] = valoresUsuario[(int)(Math.random()*tamanioValoresUsuario)];
      }
    }
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        System.out.printf("%4d ",matrix[i][j]);
      }
      System.out.println();
    }
    
  }
}
