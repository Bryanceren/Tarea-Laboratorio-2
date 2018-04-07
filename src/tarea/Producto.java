/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author Familia
 */
public class Producto {
    private String nombre;
    private String proveedor;
    private String empresa;
    private String administrador;
    private int cantidad;
    private float precio;
    
    public Producto() {
    }

    public Producto(String nombre, String proveedor, String empresa, String administrador, int cantidad, float precio) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.empresa = empresa;
        this.administrador = administrador;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getAdministrador() {
        return administrador;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    
}
