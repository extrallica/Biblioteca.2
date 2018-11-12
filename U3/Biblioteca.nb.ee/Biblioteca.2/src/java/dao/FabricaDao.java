/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author const
 */
public class FabricaDao {
	private static BaseDatos baseDatos;
	
	public static BaseDatos getBaseDatos(String n, String u, String p){
		if (baseDatos == null) {
			baseDatos = new BaseDatos(n, u, p);
		}
		return baseDatos;
	}
	
}
