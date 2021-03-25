/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestisimal;
/**
 *
 * @author milan
 */
public class Articulo2 {
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;
  //constructor
  public Articulo2(int codigo, String descripcion, double precioCompra, double precioVenta){
      this.codigo = codigo;
      this.descripcion = descripcion;
      this.precioCompra = precioCompra;
      this.precioVenta = precioVenta;
  }
  
  public Articulo2(int codigo) {
    this.codigo = codigo;
    this.descripcion = "";
    this.precioCompra=-1;
    this.precioVenta=-1;
  }
  public void modificacion(String descripcion, double precioCompra, double precioVenta){
      this.descripcion = descripcion;
      this.precioCompra = precioCompra;
      this.precioVenta = precioVenta;
  }
  /**
      * Trata de aumentar las unidades almacenadas
      * @param cantidadUnidades cantidad de unidades que queremos aumentar en el stock
      * 
    */
  public void aumentoStock(int cantidadUnidades){
      this.stock += cantidadUnidades;
  }
  /**
      * Trata de decrementar las unidades almacenadas, si no se puede decrementar devolvera false
      * @param cantidadUnidades
      * @return false si no se han podido decrementar las unidades pasada como argumento
      *         true si se han podido decrementar las unidades, ya que habia stock suficiente para hacerlo
    */
  public boolean decrementoStock(int cantidadUnidades){
    if(this.stock >= cantidadUnidades){
      this.stock -= cantidadUnidades;
      return true;
    }
    return false;
  }
  //getter y setter para atributo stock
  public int dimeTuStock(){
  return this.stock;
  }
  public int cambioDeStock(int stock){
  return this.stock = stock;
  }
  public int dimeTuCodigo(){
    return this.codigo;
  }
  //Metodo toString para la informacion del articulo
  public String toString(){
  String resultado = "";
  resultado += "***======================*** \n";
  resultado += "Codigo: " + this.codigo + "\n";
  resultado += "Descripcion: " + this.descripcion + "\n";
  resultado += "Precio de Compra: " + this.precioCompra + "\n";
  resultado += "Precio de Venta: " + this.precioVenta + "\n";
  resultado += "Stock: " + this.stock + "\n";
  resultado += "***======================*** \n";
  return resultado;
  }
  
  public boolean equals (Object a) {
    Articulo2 aux = (Articulo2)a;
    return (this.codigo == aux.codigo);
  }
}
