
package parcial2pr3;


public class Arbol {
    //declaracion de variables
    Nodo raiz;
    //constructor
    public Arbol(){
            raiz=null;
    }
    //metodo para insertar un nodo en el arbol
    public void agregarNodo(int e, String no, int ed){
        Nodo nuevo =new Nodo(e,no,ed);
        if(raiz==null){
            raiz=nuevo;
        }else{
            Nodo aux=raiz;
            Nodo padre;
            while(true){
                padre=aux;
                if(e>aux.empleado){
                    aux=aux.izdo;
                    if(aux==null){
                        padre.izdo=nuevo;
                        return;
                    }
                }else{
                    aux=aux.dcho;
                    if(aux==null){
                        padre.dcho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    // metodo de preorden
    public void preOrden(Nodo r){
        if(r!=null){
            System.out.print(r.empleado+" "+r.nombre+" "+r.edad+", ");
            preOrden(r.izdo);
            preOrden(r.dcho);
            
        }}
        
        //metodo de eliminar un nodo
        
        public boolean eliminar(int e){
            Nodo aux=raiz;
            Nodo padre=raiz;
            boolean izdo=true;
            while(aux.empleado!=e){
                padre=aux;
                if(e<aux.empleado){
                    izdo=true;
                    aux=aux.izdo;
                }else{
                    izdo=false;
                    aux=aux.dcho;
                }
                if(aux==null){
                    return false;
                }
            }//fin del while
            if(aux.izdo==null && aux.dcho==null){
                if(aux==raiz){
                    raiz=null;
                }else if(izdo){
                    padre.izdo=null;
                }else{
                    padre.dcho=null;
                }
            }else if(aux.dcho==null){
                
                if(aux==raiz){
                    raiz=aux.izdo;
                }else if(izdo){
                    padre.izdo=aux.izdo;
                }else{
                    padre.dcho=aux.izdo;
                }
            }else if(aux.izdo==null){
                
                if(aux==raiz){
                    raiz=aux.dcho;
                }else if(izdo){
                    padre.izdo=aux.dcho;
                }else{
                    padre.dcho=aux.izdo;
                }
            }else{
                Nodo reemplazo=obtenerNodoreemplazo(aux);
                if(aux==raiz){
                    raiz=reemplazo;
                }else if(izdo){
                    padre.izdo=reemplazo;
                }else{
                    padre.dcho=reemplazo;
                }
                reemplazo.izdo=aux.izdo;
            }
            return true;
        }
        
       // metodo encargado de devolvernos el nodo reemplazo 
        public Nodo obtenerNodoreemplazo(Nodo nodor){
            Nodo reemplazarPadre=nodor;
            Nodo reemplazo=nodor;
            Nodo aux=nodor.dcho;
            while(aux!=null){
                reemplazarPadre=reemplazo;
                reemplazo=aux;
                aux=aux.izdo;
            }
            if(reemplazo!=nodor.dcho){
                reemplazarPadre.izdo=reemplazo.dcho;
                reemplazo.dcho=nodor.dcho;
            }
            System.out.println("el nodo reemplazo es:"+reemplazo);
            return reemplazo;
        }
        
        public boolean estavacia(){
            return raiz==null;
        }
        //metodo postorden
        
         public void postOrden(Nodo r){
        if(r!=null){
            postOrden(r.izdo);
            postOrden(r.dcho);
            System.out.print(r.empleado+" "+r.nombre+" "+r.edad+", ");
            
        }
    }
        
        
        
    
    
}


