/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author chinc
 */
public class AutosDTO {
    private int id_autos;
    private String Marca;
    private String Modelo;
    private String Color;
    private int Kilometraje;
    
    public int getid_autos() {
        return id_autos;
    }

    public void setid_autos(int id_autos) {
        this.id_autos = id_autos;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    @Override
    public String toString() {
        return " ->> auto ->> " + "Codigo del Auto = " + id_autos + 
                "\t Marca = " + Marca +
                "\tModelo = " + Modelo + 
                "\tColor = " + Color + 
                "\tKilometraje (KM) = " + Kilometraje + '<';
    }

}


