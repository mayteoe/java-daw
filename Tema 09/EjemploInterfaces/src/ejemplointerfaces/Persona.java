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
public class Persona implements Comunicar{
  private String nombre;
  
  public Persona (String name) {
    this.nombre = name;
  }
  
  public String dimeNombre () {
    return this.nombre;
  }
  
  public void pedirComida() {
    System.out.println("Quiero comer");
  }
  
  public void llamarAtencion() {
    System.out.println("¡¡Estoy aquí!!");
  }
  
  public void llamarAAlguien(Comunicar m) {
    System.out.println("Hola, "+m.dimeNombre());
  }
  
  
}
