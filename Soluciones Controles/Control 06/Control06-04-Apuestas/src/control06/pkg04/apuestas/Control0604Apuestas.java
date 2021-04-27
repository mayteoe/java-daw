/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control06.pkg04.apuestas;

/**
 *
 * @author usuario
 */
public class Control0604Apuestas {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Apuesta a1 = new Apuesta(5, 6, 8, 23, 24, 33);
    Apuesta a2 = new Apuesta(7, 12, 18, 21, 27, 38);
    Apuesta a3 = new Apuesta();
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    for (int i = 0; i < 10; i++) {
      System.out.println(new Apuesta());
    }
  }
  
}
