public class DigitosEstanONoEstanPeor {
  public static void main (String[] arg) {
    long dato;
    boolean digito0 = false;
    boolean digito1 = false;
    boolean digito2 = false;
    boolean digito3 = false;
    boolean digito4 = false;
    boolean digito5 = false;
    boolean digito6 = false;
    boolean digito7 = false;
    boolean digito8 = false;
    boolean digito9 = false;
    
    System.out.print("Introduzca un número entero: ");
    dato = Long.parseLong(System.console().readLine());
       
    while (dato > 0) {
      int digito = (int)(dato % 10);
      switch (digito) {
        case 0:
          digito0 = true;
          break;
        case 1:
          digito1 = true;
          break;
        case 2:
          digito2 = true;
          break;
        case 3:
          digito3 = true;
          break;  
        case 4:
          digito4 = true;
          break;
        case 5:
          digito5 = true;
          break;
        case 6:
          digito6 = true;
          break;
        case 7:
          digito7 = true;
          break;
        case 8:
          digito8 = true;
          break;
        case 9:
          digito9 = true;
          break;
        default:
      }
      dato = dato / 10;
    }
    
    
    System.out.print("Dígitos que aparecen en el número: ");
    if (digito0) {
      System.out.print("0 ");
    }
    if (digito1) {
      System.out.print("1 ");
    }
    if (digito2) {
      System.out.print("2 ");
    }
    if (digito3) {
      System.out.print("3 ");
    }
    if (digito4) {
      System.out.print("4 ");
    }
    if (digito5) {
      System.out.print("5 ");
    }
    if (digito6) {
      System.out.print("6 ");
    }
    if (digito7) {
      System.out.print("7 ");
    }
    if (digito8) {
      System.out.print("8 ");
    }
    if (digito9) {
      System.out.print("9 ");
    }
    System.out.println();
    System.out.print("Dígitos que no aparecen: ");
    
    if (!digito0) {
      System.out.print("0 ");
    }
    if (!digito1) {
      System.out.print("1 ");
    }
    if (!digito2) {
      System.out.print("2 ");
    }
    if (!digito3) {
      System.out.print("3 ");
    }
    if (!digito4) {
      System.out.print("4 ");
    }
    if (!digito5) {
      System.out.print("5 ");
    }
    if (!digito6) {
      System.out.print("6 ");
    }
    if (!digito7) {
      System.out.print("7 ");
    }
    if (!digito8) {
      System.out.print("8 ");
    }
    if (!digito9) {
      System.out.print("9 ");
    }    
    
  }
}
