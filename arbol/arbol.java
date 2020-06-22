/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

/**
 *
 * @author Salvador
 */
public class arbol {
    private Nodo raiz;
    private String Recorrido;
    public arbol(){
        raiz=null;
        Recorrido="";
    }
    //metodo a envolver
    private void insertarDesde(Nodo noda,Nodo Desde){        
        if (Desde.obtenerData() == noda.obtenerData()){
            return;
        }
         if (noda.obtenerData() > Desde.obtenerData()){
             //colocar a la derecha 
             if(Desde.Der==null){
                 Desde.Der=noda;
                 return;                 
            }else{
                 //11
                  insertarDesde(noda,Desde.Der);
                  return;
             }
         }else{
         //colocar a la izqueirda 
          if (Desde.Izq==null){
            Desde.Izq=noda;
                }else{
              //colocar a la izquierda
              insertarDesde(noda,Desde.Izq);
              return;
          }
            }        
    }
    //metodo que envuelve wrapper
    public void insertar(Nodo noda){
          //es decir es el primer elemento 
          //esto pasa cuando la raiz es nula     
        if (raiz==null){
            raiz=noda;
            return ;//termina el metodo 
        }
        /////////////////
        /// si llego aqui la raiz no es nula 
        insertarDesde(noda,raiz);     
    }
    public boolean buscar(Nodo noba){
        return buscarDesde(noba,raiz);        
    }
    private boolean buscarDesde(Nodo noba,Nodo Desde){
        if(Desde==null){
            return false;
        }
        //este caso es cuando el nodo es el encontrado
        if(Desde.obtenerData()== noba.obtenerData()){
            return true;
        }
        if(noba.obtenerData()> Desde.obtenerData()){
             //derecha
             return buscarDesde(noba,Desde.Der);
        }else{
            //izquierda
            return buscarDesde(noba,Desde.Izq);
        }
    }
    /////////////////////////////////////////////////////////       ///////////////////////////////////////////////////////////////////////////////////
    public String toStringPreOrden(){
       Recorrido=" ";
       ///////////////////////////////////
       preOrderDesde(raiz );
       ///////////////////////////////////
       return Recorrido ;       
    }
    
    // tipo VID
    private void preOrderDesde(Nodo Desde){
        if(Desde==null){
            return;
        }
        // VALOR
        Recorrido=Recorrido+" "+Desde;
        //Recorrido=Recorrido+" "+Desde.obtenerData();
        //izq
        preOrderDesde(Desde.Izq);
        //Der
        preOrderDesde(Desde.Der);
    }
    ///////////////////////////////////////////////////////////////////
     public String toStringInOrden(){
       Recorrido=" ";
       ///////////////////////////////////
       inOrderDesde(raiz );
       ///////////////////////////////////
       return Recorrido ;       
    }
    //---------in-order
    private void inOrderDesde(Nodo Desde){
        if(Desde==null){
            return;
        }
        
        //izq
        inOrderDesde(Desde.Izq);
        Recorrido=Recorrido+" "+Desde;
        //Der
        inOrderDesde(Desde.Der);
    }
    /////////////////////////////////////////////////////////////////
       public String toStringPostOrden(){
       Recorrido=" ";
       ///////////////////////////////////
       postOrderDesde(raiz );
       ///////////////////////////////////
       return Recorrido ;       
    }
       private void postOrderDesde(Nodo Desde){
            if(Desde==null){
            return;
        }
            postOrderDesde(Desde.Izq);
            postOrderDesde(Desde.Der);
            Recorrido=Recorrido+" "+Desde;            
       }
}   
