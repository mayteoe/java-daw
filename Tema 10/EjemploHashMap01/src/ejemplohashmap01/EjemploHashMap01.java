/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohashmap01;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author usuario
 */
public class EjemploHashMap01 {
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<Integer, String>();
    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");
    //System.out.println("Los elementos de m son: \n" + m);
    for (Map.Entry x: m.entrySet()) {
      System.out.println(x.getKey()+ " - " + x.getValue());
    }
  }
}
