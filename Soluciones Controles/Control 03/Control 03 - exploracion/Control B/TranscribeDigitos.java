public class TranscribeDigitos {
  public static void main (String[] args) {
    String miFrase;
    String transcripcion="";
    String [] literales = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
    boolean salir = false;
    
    do {
      System.out.print("Introduzca una frase (a ser posible, con dígitos numéricos en ella): ");
      miFrase = System.console().readLine();
      
      for (int i=0; i<miFrase.length(); i++) {
        if (miFrase.charAt(i)>='0' && miFrase.charAt(i)<='9') {
          transcripcion = transcripcion + "[" + literales[(int)(miFrase.charAt(i))-(int)'0'] +"]";
        } else {
          transcripcion = transcripcion + miFrase.charAt(i);
        }
      }
      
      System.out.println("Frase original: "+miFrase);
      System.out.println("Frase alterada: "+transcripcion);
      System.out.println();
      
      System.out.println();
      System.out.print("¿Desea salir? (s/n): ");
      String respuesta = System.console().readLine();
      if (respuesta.equals("s")) {
        salir = true;
      } else {
        transcripcion = "";
        System.out.println();
      }
    } while (!salir);
        
    
  }
}
