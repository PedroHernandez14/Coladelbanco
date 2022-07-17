/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alcam
 */
public class operaciones {
    String  TiempoAgotado=("tiempo agotado"); 
    Integer tiempo=0;
    Integer tiempototal=0;
    Integer consulta=(27000);
    Integer retiro=(240);
    Integer deposito=(180);
    Integer actualizacion=(300);
    Integer pago=(120);
    Integer operacionesarealizar;
    Integer tiempodisponible=(27000);
    Integer limiteoper=0;
    public operaciones(){
        
      
    }
    public void sumartiempo(){
        if(comparar()){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de la operacion: ");
        Integer oper=sc.nextInt();
        String x=oper.toString();
        switch(oper){
        case 1: tiempo += consulta;; break;
        case 2: tiempo += retiro; break;
        case 3: tiempo += deposito; break;
        case 4: tiempo += actualizacion; break;
        case 5: tiempo += pago; break;
}
        System.out.println("Coloque 1 si quiere hacer otra operacion: ");
        int seguir=sc.nextInt();
        if(seguir==1){
           limiteoper++;
           if(limiteoper<=4){
             if(tiempo<tiempodisponible && tiempototal<tiempodisponible ){  
            sumartiempo();}
           }else{
               System.out.println("se han acabado las operaciones de este cliente");
               tiempototal+=tiempo;
               tiempo=0;
               limiteoper=0;
           }
        }else{
            tiempototal+=tiempo;
            tiempo=0;
            limiteoper=0;
        }
        
        }else{
           
            tiempo=0;
            tiempototal=0;
            limiteoper=0;
           }
        
        } 
        public boolean comparar(){
            boolean x=false;
            if(tiempototal<tiempodisponible){
                x=true;
            }
            return x;
        }
        
       
    
    void horaactual(){
        int hora=8;
        int minuto=30;
        int segundo=0;
        segundo+=tiempototal;
        while(segundo>=60){
            segundo-=60;
            minuto+=1;
        }
        while(minuto>=60){
            minuto-=60;
            hora+=1;
        }
        
       System.out.println(hora+":"+minuto+":"+segundo);
    }
    
    void operacionesimprimir(String pnombre,ColaGeneral cola, String nombrec ) throws IOException{ //convertir esto en un string que de las operaciones realizadas.
    FileReader fr=new FileReader(pnombre);
        BufferedReader br=new BufferedReader(fr);
        String linea=br.readLine();
       
        while ((linea=br.readLine())!=null)
        {
            String datos;
            datos=("/r");
            String nombre = datos;
            Cliente cliente=new Cliente(nombrec);
            cola.encolarNodo_ge(cliente);
    }
}
}