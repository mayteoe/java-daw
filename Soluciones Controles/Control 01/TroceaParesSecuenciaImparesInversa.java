public class TroceaParesSecuenciaImparesInversa {
  public static void main (String[] args) {
    long numero;
    long pares=0;
    long impares=0;
    
    System.out.print("Introduzca el número largo positivo: ");
    numero = Long.parseLong(System.console().readLine());
    
    long aux = numero;
    int digito;
    long potencia10=1;
    
    while (aux > 0) {
      digito = (int)(aux % 10);
      if (digito %2 == 0) {
        pares = pares + digito*potencia10;
        potencia10 = potencia10*10;
      } else {
        impares = impares * 10 + digito;
      }      
      aux = aux / 10;
    }
    
    
    System.out.println("Las cifras pares del número "+numero+" son: " +pares);
    System.out.println("Las cifras impares del número "+numero+" son (en orden inverso): " +impares);
    
    
  }
}
