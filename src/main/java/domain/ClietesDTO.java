/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author chinc
 */
public class ClietesDTO {
    private int id_clientes;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private int telefono;
    
     
    public int getid_clientes() {
        return id_clientes;
    }

    public void setid_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellidos() {
        return apellidos;
    }

    public void setapellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    
    public int gettelefono() {
        return telefono;
    }

    public void settelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        
        return "INFO. CLIENTES : ->> "
                + "Codigo de Cliente = "
                + id_clientes +
                "\tNombre= "
                + nombre + 
                "\tApelidos = "
                + apellidos + 
                " \t\tDireccion = "
                + direccion +
                "\t\tEmail = " 
                + email + 
                "\tTelefono = "
                + telefono +'<';
    }
}

