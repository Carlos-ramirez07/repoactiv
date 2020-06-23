import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PruebasEncadenamientos{

	public static void main(String args[])throws IOException {

		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader Teclado=new BufferedReader(r);

	 	String resp="";
		String Pal="";
		
		NodoCadena SigNod=null;
		NodoCadena Actual=null;
		NodoCadena Inicial=null;
		
		System.out.println("***Bienvenido***");
		do{
			System.out.println("*Escribe una palabra");
			Pal=Teclado.readLine();
			
			if(Inicial==null) {
					Inicial=new NodoCadena(null,Pal);
					Actual=Inicial;
				}else {
					SigNod=new NodoCadena(null, Pal);
					Actual.Siguiente=SigNod;
					Actual=SigNod;
						}
						System.out.println("-Deseas agregar  * S/N * ");
						resp=Teclado.readLine();
					}while(resp.compareToIgnoreCase("S")==0);
						NodoCadena ref=Inicial;
				  	  while(ref!=null) {
						System.out.println(ref);
						ref=ref.Siguiente;
		}
	}
}