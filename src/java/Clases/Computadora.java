/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Christian
 */
public class Computadora {
 
    
     private String modelo;
    private String tamañoPantalla;
    private String cantidadRam;
    private String almacenamiento;
    private String sistemaOperativo;
    private String marcaCodigo;
    private int tipo;

    
    public Computadora(String modelo, String tamañoPantalla, String cantidadRam, String almacenamiento, String sistemaOperativo,String marcaCodigo, int tipo){
        this.modelo=modelo;
        this.tamañoPantalla=tamañoPantalla;
        this.cantidadRam=cantidadRam;
        this.almacenamiento=almacenamiento;
        this.sistemaOperativo=sistemaOperativo;     
        this.marcaCodigo=marcaCodigo;     
        this.tipo=tipo;   
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getCantidadRam() {
        return cantidadRam;
    }

    public void setCantidadRam(String cantidadRam) {
        this.cantidadRam = cantidadRam;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarcaCodigo() {
        return marcaCodigo;
    }

    public void setMarcaCodigo(String marcaCodigo) {
        this.marcaCodigo = marcaCodigo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
