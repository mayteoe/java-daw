import misArrays.ArrayBi;
public class Prueba {
  public static void main (String[] args) {
    int [][] a = ArrayBi.generaArrayBiInt (2,3,10,99);
    
    for (int i=0; i<a.length; i++) {
      for (int j=0; j<a[0].length; j++) {
        System.out.printf("%3d-",a[i][j]);
      }
      System.out.println();
    }
    
  }
}
