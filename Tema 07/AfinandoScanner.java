import java.util.Scanner;

public class AfinandoScanner {
  public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    
    char x='$';
    String y;
    
    //x = s.next().charAt(0);
    //x = s.nextLine().charAt(0);
    do {
      y = s.nextLine();
      if (y.length()>0) {
        x = y.charAt(0);
      }
    } while (y.length()==0);
    System.out.println(x);
  }  
}
