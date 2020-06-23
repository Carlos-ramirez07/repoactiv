
public class Nodo <T> {

    private int Tipo;
    private T Data;
    public Nodo Siguiente;
    public Nodo Anterior;
    
    public Nodo(T Data, int Tipo){
    	
        this.Tipo = Tipo;
        this.Data = Data;
         Siguiente = null;
         Anterior = null;
    }
    public T obtenerData(){
        return Data;
    }
    public void asignarData(T Data){
        this.Data = Data;
    }
    public String toString(){
        return ""+Data;
    }
    public int obtenerTipo(){
        return Tipo;
    }  
}

  /*
        *si Tipo=1 es un Int...
        *si Tipo=2 es un Double...
        *si Tipo=3 es un String...
		*si Tipo=4 es un float...
 		*si Tipo=5 es un boolean...
  		*si Tipo=6 es un char...
  		*si Tipo=7 es un short...
  		*si Tipo=8 es un long...
    	*si Tipo>10 es personalizado.
    */