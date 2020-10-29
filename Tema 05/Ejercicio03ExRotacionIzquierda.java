public class Ejercicio03ExRotacionIzquierda {
  public static void main (String[] args) {
    int numero;
    int desplazamiento;
    int longitudNumero=0;
    
    System.out.print("Introduzca el número: ");
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el número de posiciones a rotar a la izqda: ");
    desplazamiento = Integer.parseInt(System.console().readLine());
    
    //  longitud del número
    int aux = numero;
    while (aux > 0) {
      longitudNumero++;
      aux = aux / 10;
    }
    
    // calcular la potencia de 10 elevado a la longitud del número menos 1
    int potencia = 1;
    for (int j=0; j<longitudNumero-1; j++) {
      potencia = potencia*10;
    } 
   
    for (int i=0; i<desplazamiento; i++) { // cuento el nº de desplazamientos de una unidad
      aux = numero % potencia;
      numero = numero / potencia;
      numero = aux*10 + numero;
    }
    
    System.out.println("Resulta: "+numero);
   
  }
}
