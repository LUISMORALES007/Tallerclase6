/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

/**
 *
 * @author lenovo
 */
public class Clase2 {
    
           /*atributos*/
          private int num2 =379;
           public String cadena2="luis Miguel";
           private boolean  bool2= false;
           private float flot2= 267.373f;
           private double dob2=987652.545;

                 /*metodos*/
           
                   public void metodoEntero2(int n1){
                      
                   num2=n1;   
                        
                   System.out.println("El parametro entero clase 1 es "+ num2 );
                       
                   }
  
    
                   public void metodoString2(){
                    
                       
                     System.out.println("El parametro string clase 1 es "+ cadena2 );
    
                     }
                   
                    public void metodoVoid2(boolean j1){
     
                      bool2=j1;
                      
                       System.out.println("El parametro booleano clase 2 es "+ bool2 );
                     }
    
     
                    public void metodoFloat2(float f2){
                        
                          flot2=f2;
                          
                        System.out.println("El parametro double clase 2 es "+ flot2 );
                       
     
     
     }
                   public void metodoDouble2(double d2){
                            
                           dob2=d2;
                           
                            System.out.println("El parametro double clase 2 es "+ dob2 );
                   
                   
                   }
                   
                   @Override
                   public String toString(){
                   
                   return "El numero de la clase 2 es: "+ num2+"     la cadena de la clase 2 es :"+cadena2+"   el booleano de la clase 2 es "+bool2+ "   el flotante de la clase 2 es "+ flot2;
                   
                   };

    
}
