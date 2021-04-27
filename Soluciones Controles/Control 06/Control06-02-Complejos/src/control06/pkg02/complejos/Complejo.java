/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control06.pkg02.complejos;

/**
 *
 * @author usuario
 */
public class Complejo {
  private float real;
  private float imaginaria;
  
  public Complejo (float r, float i) {
    this.real = r;
    this.imaginaria = i;
  }
  
  public String toString() {
    String resultado="";
    float imaginariaAux;
    resultado = resultado + this.real;
    //imaginariaAux=this.imaginaria<0?-1*this.imaginaria:this.imaginaria;
    if (this.imaginaria < 0) {
      imaginariaAux = -this.imaginaria;
    } else {
      imaginariaAux = this.imaginaria;
    }
    
    if (this.imaginaria>0) {
      resultado = resultado + " + ";    
    } else {
      resultado = resultado + " - ";
    }
    resultado = resultado + imaginariaAux + "i";
    return resultado;
  }
  
  public Complejo suma (Complejo a) {
    Complejo resultado;
    float auxReal, auxImaginaria;
    auxReal = this.real+a.real;
    auxImaginaria = this.imaginaria+a.imaginaria;
    resultado = new Complejo (auxReal, auxImaginaria);
    return resultado;
  }
  
  // producto escalar
  public Complejo multiplica (int x) {
    Complejo resultado;
    float auxReal, auxImaginaria;
    auxReal = this.real*x;
    auxImaginaria = this.imaginaria*x;
    resultado = new Complejo (auxReal, auxImaginaria);
    return resultado;
  }
  
  //producto entre complejos
  public Complejo multiplica (Complejo c) {
    Complejo resultado;
    float auxReal, auxImaginaria;
    auxReal = this.real*c.real - this.imaginaria*c.imaginaria;
    auxImaginaria = this.real*c.imaginaria + this.imaginaria*c.real;
    resultado = new Complejo (auxReal, auxImaginaria);
    return resultado;
  }
}
