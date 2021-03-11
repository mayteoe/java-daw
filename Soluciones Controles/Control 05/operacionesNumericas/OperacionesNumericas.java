package operacionesNumericas;

public class OperacionesNumericas {
  
  public static int [] extraeImpares (int [] a) {
    int [] pares;
    int [] resultado;
    int cuentaImpares=0;
    
    pares = extraePares(a);
    resultado = new int[a.length-pares.length];
    for (int i=0; i<a.length; i++) {
      if (!encuentra(a[i],pares)) {
        resultado[cuentaImpares] = a[i];
        cuentaImpares++;
      }
    }
       
    return resultado;
  }
  
  public static int [] extraePares (int [] a) {
    int[] resultado;
    int cuentaPares=0;
    
    for (int i=0; i<a.length; i++) {
      if (esPar(a[i])) {
        cuentaPares++;
      }
    }
   
    resultado = new int[cuentaPares];
    cuentaPares = 0;
    for (int i=0; i<a.length; i++) {
      if (esPar(a[i])) {
        resultado[cuentaPares] = a[i];
        cuentaPares++;
      }
    }
    
    return resultado;
  }
  
  public static int [] colocaParesEImpares (int [] a) {
    int [] pares = extraePares(a);
    int [] impares = extraeImpares(a);
    int [] resultado = new int[a.length];
    int cont=0;
    
    for (int i=0; i<pares.length; i++) {
      resultado[i] = pares[i];
    }
    cont = pares.length;
    for (int i=0; i<impares.length; i++) {
      resultado[cont] = impares[i];
      cont++;
    }
    return resultado;
  }
  
  public static boolean esPar(int x) {
    if (x % 2 ==0) {
      return true;
    }
    return false;
  }
  
  public static boolean encuentra (int x, int [] a) {
    for (int i=0; i<a.length; i++) {
      if (x == a[i]) {
        return true;
      }
    }
    return false;
  }
  
}
