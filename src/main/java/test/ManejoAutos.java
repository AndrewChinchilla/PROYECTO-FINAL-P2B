/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import datos.Conexion;
import datos.AutosDAO;
import datos.AutosDAOJDBC;
import domain.AutosDTO;
import java.util.List;
import java.sql.*;

/**
 *
 * @author chinc
 */
public class ManejoAutos {
    
    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            AutosDAO AutosDAO = new AutosDAOJDBC(conexion);
            
            List<AutosDTO> autos = AutosDAO.select();
            
             System.out.println("\n");
System.out.println("\t\t\t\tINVENTARIO DE AUTOS\n");
autos.forEach(Auto -> {
    
    System.out.println("REGISTROS:" + Auto);
            });
            
            conexion.commit();
            System.out.println("\n");
             System.out.println("\n");
            System.out.println("\t\t\t-->> Se ha hecho commit de su operacion <<--");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
}
