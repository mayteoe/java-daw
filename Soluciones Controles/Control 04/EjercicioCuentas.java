import bibliotecaCC.GestionCC;

public class EjercicioCuentas {
  public static void main (String[] args) {
    final int TOPE=5;
    int opcionMenu;
    
    String [] titulares = new String[TOPE];
    float [] saldos = new float[TOPE];
    
    for (int i=0; i<TOPE; i++) {
      System.out.print("Indique el nombre del titular "+(i+1)+": ");
      titulares[i] = System.console().readLine();
      System.out.print("Indique saldo de la cuenta de "+titulares[i]+": ");
      saldos[i] = Float.parseFloat(System.console().readLine());
    }
    do {
      opcionMenu = menu();
      
      String tituAux,tituAux2;
      String infoAux;
      float cantidadAux;
      switch (opcionMenu) {
        case 1:
          System.out.println("Listado de cuentas:");
          System.out.println(bibliotecaCC.GestionCC.informeCuentas(titulares,saldos));
          break;
        case 2:
          System.out.print("Indique el titular de la cuenta: ");
          tituAux = System.console().readLine();
          infoAux = bibliotecaCC.GestionCC.informeTitular(tituAux,titulares,saldos);
          if (infoAux.equals("")) {
            System.out.println("No se encuentra el titular.");
          } else {
            System.out.println(infoAux);
          }
          break;
        case 3:
          System.out.print("Indique el titular de la cuenta: ");
          tituAux = System.console().readLine();
          System.out.print("Indique las cantidad a ingresar: ");
          cantidadAux = Float.parseFloat(System.console().readLine());
          if (bibliotecaCC.GestionCC.ingreso(tituAux,cantidadAux,titulares,saldos)) {
            System.out.println("Operación realizada satisfactoriamente.");
          } else {
            System.out.println("No se encuentra el titular");
          }
          break;
        case 4:
          System.out.print("Indique el titular de la cuenta: ");
          tituAux = System.console().readLine();
          System.out.print("Indique las cantidad a extraer: ");
          cantidadAux = Float.parseFloat(System.console().readLine());
          if (bibliotecaCC.GestionCC.retirada(tituAux,cantidadAux,titulares,saldos)) {
            System.out.println("Operación realizada satisfactoriamente.");
          } else {
            System.out.println("No se encuentra el titular, o no hay saldo suficiente.");
          }
          break;
        case 5:
          System.out.print("Indique el titular de la cuenta de origen: ");
          tituAux = System.console().readLine();
          System.out.print("Indique el titular de la cuenta de destino: ");
          tituAux2 = System.console().readLine();
          System.out.print("Indique las cantidad a transferir: ");
          cantidadAux = Float.parseFloat(System.console().readLine());
          if (bibliotecaCC.GestionCC.traspaso(tituAux,tituAux2,cantidadAux,titulares,saldos)) {
            System.out.println("Operación realizada satisfactoriamente.");
          } else {
            System.out.println("No se encuentra algún titular, o no hay saldo suficiente en la cuenta de origen.");
          }
          break;
        default:
      }
      
    } while (opcionMenu != 6);
  }
  
  public static int menu () {
    int opcion;
    do {
      System.out.println();
      System.out.println("¿Qué desea hacer?");
      System.out.println("1. Presentar saldos de todas las cuentas");
      System.out.println("2. Presentar el saldo de una cuenta");
      System.out.println("3. Ingresar dinero en una cuenta");
      System.out.println("4. Retirar dinero de una cuenta");
      System.out.println("5. Traspasar dinero entre cuentas");
      System.out.println("6. SALIR");
      opcion = Integer.parseInt(System.console().readLine());
    } while (!(opcion>=1 && opcion<=6));
    return opcion;
  }
}
