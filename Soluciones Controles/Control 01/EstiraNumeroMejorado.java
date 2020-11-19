public class EstiraNumeroMejorado {
  public static void main (String[] args) {
    int numero;
    int estira;
    String resultado="";
    
    do {
      System.out.print("Intruduzca el número positivo a ser estirado: ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero==0) {
        System.out.print("El número cero no vale. ");
      }
    } while (numero==0);
    
    if (numero<0) {
      numero = numero *(-1);
      System.out.println("Ha introducido un valor negativo. Se considerará como positivo.");
    }
    
    do {
      System.out.print("Intruduzca el estiramiento: ");
      estira = Integer.parseInt(System.console().readLine());    
      if (estira<=0) {
        System.out.print("No acepto estiramientos negativos ni nulos. ");
      }
    } while (estira<=0);
    
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
