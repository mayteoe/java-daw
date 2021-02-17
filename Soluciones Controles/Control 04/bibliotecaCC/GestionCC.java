package bibliotecaCC;

public class GestionCC {
  public static boolean ingreso (String titular, float cantidad, String[] titulares, float[]saldos) {
    int pos = indiceTitular(titular,titulares);
    if (pos != -1) {
      saldos[pos] = saldos[pos] + cantidad;
      return true;
    }
    return false;
  }
  
  public static boolean retirada (String titular, float cantidad, String[] titulares, float[]saldos) {
    int pos = indiceTitular(titular,titulares);
    if (pos != -1) {
      if (saldos[pos]>=cantidad) {
        saldos[pos] = saldos[pos] - cantidad;
        return true;
      }
    }
    return false;
  }
  
  public static boolean traspaso (String titular1, String titular2, float cantidad, String[] titulares, float[]saldos) {
    int pos1 = indiceTitular(titular1,titulares);
    int pos2 = indiceTitular(titular2,titulares);
    if ((pos1 != -1) && (pos2 != -1)) {
      if (retirada(titular1,cantidad,titulares,saldos)){
        ingreso(titular2,cantidad,titulares,saldos);
        return true;
      } 
    }
    return false;
  }
  
  public static String informeTitular (String titular, String[] titulares, float[] saldos) {
    String resultado = "";
    int pos = indiceTitular (titular, titulares);
    if (pos != -1) {
      resultado = String.format("%-20s%8.2f €",titular,saldos[pos]);
    }
    return resultado;
  }
  
  public static String informeCuentas (String[]titulares, float[] saldos) {
    String resultado = "";
    for (int i=0; i<titulares.length; i++) {
      resultado = resultado + "\n" + informeTitular(titulares[i], titulares,saldos);
    }    
    return resultado;
  }
  
  public static int indiceTitular (String titular, String[] titulares) {
    int pos=-1;
    for (int i=0; i<titulares.length && pos == -1; i++) {
      if (titular.equals(titulares[i])) {
        pos = i;
      }
    }
    return pos;
  }
}
