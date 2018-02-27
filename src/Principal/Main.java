/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Paquete1.Clase1;
import Paquete2.Clase2;
import Paquete3.Clase3;

/**
 *Taller de la clase 6
 * elaborado por : Luis miguel Morales
 */
public class Main {

    
    
    
    
    public static void main(String[] args) {
        /*declaracion objetos*/
        
        Clase1 objeto1 = new Clase1();
        Clase1 objeto2 =new Clase1();
        Clase1 objeto3 =new Clase1();
        
        Clase2 objeto4 = new Clase2();
        Clase2 objeto5 =new Clase2();
        Clase2 objeto6 =new Clase2();
        
        Clase3 objeto7 = new Clase3();
        Clase3 objeto8 =new Clase3();
        Clase3 objeto9 =new Clase3();
        
        
        
        
        
         
       /*invocar variables*/
       
               objeto1.num1=12;
               objeto2.num1=44;
               objeto3.num1=89;
               
               objeto1.dob1=546.976;
               objeto2.dob1=770.12;
               objeto3.dob1=884.986;
               
               objeto4.cadena2="Juan Jose";
               objeto5.cadena2="Antonio";
               objeto6.cadena2="Roberto";
               
               objeto7.bool3=false;
               objeto8.bool3=true;
               objeto9.bool3=false;
               
          /*llamar metodos*/
          
                objeto1.metodoEntero1();
                objeto2.metodoEntero1();
                objeto3.metodoEntero1();
                
                objeto1.metodoDouble1();
                objeto2.metodoDouble1();
                objeto3.metodoDouble1();
                
                objeto4.metodoString2();
                objeto5.metodoString2();
                objeto6.metodoString2();
                
                objeto7.metodoVoid3();
                objeto8.metodoVoid3();
                objeto9.metodoVoid3();
                
                
               objeto1.toString();
               objeto4.toString();
               objeto7.toString();
                
                
                
                
          
               
               
               
       
       
       
       
        
        
        
        
        
    }
    
}
