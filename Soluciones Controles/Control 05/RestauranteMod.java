import java.util.Scanner;

/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 7. Arrays
 *
 * Ejercicio 15
 *
 * @author Luis José Sánchez, Modificado por Juan Antº Jiménez
 */
public class RestauranteMod {
  public static void main(String[] args) {

    int[] mesas = new int[10];
    int[] tamanios = {4,4,4,2,2,4,4,6,6,8}; //numero maximo de comensales por mesa

    // Rellena las mesas de forma aleatoria.
    for (int i = 0; i < 10; i++) {
      mesas[i] = (int)(Math.random() * (tamanios[i]+1));
    }

    int clientes; // número de clientes que llegan al restaurante buscando mesa
    
    Scanner s = new Scanner(System.in);
    
    do {
      MostrarOcupacion(mesas,tamanios);
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      clientes = Integer.parseInt(s.nextLine());

      System.out.println(ColocaEnMesa(mesas,tamanios,clientes));
      
    } while (clientes != -1);

  }
  
  public static void MostrarOcupacion (int[] mesas, int[] tamanios) {
    // Muestra el estado de ocupación de las mesas
    System.out.println("\n┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│Mesa nº: ");
    for (int i = 1; i < 11; i++) {
      System.out.printf("│ %2d  ", i);
    }
    System.out.println("│\n├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│Ocupación");
    for (int i=0; i<10; i++) {
      System.out.printf("│ %1d/%1d ", mesas[i],tamanios[i]);
    }
    System.out.println("│\n└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
  
  public static String ColocaEnMesa(int[] mesas, int[] tamanios, int clientes) {
    String resultado = "";
    
    if (clientes > 8) { // comprueba si el grupo de clientes es mayor a 8
        resultado = "Lo siento, no admitimos grupos de más de 8, haga grupos de";
        resultado +=" 8 personas como máximo e intente de nuevo.";
      } else if (clientes >0) {
        // Busca una mesa que esté vacía.
        int iVacia = 0;
        int iVacia2 = 0;
        boolean hayMesaVacia = false;
        boolean hayMesaVacia2 = false;
        for(int i = 9; i >= 0; i--) {
          if ((mesas[i] == 0) && (clientes<=tamanios[i])) {
            iVacia = i;
            hayMesaVacia = true;
            if ((clientes<=2) && (tamanios[i]==2)) {
              iVacia2 = i;
              hayMesaVacia2 = true;
            }
          }
        }
        
        if (hayMesaVacia2) {
          mesas[iVacia2] = clientes; // coloca a los clientes en la mesa libre para 2
          resultado = "Por favor, siéntense en la mesa número " + (iVacia2 + 1) + ".";
        } else if (hayMesaVacia) {
          mesas[iVacia] = clientes; // coloca a los clientes en la mesa libre
          resultado = "Por favor, siéntense en la mesa número " + (iVacia + 1) + ".";
        } else {
          // Busca un hueco para todo el grupo.
          int iHueco = 0;
          boolean hayHueco = false;
          for(int i = 9; i >= 0; i--) {
            if (clientes <= (tamanios[i] - mesas[i])) {
              iHueco = i;
              hayHueco = true;
            }
          }
          
          if (hayHueco) {
            mesas[iHueco] += clientes; // coloca a los clientes en el primer hueco disponible
            resultado = "Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (iHueco + 1) + ".";
          } else {
            resultado = "Lo siento, en estos momentos no queda sitio.";
          }
        }
      }   
    
    return resultado;
  }
}
