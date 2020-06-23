
public class ColaCircularEntera {

	private int Siguiente;
	private int Frente;
	private int Vuelta[];
	
	public ColaCircularEntera(int N) {
		Vuelta=new int[N];
		Siguiente=0;
		Frente=-1;
	}
	public boolean colaLLena() {
		if((Siguiente==Vuelta.length)) {
			return true;
		 	  }else {
				return false;
			}
		}
	public void encolar(int Num) throws ExcepcionColaCirLLena{
		 if(colaVacia()&(Espacio()==true)) {
			System.out.println("//Reset");
			Frente=-1;
			Siguiente=0;
		}
		if(colaLLena()) {
			throw new ExcepcionColaCirLLena();
				}	 
				Vuelta[Siguiente]=Num;
	 			   Siguiente++;
					if(Siguiente==1) {
						Frente=0;
					}
				}
	public boolean colaVacia() {
		if(Frente==Siguiente) {
			return true;
				}else if(Frente==-1) {
					return true;
						}else {
							return false;
								}
							}
	public int sacar() throws ExcepcionColaCirVacia {
		if(colaVacia()) {
			throw new ExcepcionColaCirVacia();
				}
				int valor=Vuelta[Frente];
				Frente++;
				  return valor;
		}
	public boolean Espacio() { 
	  
	    int PosicionesVaciasFrente;
	    PosicionesVaciasFrente=((Frente+1)%Vuelta.length);
	  
	      if(PosicionesVaciasFrente>0) {
	  	     return true;
	  		     }else {
		    		 return false;
	      				 }
      						 }
	public int ObtenerFrente() {
	
		return Frente;	
	}
  }
  
