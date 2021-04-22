/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author usuario
 */
public class Ficha {
  private String nombre;
  private String rutaImg;
  private int fila;
  private int columna;
  
   
  public Ficha (String name, String rute) {
    this.nombre = name;
    this.rutaImg = rute;
    this.fila = (int)(Math.random()*8);
    this.columna = (int)(Math.random()*8);
  }
  
  public int dameFila() {
    return this.fila;
  }
  
  public int dameColumna() {
    return this.columna;
  }
  
  public boolean igualPosicion(Ficha f) {
    return (this.fila==f.fila && this.columna==f.columna);
  }
  
  public String dameRuta() {
    return this.rutaImg;
  }
}
