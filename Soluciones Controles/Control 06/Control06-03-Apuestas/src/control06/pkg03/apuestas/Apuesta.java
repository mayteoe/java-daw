/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control06.pkg03.apuestas;

/**
 *
 * @author usuario
 */
public class Apuesta {
  private int[] numeros;
  
  public Apuesta (int a, int b, int c, int d, int e, int f) {
    //int [] aux = {a,b,c,d,e,f};
    //this.numeros = aux;

    this.numeros = new int[6];
    this.numeros[0] = a;
    this.numeros[1] = b;
    this.numeros[2] = c;
    this.numeros[3] = d;
    this.numeros[4] = e;
    this.numeros[5] = f;
       
  }
  
  public Apuesta () {
    boolean repetido;
    
    this.numeros = new int[6];
    for (int i=0; i<6; i++) {
      do {
        repetido = false;
        this.numeros[i] = (int)(Math.random()*49)+1;
        for (int j=0; j<i; j++) {
          if (this.numeros[i]==this.numeros[j]) {
            repetido = true;
            break;
          }
        }
      } while (repetido);
    }
  }
    
  public String toString() {
    String resultado = "";
    
    for (int i=0; i<6; i++) {
      resultado = resultado + this.numeros[i] + " ";
    }
    return resultado;
    
  }
  
  
  
}
