
package test;
import datos.ClietesDAOJDBC;
import datos.Conexion;
import domain.ClietesDTO;
import java.sql.*;
import java.util.List;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;


/**
 *
 * @author chinc
 */
public class ManejoClientes {
    
     public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

           // UsuarioDAO UsuarioDAO = (UsuarioDAO) new UsuarioDAOJDBC(conexion);
            
            ClietesDAOJDBC ClietesDao = new ClietesDAOJDBC(conexion);
            
            List<ClietesDTO> clien = ClietesDao.select();
            System.out.println("\n");
            System.out.println("\n");
System.out.println("\t\t -->>REGISTROS  \\ CLIENTES<<--");
System.out.println("\n");
clien.forEach(user -> {
    System.out.println("->> CLIENTE: " + user);
            });
            
            conexion.commit();
            System.out.println("\t\t\t -->> Se ha hecho commit de la transaccion <<--");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("\tOjo!.. Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
}