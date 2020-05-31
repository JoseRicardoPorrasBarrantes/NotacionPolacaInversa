package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Pila {
  
     private Nodo cima ;
    private int maxElementos;
    private int numElementos;
    
    public Pila(int maximoElementos) {
        maxElementos = maximoElementos;
        numElementos = 0;    
    }
    
    //Pregunta si la pila esta vacia
    public boolean empty(){
    return cima == null;
    }
    
    //Retorna la Cima sin eliminar
    public char top() throws MisExcepxiones,Exception{
    if(cima == null)
        throw new MisExcepxiones("La lista se encuentra vacia");
     
    return (char) cima.getDato();
    
    }
    
    //Desapilar elimina la cima
    public char pop() throws MisExcepxiones,Exception{
        char dato;
    if(cima == null){
        throw new MisExcepxiones("La lista se encuentra vacia");
    }else{
    dato = (char)cima.getDato();  
   cima = cima.getSiguiente(); 
    }
   return dato;
    }
    
    //Apilar
    public char push(char dato) throws MisExcepxiones,Exception{
      if(maxElementos > 0 && numElementos == maxElementos){
      throw new MisExcepxiones("La pila esta llena");
      }else{       
    Nodo nuevo = new Nodo();
    nuevo.setDato(dato);

    if(cima == null){
     cima = nuevo;   
    }else{
    nuevo.setSiguiente(cima);
    cima = nuevo;
    }
    numElementos++;
      }
    return dato;     
    }
    
    // Indica el tamaño de la pila
    public int size(){
    return numElementos;
    }
    
    //Cantidad elementos antes del caracter que buscamos
    public int search(char datoRef) throws MisExcepxiones,Exception{
    int cont = 0;
    
    if(cima == null){
    throw new MisExcepxiones("La lista se encuentra vacia");
    }else{
    Nodo actual = cima ;
    while(actual != null){
    if((char)actual.getDato() == datoRef){
        return cont;
    }
    cont++;
    actual=actual.getSiguiente();
    }
    }
    return -1;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
