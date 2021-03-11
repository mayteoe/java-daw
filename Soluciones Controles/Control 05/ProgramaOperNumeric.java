import operacionesNumericas.OperacionesNumericas;

public class ProgramaOperNumeric {
  public static void main (String[] args) {
    int [] a = {3, 8, 1, 9, 33, 3, 9, 10, 12};
    int [] b;
    
    b = OperacionesNumericas.extraePares(a);
    // devuelve {8, 10, 12}
    muestraArrayInt(b);
    
    b = OperacionesNumericas.extraeImpares(a);
    // devuelve {3, 1, 9, 33, 3, 9}
    muestraArrayInt(b);
    
    b = OperacionesNumericas.colocaParesEImpares(a);
    // devuelve {8, 10, 12, 3, 1, 9, 33, 3, 9}
    muestraArrayInt(b);

    int[] bb = {11, 7, 5, 21};

    b = OperacionesNumericas.extraePares(bb); 
    // devuelve { }
    muestraArrayInt(b);
    
    b = OperacionesNumericas.extraeImpares(bb);
    // devuelve {11, 7, 5, 21}
    muestraArrayInt(b);
    
    b = OperacionesNumericas.colocaParesEImpares(bb);
    // devuelve {11, 7, 5, 21}
    muestraArrayInt(b);
  }
  
  public static void muestraArrayInt (int [] a) {
    for (int i=0; i<a.length; i++) {
      System.out.print(a[i] + "-");
    }
    System.out.println();
  }
}
