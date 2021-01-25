public class RecorridosArrayBidimensional {
  public static void main (String[] args) {
    int[][] matrizBid;
    
    int fil, col;
    int valor1, valor2;
    
    System.out.println("Programa que rellena aleatoriamente una matriz y la muestra de diversas formas.");
    System.out.print("Indique nº de filas: ");
    fil = Integer.parseInt(System.console().readLine());
    System.out.print("Indique nº de columnas: ");
    col = Integer.parseInt(System.console().readLine());
    System.out.print("Indique valor 1 rango aleatorio: ");
    valor1 = Integer.parseInt(System.console().readLine());
    System.out.print("Indique valor 2 rango aleatorio: ");
    valor2 = Integer.parseInt(System.console().readLine());
    
    matrizBid = creaArrayBidimensionalRelleno(fil,col,valor1,valor2);
    
    presentaArray(matrizBid,"fila");
    System.out.println();
    presentaArray(matrizBid,"filainvertida");
    System.out.println();
    presentaArray(matrizBid,"columna");
    System.out.println();
    presentaArray(matrizBid,"columnainvertida");
    System.out.println();

  }
  
  
  public static void presentaArray (int[][] input, String formato) {
        
    switch(formato){
      case "fila":
        presentaArrayPorFilas(input,false);
        break;
       
      case "filainvertida":
        presentaArrayPorFilas(input,true);
        break;
       
      case "columna":
        presentaArrayPorColumnas(input,false);
        break;
       
      case "columnainvertida":
        presentaArrayPorColumnas(input,true);
        break;
    }
  }
  
  public static void presentaArrayPorFilas (int[][] a, boolean invertida){
    int cols = a[0].length;
    for(int i=0; i<a.length; i++){
      for(int j=0; j<a[0].length; j++){
        if (invertida) {
          System.out.printf("%4d", a[i][cols-1-j]);
        }else{
          System.out.printf("%4d", a[i][j]);
        }
      }
      System.out.println();
    }
  }
  
  public static void presentaArrayPorColumnas (int[][] a, boolean invertida){
    int fils = a.length;
    for(int i=0; i<a[0].length; i++){
      for(int j=0; j<a.length; j++){
        if (invertida) {
          System.out.printf("%4d", a[fils-1-j][i]);
        }else{
          System.out.printf("%4d", a[j][i]);
        }
      }
      System.out.println();
    }
  }
  
  public static int[][] creaArrayBidimensionalRelleno (int filas, int columnas, int valorA, int valorB) {  
    int[][] pepita;
        
    if (valorA>valorB) {
      int aux;
      aux = valorB;
      valorB = valorA;
      valorA = aux;
    }
    
    pepita = new int [filas][columnas];
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        pepita[i][j] = (int) (Math.random()*(valorB-valorA+1))+valorA;
      }
    }
    
    return pepita;
  }  
  
}
