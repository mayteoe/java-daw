package primerodaw;

public class Persona {
  // atributos: características que modelan el objeto
  private char[] nombre;
  private float edad;
  
  
  // métodos: operaciones que permiten interactuar con los objetos
  /*
  Persona () {
  }
  */
  
  Persona () {
    this.edad = (float)0;
    this.nombre = new char[0];
  }
  
  Persona (String name) {
    this.edad = (float)0;
    this.cambiarNombre(name);
  }
  
  Persona (String name, int age) {
    this.cambiarNombre(name);
    this.edad = (float)age;
  }
  
  // métodos que modifican atributos: "setter"
  public void cambiarNombre (String newName) {
    this.nombre = new char[newName.length()];
    for (int i=0; i<newName.length(); i++) {
      this.nombre[i] = newName.charAt(i);
    }
  }
  
  public void cumpleanios() {
    this.edad = this.edad + (float)1;
  }
  
  // métodos que devuelven valores de atributos: "getter"
  public String comoTeLlamas () {
    String res = "";
    for (int i=0; i<this.nombre.length; i++) {
        res = res + this.nombre[i];
    }
    return res;
  }
  public int dimeTuEdad () {
    return (int)this.edad;
  }
  
  public String toString() {
    String resultado = "";
    resultado = "Nombre: " + this.comoTeLlamas() +"\n";
    resultado = resultado + "Edad: " + this.dimeTuEdad() + "\n";
    return resultado;
  }
  
  
  public boolean equals (Object o) {
    Persona aux = (Persona) o;
    String nombre1 = String.valueOf(this.nombre);
    String nombre2 = String.valueOf(aux.nombre);
    return (nombre1.equals(nombre2));
  }
}
