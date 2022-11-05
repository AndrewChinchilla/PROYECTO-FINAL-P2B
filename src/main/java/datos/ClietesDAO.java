/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;
import domain.ClietesDTO;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author chinc
 */
public interface ClietesDAO {
     public List<ClietesDTO> select() throws SQLException;
    
     public int insert(ClietesDTO clientes) throws SQLException;
    
    public int update(ClietesDTO clientes) throws SQLException;
    
    public int delete(ClietesDTO clientes) throws SQLException;  
}
