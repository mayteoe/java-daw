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
public class Perro implements Comunicar {
  
  private String nombre;
  
  public Perro (String name) {
    this.nombre = name;
  }
  
  public String dimeNombre () {
    return this.nombre;
  }
  
  
  public void pedirComida() {
    System.out.println("Guau, guau");
  }
  
  public void llamarAtencion() {
    System.out.println("Guau, guau, guau, guau");
  }
  
  public void llamarAAlguien(Comunicar m) {
    System.out.println("Guau, guau, mucho guau");
  }
  
}
