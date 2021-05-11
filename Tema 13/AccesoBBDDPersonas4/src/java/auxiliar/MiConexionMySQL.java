/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class MiConexionMySQL {
  private Connection conexion;
  private String servidor;
  private String baseDatos;
  private String usuario;
  private String contrasenia;
  
  public MiConexionMySQL () {
    this.servidor="localhost";
    this.baseDatos="personas";
    this.usuario="admin";
    this.contrasenia="admin";
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(MiConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
      this.conexion =DriverManager.getConnection("jdbc:mysql://"+servidor+":3306/"+baseDatos,usuario, contrasenia);
    } catch (SQLException ex) {
      Logger.getLogger(MiConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  public Statement dameManejadorSentencia(){
    try {
      return this.conexion.createStatement();
    } catch (SQLException ex) {
      Logger.getLogger(MiConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }
  
  public void cierraConexion() {
    try {
      this.conexion.close();
    } catch (SQLException ex) {
      Logger.getLogger(MiConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
