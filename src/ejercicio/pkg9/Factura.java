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
public class Factura {
    private int numero=1;
    private Cliente cliente;
    private Fecha fecha;
    private LineaFactura[] lineas=new LineaFactura[10];
    
    public Factura(int numero,Cliente cliente,Fecha fecha){
    this.numero=numero;
    this.cliente=cliente;
    this.fecha=fecha;
    
    }
    
    public int getNumero(){
    return this.numero;
    
    }
    
    public Cliente getCliente(){
    return this.cliente;
    
    }
    public Fecha getFecha(){
    return this.fecha;
    }
    public LineaFactura[] getLineas(){
    return this.lineas;
    
    }
    public void setNumero(int numero){
    this.numero=numero;
    }
    
    public void setCliente (Cliente cliente){
    this.cliente=cliente;
    }
    
    public void setFecha(Fecha fecha){
    this.fecha=fecha;
    }
    
    public void setLinea(LineaFactura[] lineas){
    this.lineas=lineas;
    
    }
    public int nuevaLinea(LineaFactura lf){
    int numero=-1;
    int i=0;
    while ((i<lineas.length)&&(numero==-1)){
        if(lineas[i]==null){
         lineas[i]=lf;
         numero=i;
        }
        else if(lineas[i].getProducto().getNombre().equals(lf.getProducto().getNombre())){
               if(lf.getCantidad()>0) 
                 return lineas[i].getCantidad()+lf.getCantidad();
               else i++;
        }
        else i++;
    }
    return numero;
    }
    //Ejercicio 9D
    //imprimir una factura sin lineas (no puede pasar)
    //descuento no pueder ser mayor a 100% ni negativo
    //comprobar las longitudes de los productos(nombre tiene que ser mayor a 0) 
    public void borrarLineaNumero(int numLinea){
     
      lineas[numLinea]=null;  
    
    }
    
    public void borrarLineaNombre(String nombre){
       
      lineas[buscarProducto(nombre)]=null;
    
    }
    
    public int buscarProducto(String nombre){
    int numero=-1;
    int i=0;
    
    while ((i<lineas.length)&&(numero==-1)){
        if ( lineas[i]!=null){
            if(nombre.length()>0)
            if (lineas[i].getProducto().getNombre().equals(nombre)){
                numero=i;
                }
             else i++;
       }  else i++;
    }
    return numero;
    }
    
    public int importeTotal(){
      double operacion;
      int total=0;
      for(int i=0;i<lineas.length;i++){
          if (lineas[i]!=null){
            operacion = this.lineas[i].getCantidad()*this.lineas[i].getProducto().getPrecio();
            if((lineas[i].getDescuento()<100)&&(lineas[i].getDescuento()>0)){
                  total+=operacion -(operacion*lineas[i].getDescuento());
            }
            else total+=operacion;
          } 
      } 
      return total;
    }
    
    public double totalImpuestos(){
        
   double conimpuestos;
   
   conimpuestos=(float)(importeTotal()*0.21);
   
   return conimpuestos;
   
    }
    
    public String imprimir(){
    
    String informacion="";
    for(int i=0;i<lineas.length;i++){
        if(lineas[i]==null){
        informacion="La factura esta vacia,no tiene lineas.";
        }
        else { 
        informacion+="Numero de factura: "+this.getNumero()+"\n";
        informacion+="Fecha:"+fecha.formatoCorto()+"\n";
        informacion+="NIF del cliente: "+this.cliente.getNif()+"\n";
        informacion+="Nombre del cliente: "+this.cliente.getNombre()+"\n";
        informacion+="Direccion del cliente:"+this.cliente.getDireccion()+"\n";
        informacion+="Telefono del cliente:"+this.cliente.getTelefono()+"\n";
        informacion+="Lista de productos \n";
         for (i=0; i<lineas.length;i++){
            if (this.lineas[i]!=null){
            informacion+="Producto:"+lineas[i].getProducto().getNombre()+"\n";
            informacion+="Cantidad:"+lineas[i].getCantidad()+"\n";
            }
         }
        informacion+="Descuento aplicado:"+this.lineas[i].getDescuento();
        informacion+="Importe total:"+this.importeTotal()+"\n";
        informacion+="importe con iva:"+this.totalImpuestos()+"\n";
        
        }
    }
    return informacion;
    }
}
