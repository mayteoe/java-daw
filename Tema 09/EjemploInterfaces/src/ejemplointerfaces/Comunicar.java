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
public interface Comunicar {
  public String dimeNombre();
  public void pedirComida();
  public void llamarAtencion();
  public void llamarAAlguien(Comunicar m);
}
