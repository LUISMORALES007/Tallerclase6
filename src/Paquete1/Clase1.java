/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author lenovo
 */
public class Clase1 {
    
         /*atributos*/
    
           public int num1 =3;
           private String cadena1="luis";
           private boolean  bool1= true;
           private float flot1= 2.33f;
           public double dob1=222.545;

                /* metodos*/
           
                   public void metodoEntero1(){
                      
                        
                   System.out.println("El parametro entero clase 1 es "+ num1 );
                       
                   }
  
    
                   public void metodoString1(String cad){
                    
                       cadena1=cad;
                       
                     System.out.println("El parametro string clase 1 es "+ cadena1 );
    
                     }
                   
                    public void metodoVoid1(boolean j){
     
                      bool1=j;
                      
                       System.out.println("El parametro booleano clase 1 es "+ bool1 );
                     }
    
     
                    public void metodoFloat1(float f1){
                        
                          flot1=f1;
                          
                        System.out.println("El parametro double clase 1 es "+ flot1 );
                       
     
     
     }
                   public void metodoDouble1(){
                            
                           
                           
                            System.out.println("El parametro double clase 1 es "+ dob1 );
                   
                   
                   }
                   
                   @Override
                   public String toString(){
                   
                   return "El numero de la clase 1 es: "+ num1+"     la cadena de la clase 1 es :"+cadena1+"   el booleano de la clase 1 es "+bool1+ "   el flotante de la clase 1 es "+ flot1;
                   
                   };

    

   
    
}
