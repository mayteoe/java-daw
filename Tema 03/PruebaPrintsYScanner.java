import java.util.Scanner;

public class PruebaPrintsYScanner {
  public static void main (String[] args) {
    int variableEntera = 457;
    float variableFlotante = (float)3.4;
    long variableEnteraLarga = 45;
    double variableFlotanteLarga = 13.344645645655;
    int vE;
    
    Scanner s = new Scanner(System.in);
    
    System.out.printf("%d %f %d %f\n",variableEntera,variableFlotante,variableEnteraLarga,variableFlotanteLarga);
    System.out.printf("%2d %10.2f %5d %5.1f\n",variableEntera,variableFlotante,variableEnteraLarga,variableFlotanteLarga);
    System.out.printf("%2d %10.2f %5d %.2f\n",variableEntera,variableFlotante,variableEnteraLarga,variableFlotanteLarga);
   
      
    vE = s.nextInt();
    
  }
  
}
