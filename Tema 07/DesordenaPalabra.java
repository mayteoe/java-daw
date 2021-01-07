public class DesordenaPalabra {
  public static void main (String[] args) {
    String prueba = "Esto es una prueba";
    char [] prueba2 = prueba.toCharArray();
    
    String desordenada = "";
    
    System.out.println(prueba);
    
    for (int i=0; i<prueba2.length; i++) {
      int posElegida;
      do {
        posElegida = (int)(Math.random()*prueba2.length);
      } while (prueba2[posElegida] == '$');
      desordenada = desordenada + prueba2[posElegida];  
      prueba2[posElegida]='$';
    }
    
    System.out.println(desordenada);
    
    
  }
}
