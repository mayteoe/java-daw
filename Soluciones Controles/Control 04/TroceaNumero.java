public class TroceaNumero {
  public static void main (String[] args) {
    long number;
    
    System.out.print("Introduzca un número: ");
    number = Long.parseLong (System.console().readLine());
    
    if (cuantasCifras(number) %2 != 0) {
      System.out.println("Lo siento. El número introducido tiene longitud impar, no se puede partir en trocitos.");
    } else {
      System.out.println("Los trocitos del número son los siguientes:");
      while (number > 0) {
        System.out.println(dosCifrasIzquierda(number));
        number = quitaDosCifrasIzquierda(number);
      }
    }
    
    
  }
  
  public static int cuantasCifras (long x) {
    int cont=1;
    while (x/10>0) {
      cont++;
      x = x/10;
    }
    return cont;
  }
  
  public static int dosCifrasIzquierda (long x) {
    while (x>=100) {
      x = x / 100;
    }
    return (int)x;
  }
  
  public static long quitaDosCifrasIzquierda (long x) {
    long factor = 1;
    do {
      factor = factor * 100;
    } while (x / factor > 0);
    factor = factor /100;
    return (x % factor);
  }
}
