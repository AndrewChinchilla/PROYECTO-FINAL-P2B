/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
//import domain.AutosDTO;
import domain.ClietesDTO;
import java.sql.*;
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
/**
 *
 * @author chinc
 */
public class ClietesDAOJDBC implements ClietesDAO{
    
    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT id_clientes, nombre, apellidos, direccion, email, telefono FROM clientes";
    private static final String SQL_INSERT = "INSERT INTO clientes(nombre, apellidos, direccion, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE clientes SET nombre=?, apellidos=?, direccion=?, email=?, telefono=? WHERE id_clientes = ?";
    private static final String SQL_DELETE = "DELETE FROM clientes WHERE id_clientes=?";
    
    
    public ClietesDAOJDBC() {

    }
     
    public ClietesDAOJDBC(Connection conexionTransaccional) {
    this.conexionTransaccional = conexionTransaccional;
    }

    @Override
    public List<ClietesDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ClietesDTO cliens = null;
        List<ClietesDTO> clien = new ArrayList<ClietesDTO>();
       
         try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_clientes = rs.getInt("id_clientes");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String direccion = rs.getString("direccion");
                String email = rs.getString("email");
                int telefono = rs.getInt("telefono");

                cliens = new ClietesDTO();
                cliens.setid_clientes(id_clientes);
                cliens.setnombre(nombre);
                cliens.setapellidos(apellidos);
                cliens.setdireccion(direccion);
                cliens.setemail(email);
                cliens.settelefono(telefono);
                

                clien.add(cliens);
            }
         }finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
    }return clien;
    }
   
  
   public int insert(ClietesDTO Cliens) throws SQLException {
         Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
         try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("ejected Query:" + SQL_INSERT);
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, Cliens.getnombre());
            stmt.setString(2, Cliens.getapellidos());
            stmt.setString(3, Cliens.getdireccion());
            stmt.setString(4, Cliens.getemail());
            stmt.setInt(5,Cliens.gettelefono());
           
            

            //System.out.println("ejected Query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Operación Realizada:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return rows;
    }
   
  public int update(ClietesDTO cliens) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
          //  System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, cliens.getnombre());
            stmt.setString(2, cliens.getapellidos());
            stmt.setString(3, cliens.getdireccion());
            stmt.setString(4, cliens.getemail());
            stmt.setInt(5, cliens.gettelefono());
            stmt.setInt(6, cliens.getid_clientes());

            System.out.println("ejecutando query: " + SQL_UPDATE);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados:" + rows);

        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return rows;
    }
     public int delete(ClietesDTO cliens) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejected Query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cliens.getid_clientes());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        return rows;
    }

}
