public class DigitosEstanONoEstanBis {
  public static void main (String[] arg) {
    long dato;
    String estan="";
    String noEstan="";
    
    System.out.print("Introduzca un número entero: ");
    dato = Long.parseLong(System.console().readLine());
       
    for (int i=0; i<=9; i++) { // en cada pasada analizo el dígito i
      long aux = dato;
      boolean digitoEncontrado = false;
      // while (aux>0)
      while ((aux>0)&&!digitoEncontrado) {
        if ((aux % 10) == i) {
          digitoEncontrado = true;
        }
        aux = aux / 10;
      }
      if (digitoEncontrado) {
        estan = estan + i + " ";
      } else {
        noEstan = noEstan + i + " ";
      }
    }
    
    
    System.out.print("Dígitos que aparecen en el número: "+estan);
    System.out.println();
    System.out.print("Dígitos que no aparecen: "+noEstan);
     
    
  }
}
