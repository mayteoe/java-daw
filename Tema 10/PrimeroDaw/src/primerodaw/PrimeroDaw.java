/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerodaw;

/**
 *
 * @author usuario
 */
public class PrimeroDaw {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Almacen<Persona> listado = new Almacen<Persona>();
    
    listado.aniadeArticulo(new Persona("Pepe"));
    listado.aniadeArticulo(new Persona("Antonio"));
    listado.aniadeArticulo(new Persona("Jose"));
    
    listado.dameArticulo(new Persona("Pepe")).cumpleanios();
    
    System.out.println(listado.listado());
    
  }
  
}
