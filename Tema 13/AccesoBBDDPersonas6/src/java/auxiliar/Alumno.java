/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

/**
 *
 * @author usuario
 */
public class Alumno {
  private int DNI;
  private String nombre;
  private String apellido1;
  private String apellido2;
  private String ciudad;
  
  public Alumno (int DNI, String nombre, String apellido1, String apellido2, String ciudad) {
    this.DNI = DNI;
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.ciudad = ciudad;
  }

  public int getDNI() {
    return DNI;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido1() {
    return apellido1;
  }

  public String getApellido2() {
    return apellido2;
  }

  public String getCiudad() {
    return ciudad;
  }
  
  
}

