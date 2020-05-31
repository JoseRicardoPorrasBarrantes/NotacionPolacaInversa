/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Vulkmir
 */
public class Cola<T> {
    Nodo primero , ultimo,temp;

    public Cola() {
    }        
    
    public void encolar(T elemento){
    
        if(primero == null){
            primero = ultimo = new Nodo(elemento);                        
        }else{       
           temp = new Nodo(elemento);
           ultimo.setSiguiente(temp);
           ultimo = temp;            
        }                                       
    }
    
    public T desencolar() throws VacioException{
        
        if(primero == null){
            throw new VacioException("La cola se encuentra vacía");
        }else{
            temp = primero;
            primero = primero.getSiguiente();   
            return (T) temp.getDato();
        }                
    }
    
    public int size(){
        int cont = 0;
        if(primero == null){
            return 0;
        }else{
            temp = primero;
            while(temp != null){
                cont++;
                temp = temp.getSiguiente();
            }
        }
        return cont;                
    }
    
    
    
}
