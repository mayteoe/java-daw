public class ProgramaTrozoDeArrayString {
  public static void main (String[] args) {
    String[] a = {"pera", "uva", "naranja", "mango", "cereza", "lichi", "coco"};

    String[] b = trozoDeArrayString(a, 2, 5);
    // devuelve {"naranja", "mango", "cereza", "lichi"}
    presentarArray(b);
    
    b = trozoDeArrayString(a, -3, 2);
    // devuelve {"pera", "uva", "naranja"}
    presentarArray(b);
    
    b = trozoDeArrayString(a, 7, 20);
    // devuelve { }
    presentarArray(b);
    
    b = trozoDeArrayString(a, -7, 0);
    // devuelve {"pera"}
    presentarArray(b);
    
    b = trozoDeArrayString(a, -7, -2);
    // devuelve { }
    presentarArray(b);
    
    b = trozoDeArrayString(a, 3, 3);
    // devuelve {"mango"}
    presentarArray(b);
    
    b = trozoDeArrayString(a, 6, 5);
    // devuelve { }
    presentarArray(b);
    
    b = trozoDeArrayString(a, -2, 15);
    // devuelve {"pera", "uva", "naranja", "mango", "cereza", "lichi", "coco"}
    presentarArray(b);
    

    String[] bb = { };

    b = trozoDeArrayString(bb, 0, 2);
    // devuelve { }
    presentarArray(b);

    String[] c = {"sandía"};

    b = trozoDeArrayString(c, 0, 2);
    // devuelve {"sandía"}
    presentarArray(b);
  }
  
  public static String[] trozoDeArrayString(String[] a, int inicio, int fin) {
    String [] resultado;
    int longitud = a.length;
    int nuevaLongitud = 0;
    
    if (fin < inicio) {
      int aux = inicio;
      inicio = fin;
      fin = aux;
    }
    
    if ((fin < 0) || (inicio>=longitud)) {
      resultado = new String[nuevaLongitud];
    } else {
      if (inicio <0) {
        inicio = 0;
      }
      if (fin >= longitud) {
        fin = longitud-1;
      }
      
      nuevaLongitud = fin-inicio+1;
      resultado = new String[nuevaLongitud];
      for (int i=0; i<nuevaLongitud; i++) {
        resultado[i] = a[inicio+i];
      }
      
    }
    
    
    return resultado;
  }
  
  public static void presentarArray (String[] a) {
    for (int i=0; i<a.length; i++) {
      System.out.print(a[i] + "-");
    }
    System.out.println();
  }
}
