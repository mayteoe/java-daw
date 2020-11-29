public class Ejercicio63 {
  public static void main (String[] args) {
  
    int altura1, altura2;
    final String BLANCO="·";
    
    System.out.print("Introduzca altura 1ª pirámide: ");
    altura1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca altura 2ª pirámide: ");
    altura2 = Integer.parseInt(System.console().readLine());
  
    
    int altMax;
    if (altura1>altura2) {
      altMax = altura1;
    } else {
      altMax = altura2;
    }
    
    int h1 = altura1 - altMax+1;
    int h2 = altura2 - altMax+1;
    
    for (int i=0; i<altMax; i++) {
      if (h1 > 0) {
        for (int j=0; j<altura1-h1; j++) {
          System.out.print(BLANCO);
        }
        for (int j=0; j<h1*2-1; j++) {
          System.out.print("*");
        }
        for (int j=0; j<altura1-h1; j++) {
          System.out.print(BLANCO);
        }
      } else {
        for (int j=0; j<2*altura1-1; j++) {
          System.out.print(BLANCO);
        }
      }
      
      h1++;
      
      System.out.print(BLANCO);
      
      if (h2 > 0) {
        for (int j=0; j<altura2-h2; j++) {
          System.out.print(BLANCO);
        }
        for (int j=0; j<h2*2-1; j++) {
          System.out.print("*");
        }
        for (int j=0; j<altura2-h2; j++) {
          System.out.print(BLANCO);
        }
      } else {
        for (int j=0; j<2*altura2-1; j++) {
          System.out.print(BLANCO);
        }
      }
      h2++;
      
      System.out.println();
      
    }
    
  
  }  
}

/*
 *                   
 *       1111222·33333*
 *       1111222·3333***
 *       111*222·33*****
 *       11***22·33*******
 *       1*****1·3*********
 *       ******* ***********
 * 
 * La base mide 2xh-1  --> espacios que se pintan antes de lleger a la altura
 * 
 * */
