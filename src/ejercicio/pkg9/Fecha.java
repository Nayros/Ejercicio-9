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
public class Fecha {
        private int dia;
        private int mes;
        private int anyo;
        
        public Fecha(int dia,int mes,int anyo){
        this.dia=dia;
        this.mes=mes;
        this.anyo=anyo;
            
        
        }
        public int getDia(){
        return this.dia;
        }
         public int getMes(){
        return this.mes;
        }
         public int getAnyo(){
        return this.anyo;
        } 
         public void setDia(int dia){
         this.dia=dia;
        }
           public void setMes(int mes){
         this.mes=mes;
        }
        public void setAnyo(int anyo){
         this.anyo=anyo;
        }
        public String formatoCorto(){
        return this.dia+"-"+this.mes+"-"+this.anyo;
        
        } 
        public boolean bisiesto(){
        
        if ((this.anyo % 4 == 0) && ((this.anyo % 100 != 0) || (this.anyo % 400 == 0)))
            return true;
        else
            return false;
 
        }
  
        public boolean valida(){
        
        boolean fechaOk=true;
        
        if ((this.anyo<1900) || (this.anyo>2050)) {
            this.anyo=1900;
            fechaOk=false;            
        }
        if ((this.mes<1) || (this.mes>12)) {
            this.mes=1;                
            fechaOk=false;            
        }
        
        if ((this.dia<1) || (this.dia>31)) {
            this.dia=1;
            fechaOk=false;            
         
        } else {
            
            if (this.mes==2){
                if ((bisiesto()==false) && (this.dia>28))  {
                    this.dia=1;
                    fechaOk=false;                    
                }
                else if ((bisiesto()) && (this.dia>29))  {
                    this.dia=1;
                    fechaOk=false;                    
                }                
            }
            else if ((this.mes==4) || (this.mes==6) || (this.mes==9) || (this.mes==11)) {
                if (this.dia>30){
                    this.dia=1;
                    fechaOk=false;                    
                } 
            }
        }
            
        return fechaOk;
                
    }
        
}
