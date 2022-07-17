/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola2;

/**
 *
 * @author Usuario
 */
public class Nodop {
   
  
    public String valor;
    
    public Nodop siguiente;
   
    public void Nodop(){
        this.valor=null;
        this.siguiente = null;
    }
    
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodop getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodop siguiente) {
        this.siguiente = siguiente;
    }   
} 


