package gestisimal;
import java.util.Scanner;
/**
 * @author milan
 */
public class Gestisimal {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int opcion;
    int codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int articuloBorrar;
    Almacen<Articulo2> almacen1 = new Almacen<Articulo2>();
    Articulo2 articulo;

  do{
    System.out.print(MenuEntrada());
    System.out.print("Elija una opcion: ");
    opcion = s.nextInt();
    s.nextLine();
    switch(opcion){
      case 1:
        System.out.print(almacen1.listado());
      break;
      case 2:
        System.out.print("Introduce el codigo del nuevo articulo: ");
        codigo = s.nextInt();
        s.nextLine();
        System.out.print("Introduce la descripcion del nuevo articulo: ");
        descripcion = s.next();
        s.nextLine();
        System.out.print("Introduce el precio de compra del nuevo articulo: ");
        precioCompra = s.nextDouble();
        s.nextLine();
        System.out.print("Introduce el precio de venta del nuevo articulo: ");
        precioVenta = s.nextDouble();
        s.nextLine();
        articulo = new Articulo2(codigo, descripcion, precioCompra, precioVenta);
        almacen1.aniadeArticulo(articulo);
      break;
      case 3:
        System.out.print("Dime el codigo del articulo: ");
        articuloBorrar = s.nextInt();
        almacen1.eliminaArticulo(new Articulo2 (articuloBorrar));

      break;
      case 4:
        System.out.print("Dime el codigo del articulo: ");
        codigo = s.nextInt();
        s.nextLine();
        articulo = almacen1.dameArticulo(new Articulo2(codigo));
        if(articulo != null){
          System.out.print("Introduce la descripcion del nuevo articulo: ");
          descripcion = s.nextLine();
          s.nextLine();
          System.out.print("Introduce el precio de compra del nuevo articulo: ");
          precioCompra = s.nextDouble();
          s.nextLine();
          System.out.print("Introduce el precio de venta del nuevo articulo: ");
          precioVenta = s.nextDouble();
          s.nextLine();
          articulo.modificacion(descripcion, precioCompra, precioVenta);
        } 
      break;
      case 5:
        System.out.print("Dime el codigo del articulo que quieres incrementar el stock");
        codigo = s.nextInt();
        s.nextLine();
        articulo = almacen1.dameArticulo(new Articulo2(codigo));
        if(articulo != null){
          System.out.print("Dime la cantidad a incrementar: ");
          int incremento = s.nextInt();
          s.nextLine();
          articulo.aumentoStock(incremento);
        }
      break;
      case 6:
        System.out.print("Dime el codigo del articulo que quieres decrementar el stock");
        codigo = s.nextInt();
        s.nextLine();
        articulo = almacen1.dameArticulo(new Articulo2(codigo));
        if(articulo != null){
          System.out.print("Dime la cantidad a decrementar: ");
          int decremento = s.nextInt();
          s.nextLine();
          boolean balance = articulo.decrementoStock(decremento);
          if(balance == false){
            System.out.println("Stock insuficiente");
          }
        }
      break;
      default:
    }
  }while(opcion != 7);
  s.close();
}
  //Metodo toString para el menu de entrada
  public static String MenuEntrada(){
    String resultado = "";
    resultado += "MENU\n";
    resultado += "===========\n";
    resultado += "1.Listado\n";
    resultado += "2.Alta\n";
    resultado += "3.Baja\n";
    resultado += "4.Modificacion\n";
    resultado += "5.Entrada de mercancia\n";
    resultado += "6.Salida de mercancia\n";
    resultado += "7.Salir\n";
    return resultado;
  } 
}
    

