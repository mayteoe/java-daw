import java.util.Scanner;

public class PiedraPapelTijeraLagartoSpock {
  public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    
    String jugada1, jugada2;
    
    System.out.print("Jugador 1: ");
    jugada1 = s.nextLine();
    
    System.out.print("Jugador 2: ");
    jugada2 = s.nextLine();
    
    if (jugada1.equals(jugada2)) {
      System.out.println("Empate");
    } else {
      switch (jugada1) {
        case "piedra":
          switch (jugada2) {
            case "tijera":
            case "lagarto":
              System.out.println("Gana Juagador 1");
              break;
            case "papel":
            case "spock":
              System.out.println("Gana Juagador 2");
              break;
          }
          break;
        case "papel":
          switch (jugada2) {
            case "piedra":
            case "spock":
              System.out.println("Gana Juagador 1");
              break;
            case "lagarto":
            case "tijera":
              System.out.println("Gana Juagador 2");
              break;
          }
          break;
        case "tijera":
          switch (jugada2) {
            case "piedra":
            case "spock":
              System.out.println("Gana Juagador 1");
              break;
            case "lagarto":
            case "tijera":
              System.out.println("Gana Juagador 2");
              break;
          }
          break;
        case "lagarto":
          switch (jugada2) {
            case "papel":
            case "spock":
              System.out.println("Gana Juagador 1");
              break;
            case "tijera":
            case "piedra":
              System.out.println("Gana Juagador 2");
              break;
          }
          break;
        case "spock":
          switch (jugada2) {
            case "piedra":
            case "tijera":
              System.out.println("Gana Juagador 1");
              break;
            case "lagarto":
            case "papel":
              System.out.println("Gana Juagador 2");
              break;
          }
          break;
      }
    }
    
  }  
}
