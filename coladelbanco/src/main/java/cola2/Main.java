package cola2;

import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Main {

    /*
     * aqui defino los punteros para
     * los metodos con los que manipulo las colas
     */

    public static void main(String[] args) throws IOException {
         ColaGeneral cola= new ColaGeneral();
         
        Scanner sc= new Scanner(System.in);
        archivo n1= new archivo();
        archivo n2=new archivo();
        System.out.println("existe un clientes_pendientes.in?");
        String w=sc.nextLine();
        
        if(w.equals("si")){
            System.out.println("Ubicacion: ");
            w=sc.nextLine();
            File file=new File(w);
            n1.leer(w, cola);
                file.delete();
        }
                operaciones oper=new operaciones();               
                archivo ar=new archivo();
                
                ColaComun colac=new ColaComun();
                ColaDiscapacitados colad= new ColaDiscapacitados();
                Pila pila=new Pila();
                archivo al=new archivo();
                System.out.println("Direccion del archivo con los participantes: ");
                String x=sc.nextLine();
               
                al.leer(x, cola);
                for(int i=0;i<al.tamaño;i++){
                    System.out.println("El cliente"+cola.cabeza.cliente.Nombre+" es discapacitado? escriba 1 si lo es:");
                    int y=sc.nextInt();
                    if(y==1){
                        cola.cabeza.cliente.Discapacidad=true;
                        colad.encolarNodo_dis(cola.cabeza.cliente);
                        cola.eliminar_ge();
                    }else{
                        cola.cabeza.cliente.Discapacidad=false;
                        colac.encolarNodo_comun(cola.cabeza.cliente);
                        cola.eliminar_ge();
                    }
                }
                while(colad.cabeza.cliente.Nombre!=null  || colac.cabeza.cliente.Nombre!=null) {
                    
     for(int t=0;t<4;t++){
        if(colac.cabeza.cliente.Nombre!=null){
            cola.encolarNodo_ge(colac.cabeza.cliente);       
         colac.eliminarNodo_comun();
        }       
     }
     if(colad.cabeza.cliente.Nombre!=null){
         cola.encolarNodo_ge(colad.cabeza.cliente);
         colad.eliminarNodo_dis();
     }
                    
                    
    }
for(int y=0;y<al.tamaño;y++){          
    System.out.println("Bienvenido "+cola.cabeza.cliente.Nombre+" indique que operacion va a realizar: ");
    System.out.println("1 para consulta");
    System.out.println("2 para retiro");
    System.out.println("3 para deposito");
    System.out.println("4 para actualizacion");
    System.out.println("5 para pago: ");
    oper.sumartiempo();  
    cola.eliminarNodo_ge(pila);
    if(oper.tiempototal==27000){
        y=al.tamaño;
       while(cola.cabeza.cliente.Nombre!=null){ 
        n2.crear(w, cola.cabeza.cliente.Nombre);
        cola.eliminar_ge();
       }
    }
    
}
for(int k=0;k<pila.tamanio;k++){
    ar.crear("clientesatendidos.txt", pila.inicio.cliente.Nombre);
    pila.retirar();
}
                
                
              
                
                
        }
        
        

    }
