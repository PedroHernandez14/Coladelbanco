/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola2;

/**
 *
 * @author Usuario
 */
 class Pila {
    
    public Nodo inicio;
    public int tamanio;
  
    public void Pila(){
        inicio = null;
        tamanio = 0;
    }
     
    public boolean esVacia(){
        return inicio == null;
    }
    public void apilar(Cliente c){      
        Nodo nuevo = new Nodo(c);      
               
        if (esVacia()) {            
            inicio = nuevo;
        }       
        else{
            nuevo.seguirNodo=inicio;
            inicio = nuevo;
        }
       
        tamanio++;
    }
   /* public boolean buscar(String referencia){       
        Nodo aux = inicio;       
        boolean existe = false;     
        while(existe != true && aux != null){
            
            if (referencia.equals(aux.getValor())) {               
                existe = true;
            }
            else{              
                aux = aux.getSiguiente();
            }
        }
       
        return existe;
    }
    
    public void remover(String referencia){
        
        if (buscar(referencia)) {
            Nodo pilaAux = null;           
            while(referencia != inicio.getValor()){
                Nodo temp = new Nodo();                
                temp.setValor(inicio.getValor());               
                if(pilaAux == null){
                    pilaAux = temp;
                }
                else{
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                retirar();
            }
            
            retirar();
            while(pilaAux != null){
                apilar(pilaAux.getValor());
                pilaAux = pilaAux.getSiguiente();
            }
            pilaAux = null;
        }
    } *  
    public void listar(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
        
    }
    public void InvertirPila(){
      Nodo Temporal = inicio;
      Pila cc = new Pila();
      while (!esVacia()) {
          cc.apilar(inicio.valor);
          inicio = inicio.siguiente;
      }
      inicio = Temporal;
      
    }*/
    public void retirar(){
        if (!esVacia()) {          
            inicio = inicio.seguirNodo;
            tamanio--;
        }
    }
}
