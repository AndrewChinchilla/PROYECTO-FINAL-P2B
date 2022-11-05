/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import datos.Conexion;
import datos.UsuarioDAO;
import datos.UsuarioDAOJDBC;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.List;

/**
 *
 * @author chinc
 */
public class ManejoUsuarios {
    
     public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

           // UsuarioDAO UsuarioDAO = (UsuarioDAO) new UsuarioDAOJDBC(conexion);
            
            UsuarioDAOJDBC UsuarioDao = new UsuarioDAOJDBC(conexion);
            
            List<UsuarioDTO> User = UsuarioDao.select();
            System.out.println("\n");
            System.out.println("\n");
System.out.println("\t\t -->>LOGIN USUARIOS \\ INICIO SESION<<--");
System.out.println("\n");
User.forEach(user -> {
    System.out.println("->> USUARIO: " + user);
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
