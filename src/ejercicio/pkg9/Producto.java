/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

/**
 *
 * @author DAW
 */
public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private float precio;
    
    public Producto(String codigo,String nombre,String descripcion,int precio){
    this.codigo=codigo;
    this.nombre=nombre;
    this.descripcion=descripcion;
    this.precio=precio;
        
    
    }
    public String getCodigo(){
    return this.codigo;
    }
    public String getNombre(){
    return this.nombre;
    
    }
    
    public String getDescripcion(){
    return this.descripcion;
    
    }
    public float getPrecio(){
    return this.precio;
    } 
    
    public void setCodigo(String codigo){
    this.codigo=codigo;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public void setDescripcion(String descripcion){
    this.descripcion=descripcion;
    
    }
    public void setPrecio(float precio){
    this.precio=precio;
    }
    
}
