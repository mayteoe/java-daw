/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerodaw;

import java.util.ArrayList;

/**
 *
 * @author milan
 */
public class Almacen <Cosa>{
  private ArrayList <Cosa> articulos;
  
  public Almacen() {
    this.articulos = new ArrayList <Cosa>();
  }
  public Cosa dameArticulo(Cosa a) {
    for(int i = 0; i < this.articulos.size(); i++){
      if(this.articulos.get(i).equals(a)){
        return this.articulos.get(i);
      }
    }
    return null;
  }
  public void aniadeArticulo(Cosa art){
    this.articulos.add(art);
  }
  public void eliminaArticulo(Cosa a){
    int posicion = -1;
    for(int i = 0; i < articulos.size(); i++){
      if(a.equals(this.articulos.get(i))){
        posicion = i;//meto en posicion el indice i, para saltarlo 
      }
    }
    if(posicion != -1){
      articulos.remove(posicion);
    }
  }
  public String listado(){
    String resultado = "";
    resultado += "Listado de Articulos\n";
    resultado += "=====================\n";
    for(int i = 0; i < this.articulos.size(); i++){
      resultado += this.articulos.get(i).toString();
    }
    return resultado;
  }
}
