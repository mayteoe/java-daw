public class RecorridosArrayBidimensional2 {
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
    int [][] auxiliar;
    switch(formato){
      case "fila":
        presentaArray(input);
        break;
       
      case "filainvertida":
        auxiliar = invierteFilas(input);
        presentaArray(auxiliar);
        break;
       
      case "columna":
        auxiliar = traspuesta(input);
        presentaArray(auxiliar);
        break;
       
      case "columnainvertida":
        auxiliar = invierteColumnas(input);
        presentaArray(auxiliar);
        break;
    }
  }
  
  public static void presentaArray (int[][] a){
    int cols = a[0].length;
    for(int i=0; i<a.length; i++){
      for(int j=0; j<a[0].length; j++){
        System.out.printf("%4d", a[i][j]);
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
  
  public static int [][] traspuesta (int [][] a) {
    int [][] resultado;
    resultado = new int[a[0].length][a.length];
    for (int i=0; i<a.length; i++) {
      for (int j=0; j<a[0].length; j++) {
        resultado[j][i] = a[i][j];
      }
    }
    return resultado;
  }
  
  public static int [][] invierteFilas (int[][] a) {
    int[][] aux=new int[a.length][a[0].length];
    int caux=0;
    for(int i=0;i<a.length;i++) {
      for(int j=a[0].length-1;j>=0;j--) {
        aux[i][j]=a[i][a[0].length-1-j];
      }
    }   
    return aux;
  }
  
  public static int [][] invierteColumnas (int[][] a) {
    int [][]resultado;
    resultado = traspuesta(a);
    resultado = invierteFilas(resultado);
    return resultado;
    
    /*
    a = traspuesta(a);
    a = invierteFilas(a);
    return a;
    */
  }
}
