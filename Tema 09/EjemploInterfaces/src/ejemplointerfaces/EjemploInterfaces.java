/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

/**
 *
 * @author usuario
 */
public class EjemploInterfaces {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Persona p = new Persona ("Manuel");
    Perro q = new Perro ("Bryan");
    Persona r = new Persona ("Juan");
    
    p.llamarAtencion();
    q.llamarAtencion();
    p.llamarAAlguien(q);
    p.llamarAAlguien(r);
    q.llamarAAlguien(p);
    
  }
  
}
