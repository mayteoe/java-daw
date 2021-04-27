/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control06.pkg02.complejos;

/**
 *
 * @author usuario
 */
public class Control0602Complejos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Complejo a = new Complejo(0, 0);
    Complejo b = new Complejo(-1, 5);
    Complejo c = new Complejo(4.2f, -3.68f);
    Complejo d = new Complejo(-11.11f, -22.22f);
    Complejo e = new Complejo(30, 0);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    
    Complejo c1 = a.suma(b);
    Complejo c2 = c.suma(d);
    Complejo c3 = c.multiplica(10);
    Complejo c4 = c.multiplica(d);
    Complejo c5 = d.multiplica(e);
    System.out.println();
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
  }
  
}
