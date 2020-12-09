public class PruebaPrints {
  public static void main (String[] args) {
    int variableEntera = 457;
    float variableFlotante = (float)3.4;
    long variableEnteraLarga = 45;
    double variableFlotanteLarga = 13.344645645655;
    
    System.out.printf("%d %f %d %f\n",variableEntera,variableFlotante,variableEnteraLarga,variableFlotanteLarga);
    System.out.printf("%2d %10.2f %5d %5.1f\n",variableEntera,variableFlotante,variableEnteraLarga,variableFlotanteLarga);
    System.out.printf("%2d %10.2f %5d %.2f\n",variableEntera,variableFlotante,variableEnteraLarga,variableFlotanteLarga);
    
  }
  
}
