public class ArrayObjetos1 {
  public static void main (String[] args) {
    Persona [] conjuntoPersonas;
    
    conjuntoPersonas = new Persona[10];
    
    for (int i=0; i<10; i++) {
      conjuntoPersonas[i] = new Persona();
    }
    
    conjuntoPersonas[0].dimeTuEdad();
    
    
     
    conjuntoPersonas[0] = conjuntoPersonas[1];
    
    
    
    
  }
}
