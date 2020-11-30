public class Ejercicio8Bid {
  public static void main (String [] args) {
    String coordenada;
    int fila, columna;
    
    System.out.print("Introduzca la posición del alfin: ");
    coordenada = System.console().readLine();
    
    columna = coordenada.charAt(0) - 'a';
    fila = coordenada.charAt(1) - '1';
    
    System.out.println("El alfil puede moverse a las siguientes posiciones:");
    
    int diferenciaFilas, diferenciaColumnas;
    
    for (int i=0; i<8; i++) {
      for (int j=0; j<8; j++) {
        diferenciaFilas = i-fila;
        if (diferenciaFilas<0) {
          diferenciaFilas = diferenciaFilas*(-1);
        }          
        diferenciaColumnas = j-columna;
        if (diferenciaColumnas<0) {
          diferenciaColumnas = diferenciaColumnas*(-1);
        }          
        if (diferenciaColumnas == diferenciaFilas && i!=fila && j!=columna){
          char columnaSalida, filaSalida;
          columnaSalida = (char)(j+'a');
          filaSalida = (char)(i+'1');
          System.out.print(""+columnaSalida+filaSalida+" ");
        }
      }
    }    
  }
}
