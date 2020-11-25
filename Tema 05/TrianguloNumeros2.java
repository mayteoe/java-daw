public class TrianguloNumeros2 {
  public static void main (String[] args) {
    int tope;
    
    System.out.print("Introduzca el valor tope: ");
    tope = Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<=tope; i++) {
      for (int j=1; j<(2*i); j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    
  }
}
