/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;
import domain.AutosDTO;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author chinc
 */
public interface AutosDAO {
    
    public List<AutosDTO> select() throws SQLException;
    
    public int insert(AutosDTO autos) throws SQLException;
    
    public int update(AutosDTO autos) throws SQLException;
    
    public int delete(AutosDTO autos) throws SQLException;    
}
