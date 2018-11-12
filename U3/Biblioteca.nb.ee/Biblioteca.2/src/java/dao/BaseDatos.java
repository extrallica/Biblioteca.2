/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author const
 */
public class BaseDatos {
	private Connection conexion;
	private String nombreBaseDatos;
	private String usuarioBaseDatos;
	private String passwordBaseDatos;

	public BaseDatos(String nombreBaseDatos, String usuarioBaseDatos, String passwordBaseDatos) {
		this.nombreBaseDatos = nombreBaseDatos;
		this.usuarioBaseDatos = usuarioBaseDatos;
		this.passwordBaseDatos = passwordBaseDatos;
	}
	
	public String hacerConexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/"+
							nombreBaseDatos,usuarioBaseDatos,passwordBaseDatos);
			return "exito";
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("error:: "+e.getMessage());
			return "error:: "+e.getMessage();
		}
	}
	
	public void cerrarConexion(){
		if (conexion != null) {
			try {
				conexion.close();
			} catch (Exception e) {
			}
		}
	}
	
	public Connection getConexion(){
		return conexion;
	}
	
}
