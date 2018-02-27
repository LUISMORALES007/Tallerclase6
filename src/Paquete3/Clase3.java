/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete3;

/**
 *
 * @author lenovo
 */
public class Clase3 {
    
           /*atributos*/
    
           private int num3 =3556;
           private String cadena3="luis Miguel Morales";
           public boolean  bool3= true;
           private float flot3= 2.33f;
           private double dob3=222.545;

                  /*metodos*/
           
                   public void metodoEntero3(int n2){
                      
                   num3=n2;   
                        
                   System.out.println("El parametro entero clase 3 es "+ num3 );
                       
                   }
  
    
                   public void metodoString3(String cad2){
                    
                       cadena3=cad2;
                       
                     System.out.println("El parametro string clase 3 es "+ cadena3 );
    
                     }
                   
                    public void metodoVoid3(){
     
                      
                       System.out.println("El parametro booleano clase 3 es "+ bool3);
                     }
    
     
                    public void metodoFloat3(float f3){
                        
                          flot3=f3;
                          
                        System.out.println("El parametro double clase 3 es "+ flot3 );
                       
     
     
     }
                   public void metodoDouble3(double d3){
                            
                           dob3=d3;
                           
                            System.out.println("El parametro double clase 3 es "+ dob3 );
                   
                   
                   }
                   
                   @Override
                   public String toString(){
                   
                   return "El numero de la clase 3 es: "+ num3+"     la cadena de la clase 3 es :"+cadena3+"   el booleano de la clase 3 es "+bool3+ "   el flotante de la clase 3 es "+ flot3;
                   
                   };

    
}
