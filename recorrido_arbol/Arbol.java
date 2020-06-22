
public class Arbol {

	private Nodo raiz;
	private String Recorrido;
	public Arbol() {

		raiz=null;
		Recorrido="";
	}
	
	private void insertarDesde(Nodo noda, Nodo Desde) {
		if(Desde.obtenerData()==noda.obtenerData()) {
			return;
		}
		if(noda.obtenerData()> Desde.obtenerData()) {
			if(Desde.Der==null) {
				Desde.Der=noda;
				return;
	 				}else {
						insertarDesde(noda, Desde.Der);
						return;
						  }
						  }else {
							if(Desde.Izq==null){
							Desde.Izq=noda;
							return;
							   }else {
							 	 insertarDesde(noda,Desde.Izq);
									return;
			}
		}
	}
	public void insertar(Nodo noda) {
		if(raiz==null){
			raiz=noda;
			return;
		}
		insertarDesde(noda,raiz);
	}
	public boolean buscar(Nodo noba) {
		return buscarDesde(noba, raiz);
	}
	private boolean buscarDesde(Nodo noba, Nodo Desde) {
		if(Desde==null) {
			return false;
		}
		//cuando se encuentra el nodo
		if(Desde.obtenerData()==noba.obtenerData()) {
			return true;
		}
		if(noba.obtenerData()>Desde.obtenerData()) {
			//der
			return buscarDesde(noba, Desde.Der);
		}else {
			//izq
			return buscarDesde(noba, Desde.Izq);
		}
	}
					/////////recurrido/////////////
	public String toStringPreOrder() {
		Recorrido= "";
		PreOrderDesde(raiz);
		return Recorrido;
	}
	private void PreOrderDesde(Nodo Desde) {
		if(Desde==null) {
			return;
		}
			Recorrido=Recorrido+" "+Desde;
			PreOrderDesde(Desde.Izq);
			PreOrderDesde(Desde.Der);	
		}
	public String toStringInOrder() {
		Recorrido= "";
		InOrderDesde(raiz);
		return Recorrido;
	}
	private void InOrderDesde(Nodo Desde) {
		if(Desde==null) {
			return;
		}
		InOrderDesde(Desde.Izq);
		Recorrido=Recorrido+" "+Desde;
		InOrderDesde(Desde.Der);	
		}
		
	public String toStringPostOrder() {
		Recorrido= "";
		PostOrderDesde(raiz);
		return Recorrido;
	}
	private void PostOrderDesde(Nodo Desde) {
		if(Desde==null) {
			return;
		}
		PostOrderDesde(Desde.Izq);
		PostOrderDesde(Desde.Der);
		Recorrido=Recorrido+" "+Desde;
		}
}