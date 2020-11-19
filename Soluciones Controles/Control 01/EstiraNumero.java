public class EstiraNumero {
  public static void main (String[] args) {
    int numero;
    int estira;
    String resultado="";
        
    System.out.print("Intruduzca el número positivo a ser estirado: ");
    numero = Integer.parseInt(System.console().readLine());
    System.out.print("Intruduzca el estiramiento: ");
    estira = Integer.parseInt(System.console().readLine());    
    
    int aux = numero;
    int digito;
    
    while (aux > 0) {
      digito = aux % 10;
      for (int i=0; i<estira; i++) {
        resultado = digito + resultado;
      }
      aux = aux / 10;
    }
    System.out.println("El número "+numero+" estirado por "+estira+" es:");
    System.out.println(resultado);
    
  }
}
