public class Ejercicio03ExRotacionDerecha {
  public static void main (String[] args) {
    int numero;
    int desplazamiento;
    int longitudNumero=0;
    
    System.out.print("Introduzca el número: ");
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el número de posiciones a rotar a la drcha: ");
    desplazamiento = Integer.parseInt(System.console().readLine());
    
    //  longitud del número
    int aux = numero;
    while (aux > 0) {
      longitudNumero++;
      aux = aux / 10;
    }
    
    for (int i=0; i<desplazamiento; i++) { // cuento el nº de desplazamientos de una unidad
      aux = numero % 10;
      numero = numero / 10;
      for (int j=0; j<longitudNumero-1; j++) {
        aux = aux*10;
      }  
      numero = aux + numero;
    }
    
    System.out.println("Resulta: "+numero);
  
  }
}
