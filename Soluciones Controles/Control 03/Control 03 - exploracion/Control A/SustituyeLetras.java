public class SustituyeLetras {
  public static void main (String[] args) {
    String fraseInicial;
    char origen,destino;
    String fraseCambiada;
    boolean salir = false;
    
    System.out.print("Introduzca una frase: ");
    fraseInicial = System.console().readLine();
    do {
      
      
      System.out.print("Indique la letra que desea sustituir: ");
      origen = System.console().readLine().charAt(0);
      
      System.out.print("Indique la letra sustituta: ");
      destino = System.console().readLine().charAt(0);
      
      fraseCambiada = "";
      
      for (int i=0; i<fraseInicial.length(); i++) {
        if (fraseInicial.charAt(i) == origen) {
          fraseCambiada = fraseCambiada + destino;
        } else {
          fraseCambiada = fraseCambiada + fraseInicial.charAt(i);
        }
      }
      
      System.out.println("Frase original: "+fraseInicial);
      System.out.println("Frase alterada: "+fraseCambiada);
      System.out.println();
      System.out.print("¿Desea salir? (s/n): ");
      String respuesta = System.console().readLine();
      if (respuesta.equals("s")) {
        salir = true;
      } else {
        fraseInicial = fraseCambiada;
        System.out.println("Frase inicial: "+fraseInicial);
      }
      
    } while (!salir);
  }
}
