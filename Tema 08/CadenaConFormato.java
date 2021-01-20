public class CadenaConFormato {
  public static void main (String[] args) {
    
    System.out.printf("--->%5d - %10s\n",70,"hola");
    
    
    String resultado;
    
    resultado = String.format("--->%5d - %10s\n",70,"hola");
    System.out.println(resultado);
  }
}
