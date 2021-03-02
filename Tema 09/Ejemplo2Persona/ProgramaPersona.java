public class ProgramaPersona {
  public static void main (String[] args) {
    Persona p,q,r;

    
    p = new Persona();
    q = new Persona("Anselmo");
    r = new Persona("Andres", 15);
    
    q.cambiarNombre("Pepito");
    q.cumpleanios();
    r.cumpleanios();
    
    System.out.println(r.comoTeLlamas() + " - " + r.dimeTuEdad());
    System.out.println(r.toString());
    System.out.println(r);
    System.out.println(q);
    r.toString();
  }  
}
