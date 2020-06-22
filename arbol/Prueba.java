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
public class Prueba {
    public static void main (String args[]){
        arbol bonsai=new arbol();
        bonsai.insertar(new Nodo(10));
        if(bonsai.buscar(new Nodo(10))){
            System.out.println("EL 10 SI SE ENCUENTRA");
        }
        ///////////////////////////////////////
        Nodo AB;
        ///////////////////////////////////////
        AB= new Nodo(0);
          if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");  
          }
          /////////////////////////////////////////////
           AB= new Nodo(5);
           bonsai.insertar(AB);
          if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");  
          }
          ////////////////////////////////////////////
           /////////////////////////////////////////////
           AB= new Nodo(15);
           bonsai.insertar(AB);
          if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");  
          }
          ////////////////////////////////////////////
           /////////////////////////////////////////////
           AB= new Nodo(4);
           bonsai.insertar(AB);
          if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");  
          }
          ////////////////////////////////////////////
           /////////////////////////////////////////////
           AB= new Nodo(16);
           bonsai.insertar(AB);
          if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");  
          }
          ////////////////////////////////////////////
           /////////////////////////////////////////////
           AB= new Nodo(8);
           bonsai.insertar(AB);
          if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");  
          }
          ////////////////////////////////////////////
           /////////////////////////////////////////////
           AB= new Nodo(11);
           bonsai.insertar(AB);
          if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");  
          }
          ////////////////////////////////////////////
           /////////////////////////////////////////////
           AB= new Nodo(1111);
           //bonsai.insertar(AB);
          if(bonsai.buscar(AB)){
            System.out.println("EL "+AB+" SI SE ENCUENTRA");
        }else{
            System.out.println("EL "+AB+" NO SE ENCUENTRA");  
          }
          ////////////////////////////////////////////
          System.out.println("-----RECORRDIO-----");
          System.out.println("PRE-ORDER (VID)");
           System.out.println(bonsai.toStringPreOrden()); 
           System.out.println("IN-ORDER (VID)");
            System.out.println(bonsai.toStringInOrden());
           System.out.println("POST-ORDER (VID)");
             System.out.println(bonsai.toStringPostOrden());
    }
    
}
