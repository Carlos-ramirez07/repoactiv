import java.util.Random;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Suerte {

	    public static void main(String args[])throws IOException{

	        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
	        Random Generador = new Random();

	        ListaDobleEnlazada L = new ListaDobleEnlazada();
	        
	        String Resp="";
	        int contador=4;
	        int Num=0,NumEl=0;
	        boolean Moneda=false;
	        boolean PrimerosNumeros=true;
	  
	        do{
	        	System.out.println("***Bienvenido***");
	            System.out.println("Escribe un numero:...");
	            Num=Integer.parseInt(Teclado.readLine());
	            L.agregarAlInicio(new Nodo<Integer>(Num,1));
	            if(PrimerosNumeros){
	                for(int i=0;i<4;i++){
	                    System.out.println("Escribe un numero:");
	                    Num=Integer.parseInt(Teclado.readLine());
	                    L.agregarAlInicio(new Nodo<Integer>(Num,1));
	                
	                }
	                PrimerosNumeros=false;
	            }
	            contador++;
	            System.out.println("Deseas´poner algun otro numero * S/N *");
	            Resp=Teclado.readLine(); 
	        }while(Resp.compareToIgnoreCase("S")==0);
	        System.out.println("los numeros: ");
	        System.out.println(L.toStringReverse());
	        System.out.println(L);      
	        System.out.println(" . . . . . . . ");
	        NumEl = (L.obtenerNoElementos())-1;
	        for(int j=0;j<NumEl;j++){
	            Moneda = Generador.nextBoolean();
	       	     if(Moneda==true){
	                Nodo Eliminado =L.eliminarAlInicio();
	            		}
	          			  if(Moneda==false){
	          			      Nodo Eliminado =L.eliminarAlFin();      
	          			  }
	    		    }
	        System.out.println("Se tiro la moneda... "+ contador +" veces");
	       
	        System.out.println(" *NUMERO DE LA SUERTE: "+" "+L+"*");
	    }  
	}
