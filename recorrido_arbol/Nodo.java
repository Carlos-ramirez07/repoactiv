
public class Nodo {

	public int Data;
	public Nodo Izq;
	public Nodo Der;
	
	public Nodo(int Data) {
		
		this.Data=Data;
		
		Izq=null;
		Der=null;
	
	}
	public int obtenerData() {
		return Data;
	}
	public void asignarData(int Data) {
		this.Data=Data;
	}
	public String toString() {
		return " " + Data;
	}
}