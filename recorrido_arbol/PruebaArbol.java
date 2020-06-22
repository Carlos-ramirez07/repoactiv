
public class PruebaArbol {

	public static void main(String[] args) {

		Arbol bonsai=new Arbol();
		bonsai.insertar(new Nodo(10));

		if(bonsai.buscar(new Nodo(10))){
			System.out.println("El 10 si se encuentra");
		}
		
		Nodo AB;
		
		
	    AB= new Nodo(0);
		if(bonsai.buscar(AB)){
			System.out.println("El "+AB+" se encontro exitosamente...");
		}else {
			System.out.println("El "+AB+" no se encontro exitosamente...hubo un error");	
		}
		
		
		AB= new Nodo(5);
		bonsai.insertar(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+"  se encontro exitosamente...");
		}else {
		    System.out.println("El "+AB+" no se encontro exitosamente...hubo un error");	
			}
			
			
		AB= new Nodo(15);
		bonsai.insertar(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+"  se encontro exitosamente...");
		}else {
		    System.out.println("El "+AB+" no se encontro exitosamente...hubo un error");	
			}
			
			
		AB= new Nodo(4);
		bonsai.insertar(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+"  se encontro exitosamente...");
		}else {
		    System.out.println("El "+AB+" no se encontro exitosamente...hubo un error");	
			}
			
			
		AB= new Nodo(16);
		bonsai.insertar(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+"  se encontro exitosamente...");
		}else {
		    System.out.println("El "+AB+" no se encontro exitosamente...hubo un error");	
			}
			
			
		AB= new Nodo(8);
		bonsai.insertar(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+"  se encontro exitosamente...");
		}else {
		    System.out.println("El "+AB+" no se encontro exitosamente...hubo un error");	
			}
			
			
		AB= new Nodo(11);
		bonsai.insertar(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+"  se encontro exitosamente...");
		}else {
		    System.out.println("El "+AB+" no se encontro exitosamente...hubo un error");	
			}
			
			
		AB= new Nodo(1111);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+"  se encontro exitosamente...");
				}else {
		  		  System.out.println("El "+AB+" no se encontro exitosamente...hubo un error");	
				  	  }
		
		System.out.println();	  	  
		System.out.println("*** Bienvenido ***");
		System.out.println(" "+" "+ "Recorridos:" );
		System.out.println();	  
		System.out.println("*Pre-order(VID):...");
		System.out.println(bonsai.toStringPreOrder());
		System.out.println("*In-order(IVD):...");
		System.out.println(bonsai.toStringInOrder());
		System.out.println("*Post-order(IDV):...");
		System.out.println(bonsai.toStringPostOrder());
		
	}
}