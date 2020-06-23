import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Calculadora {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("*** Bienvenido ***");
		System.out.println();
		
		int Op=0;
		int Ope1=0,Ope2=0,Ope3=0,Ope4=0,Ope5=0;
		String Signo="";
		
		ColaCircularEntera ColNP=new ColaCircularEntera(5);
		System.out.println("Seleciona una opcion \n 1)Suma.(+)  2)Resta.(-)  3)Multiplicacion.(*) 4)Division.(/)" );
	
		Op=Integer.parseInt(teclado.readLine());
		try{
			System.out.println("Escribe el primer #: ");
			Ope1=Integer.parseInt(teclado.readLine());
		    ColNP.encolar(Ope1);
		    System.out.println("Escribe el segundo #: ");
		    Ope2=Integer.parseInt(teclado.readLine());
		    ColNP.encolar(Ope2);
		    System.out.println("Escribe el tercer #: ");
		    Ope3=Integer.parseInt(teclado.readLine());
		    ColNP.encolar(Ope3);
		    System.out.println("Escribe el cuarto #: ");
		    Ope4=Integer.parseInt(teclado.readLine());
		    ColNP.encolar(Ope4);
		    System.out.println("Escribe el quinto #: ");
		    Ope5=Integer.parseInt(teclado.readLine());
		    ColNP.encolar(Ope5);
		    
		}catch(ExcepcionColaCirLLena Err) {
			System.out.println(Err.getMessage());
				}
				float NumSacado=0;
				float NumNuevo=0;
				switch(Op) {
		  				  case 1:
				    	  Signo="+";
					    	try {
					    		while(!ColNP.colaVacia()) {
		    					      NumSacado=ColNP.sacar();
						    	      NumNuevo=NumSacado+NumNuevo;
					    		    }
			    			     }catch(ExcepcionColaCirVacia Err) {
					      				System.out.println(Err.getMessage());
		    	     				 }
			   						 break;
		 				   case 2:
					       Signo="-";
					    	try {
		    					while(!ColNP.colaVacia()) {  
					    			NumSacado=ColNP.sacar();
		    						   if(ColNP.ObtenerFrente()==1) {
		    	        			      NumNuevo=NumSacado-NumNuevo;
		    						        }else {
		    			    				  NumNuevo=NumNuevo-NumSacado;
		    		          					 } 
		    		        				}
		    							   }catch(ExcepcionColaCirVacia Err) {
												  System.out.println(Err.getMessage());
										    	}
		 									   	break;
						    case 3:
		  				  	Signo="*";
					    	 try {
					    		while(!ColNP.colaVacia()) {  
		    						NumSacado=ColNP.sacar();
		    			 				 if(ColNP.ObtenerFrente()==1) {
		    	          				   NumNuevo=NumSacado;
		    							      }else {
		    							 	     NumNuevo=NumNuevo*NumSacado;
		    		 								  } 
		    									}
		    								  }catch(ExcepcionColaCirVacia Err) {
													System.out.println(Err.getMessage());
		    								     }
		    									break;
						    case 4:
		    				Signo="/";
		    				try {
					    		while(!ColNP.colaVacia()) {  
		    						NumSacado=ColNP.sacar();			
						    			if(ColNP.ObtenerFrente()==1) {
		    					           NumNuevo=NumSacado;
		   						 		    }else  {
		    								   NumNuevo=(NumNuevo)/(NumSacado);
		    									   } 
		   							 		}
								    	}catch(ExcepcionColaCirVacia Err) {
											System.out.println(Err.getMessage());
									    	}
		 								   	break;
		  								    default:
		   							System.out.println("Ingresa algo correcto...");
		    							break;
								}
								
		System.out.println("El resultado es:"+NumNuevo+" ");
		
		System.out.println("**Notacion Polaca:... "+Signo+" "+Ope1+" "+Ope2+" "+Ope3+" "+Ope4+" "+Ope5);
	}

}