public class TesteoPalindromo {
  public static void main (String[] args ) {
    String captura;
    
    System.out.print ("Indique frase: ");
    captura = System.console().readLine();
    
    if (esPalindromo (captura)) {
      System.out.println("Es un palíndromo - simétrico - capicúa.");
    } else {
      System.out.println("No es un palíndromo.");
    }    
  }
  
  public static boolean esPalindromo (String x) {
    boolean resultado = false;
    if (x.equals("")) {
      resultado = true;
    } else if (x.length() == 1) {
      resultado = true;
    
    /*
    } else if ((x.charAt(0) == x.charAt(x.length()-1)) && esPalindromo (x.substring(1,x.length()-1))) {
      resultado = true;
    */
      
    } else {
      int longitud = x.length();
      char caracterIzq = x.charAt(0);
      char caracterDer = x.charAt(longitud-1);
      String subcadena = x.substring(1,longitud-1);
      if ((caracterIzq == caracterDer) && esPalindromo (subcadena)) {
        resultado = true;
      }
    }
    
    return resultado;
  }
}
