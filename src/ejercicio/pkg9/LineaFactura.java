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
public class LineaFactura {
    private Producto producto;
    private int cantidad;
    private int descuento;
    
    public LineaFactura(Producto producto,int cantidad,int descuento){
    this.producto=producto;
    this.cantidad=cantidad;
    this.descuento=descuento;
    }
    public LineaFactura(Producto prodcuto,int cantidad){
    this.producto=prodcuto;
    this.cantidad=cantidad;
    this.descuento=0;
    }
          
    public Producto getProducto(){
    return this.producto;
    
    }
    
    public int getCantidad(){
    return this.cantidad;
    
    }
    public int getDescuento(){
    return this.descuento;
    }
    
    public void setProdcuto(Producto producto){
    this.producto=producto;
    
    }
    public void setCantidad(int cantidad){
    this.cantidad=cantidad;
    
    }
    public void setDescuento(int descuento){
    this.descuento=descuento;
    }
    
}
