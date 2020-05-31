/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USER
 */
public class PolacaInversa<T> {
    
    Pila pila = new Pila(0);
    Cola cola = new Cola();
    Cola colaPostFija = new Cola();
    
    public void agregarNotacion(String ecuacion) throws Exception{
    
        for(int i = 0 ; i < ecuacion.length() ; i++){
            cola.encolar(ecuacion.charAt(i));
     
        }

    }
    
   
   public void dirigirElemento() throws VacioException, Exception{
   
       
   while(cola.isEmpty() == false){
   
       char elemento = (char) cola.desencolar();
       
   if(Character.isDigit( elemento) == false && Character.isAlphabetic(elemento) == false){
   
       pila.push(elemento);
       System.out.println("Agregando a la pila " + elemento);
   }else{
   
       colaPostFija.encolar(elemento);
       System.out.println("Agregando a la cola : " + elemento);
   }

   }    
       
       
   
   } 
    
    
    
    
    
}
