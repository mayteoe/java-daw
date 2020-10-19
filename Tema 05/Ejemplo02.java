public class Ejemplo02 {
  public static void main (String[] args) {
    long x = 5;
    
  
    for (int i=14; i>=0; i-- ) {
      System.out.printf("Hola %2d",i);
      x = x * (i+1);
      System.out.printf(" Valor de x: %15d\n",x);      
    }  
    
  }
}
