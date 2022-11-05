/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import domain.AutosDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author chinc
 */
public class AutosDAOJDBC implements AutosDAO {
    
    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT id_autos, Marca, Modelo, Color, Kilometraje FROM autos";
    private static final String SQL_INSERT = "INSERT INTO autos(Marca, Modelo, Color, Kilometraje) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE autos SET Marca=?, Modelo=?, Color=?, Kilometraje=? WHERE id_autos = ?";
    private static final String SQL_DELETE = "DELETE FROM autos WHERE id_autos=?";
    
    
    public AutosDAOJDBC() {

    }
     
    public AutosDAOJDBC(Connection conexionTransaccional) {
    this.conexionTransaccional = conexionTransaccional;
    }

    @Override
    public List<AutosDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AutosDTO autos = null;
        List<AutosDTO> auto = new ArrayList<AutosDTO>();
       
         try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_autos = rs.getInt("id_autos");
                String Marca = rs.getString("Marca");
                String Modelo = rs.getString("Modelo");
                String Color = rs.getString("Color");
                int Kilometraje = rs.getInt("Kilometraje");

                autos = new AutosDTO();
                autos.setid_autos(id_autos);
                autos.setMarca(Marca);
                autos.setModelo(Modelo);
                autos.setColor(Color);
                autos.setKilometraje(Kilometraje);

                auto.add(autos);
            }
         }finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
    }return auto;
    }

    @Override
    public int insert(AutosDTO autos) throws SQLException {
         Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
         try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, autos.getMarca());
            stmt.setString(2, autos.getModelo());
            stmt.setString(3, autos.getColor());
            stmt.setInt(4, autos.getKilometraje());

            System.out.println("ejected Query:" + SQL_INSERT);
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

      public int update(AutosDTO autos) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, autos.getMarca());
            stmt.setString(2, autos.getModelo());
            stmt.setString(3, autos.getColor());
            stmt.setInt(4, autos.getKilometraje());
            stmt.setInt(5, autos.getid_autos());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return rows;
    }

    public int delete(AutosDTO autos) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, autos.getid_autos());
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
   
