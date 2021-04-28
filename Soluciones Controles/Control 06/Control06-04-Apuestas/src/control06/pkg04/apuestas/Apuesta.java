/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control06.pkg04.apuestas;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Apuesta {
  private ArrayList<Integer> numeros;
  
  public Apuesta (int a, int b, int c, int d, int e, int f) {
    //int [] aux = {a,b,c,d,e,f};
    //this.numeros = aux;
    boolean valida=true;
    
    this.numeros = new ArrayList<Integer>();
    this.numeros.add(a);
    this.numeros.add(b);
    this.numeros.add(c);
    this.numeros.add(d);
    this.numeros.add(e);
    this.numeros.add(f);
    
    for (int i=0; i<6; i++) {
      if (this.numeros.get(i)<1 || this.numeros.get(i)>49) {
        valida = false;
        break;
      } else {
        for (int j=0; j<i; j++) {
          if (this.numeros.get(i)==this.numeros.get(j)) {
            valida = false;
            break;
          }
        }
      } 
    }
    
    if (!valida) {
      this.numeros = new ArrayList<Integer>();
    }    
       
  }
  
  public Apuesta () {
    boolean repetido;
    
    this.numeros = new ArrayList<Integer>();
    for (int i=0; i<6; i++) {
      do {
        repetido = false;
        this.numeros.add((int)(Math.random()*49)+1);
        for (int j=0; j<i; j++) {
          if (this.numeros.get(i)==this.numeros.get(j)) {
            repetido = true;
            this.numeros.remove(i);
            break;
          }
        }
      } while (repetido);
    }
  }
    
  public String toString() {
    String resultado = "";
    
    if (this.numeros.size()==0) {
      resultado = "Error: Apuesta no válida.";
    } else {
      for (int i=0; i<6; i++) {
        resultado = resultado + this.numeros.get(i) + " ";
      }
    }
    return resultado; 
  }
  
  public boolean apuestaValida() {
    if (this.numeros.size()>0) {
      return true;
    }
    return false;
  }
  
}
