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
public class Main {

   
    public static void main(String[] args) {
        Cliente cliente1 =new Cliente("B-21212121","Informatica manises s.I.","Avda.Blaso Ibañez nº4","963214578");
        
        Producto producto1 = new Producto("25UM58-P","LG 25UM58-P","Monitor UltraWide de 64 cm",159);
        
        Producto producto2 = new Producto("sdskssd240","sandisck ssd 240","Disco duro ssd de 240 Gb",89);
        
        Producto producto3 = new Producto ("sdskpd32","Pendrive 32 GB","Pendrive ScanDisk-32GB-USB 3.0",10);
        
       Fecha fecha= new Fecha(15,12,2017);
        
       Factura factura1 = new Factura(1,cliente1,fecha);
               
       LineaFactura lfactura = new LineaFactura(producto1,2);
       
       LineaFactura lfactura2 = new LineaFactura(producto2,10);
       
       LineaFactura lfactura3 = new LineaFactura(producto3,7);
       
       factura1.nuevaLinea(lfactura);
       
       factura1.nuevaLinea(lfactura2);
       
       factura1.nuevaLinea(lfactura3);
       
       System.out.println(factura1.imprimir());
    }
    
}
