public class EjemploPresentacionMatrizBidim {
  public static void main (String[] args) {
    int [] matriz1 = {1,2,3,4,5};
    int [][] matriz2 = {{1,2,3},{4,5,6}};
    
    presentaUnidim (matriz1);
    System.out.println();
    presentaBidim (matriz2);
    
  }

    
  public static void presentaUnidim (int [] a) {
    for (int i=0; i<a.length; i++) {
      System.out.printf("%5d",a[i]);
    }
    System.out.println();
  }  
  
  public static void presentaBidim (int[][] b) {
    for (int i=0; i<b.length; i++) {
      presentaUnidim(b[i]);
    }
  } 

}
