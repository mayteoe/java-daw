public class Persona {
  // atributos: características que modelan el objeto
  private String nombre;
  private int edad;
  
  
  // métodos: operaciones que permiten interactuar con los objetos
  /*
  Persona () {
  }
  */
  
  Persona () {
    this.edad = 0;
    this.nombre = "";
  }
  
  Persona (String name) {
    this.edad=0;
    this.nombre = name;
  }
  
  Persona (String name, int age) {
    this.edad = age;
    this.nombre = name;
  }
  
  // métodos que modifican atributos: "setter"
  public void cambiarNombre (String newName) {
    this.nombre = newName;
  }
  
  public void cumpleanios() {
    this.edad++;
  }
  
  // métodos que devuelven valores de atributos: "getter"
  public String comoTeLlamas () {
    return this.nombre;
  }
  public int dimeTuEdad () {
    return this.edad;
  }
  
  public String toString() {
    String resultado = "";
    resultado = "Nombre: " + this.nombre +"\n";
    resultado = resultado + "Edad: " + this.edad + "\n";
    return resultado;
  }
  
}
