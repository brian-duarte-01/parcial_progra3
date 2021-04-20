
package parcial2pr3;

import java.util.Scanner;

public class Parcial2PR3 {

    public static void main(String[] args) {
        int op=0;
        Arbol ar= new Arbol();
        do{
            Scanner in = new Scanner(System.in);
            System.out.println("\nNombre: Brian Duarte Carné: 5190-18-2532");
          System.out.println("1.-Agregar un nodo\n2.-PreOrden\n3.-postOrden\n4.- eliminar nodo \n5.-salir");
            System.out.println("elija una opcion");
            op=in.nextInt();
            
            if(op==1){
                int e;
                String no;
                int ed;
                
                //empleado 1
                e=1;
                no="brian duarte";
                ed=20;
                ar.agregarNodo(e, no, ed);
                // empleado 2
                e=2;
                no="jose perez";
                ed=21;
                ar.agregarNodo(e, no, ed);
                //empleado 3
                e=3;
                no="jose duarte";
                ed=20;
                ar.agregarNodo(e, no, ed);
                //empleado 4
                e=4;
                no="juan muralles";
                ed=26;
                ar.agregarNodo(e, no, ed);
                //empleado 5
                e=5;
                no="omar perez";
                ed=27;
                ar.agregarNodo(e, no, ed);
                
                
                System.out.println("ingrese el No. Empleado");
                e=in.nextInt();
                System.out.println("ingrese el nombre del empleado");
                no=in.nextLine();
                no=in.nextLine();
                System.out.println("ingrese la edad del empleado");
                ed=in.nextInt();
                ar.agregarNodo(e, no, ed);
                
            }
            
            if(op==2){
                 
                if(!ar.estavacia()){
                ar.preOrden(ar.raiz);
            }else{
                System.out.println("el arbol esta vacio");
            }
                
            }
            
            if(op==3){
                if(!ar.estavacia()){
                ar.postOrden(ar.raiz);
            }else{
                System.out.println("el arbol esta vacio");
            }
            }
            
            if(op==4){
                
                int e;
                
               if(!ar.estavacia()){
                   System.out.println("ingrese el no de empleado");
                   e=in.nextInt();
                   if(ar.eliminar(e)==false){
                       System.out.println("nodo no encontrado");
                   }else{
                       System.out.println("el nodo a sido eliminado");
                   }
                   
               }else{
                   System.out.println("el arbol esta vacio");
               }
               
            }
            
            
            
            
            
            
        }while(op!=5);
    }
    
}
