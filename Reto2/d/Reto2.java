import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Dato=new Scanner(System.in);
		System.out.println("Ingrese un Nombre: ");
		String Entrada = Dato.nextLine();
		boolean r= (lista(Entrada));
		System.out.println(r);
	}
	public static boolean lista(String Entrada) {
	
			boolean Resultado;	
			List<String> ejemploLista = new ArrayList<String>();
		      ejemploLista.add("Juan");
		      ejemploLista.add("Pedro");
		      ejemploLista.add("Jose");
		      ejemploLista.add("Maria");
		      ejemploLista.add("Sofia");
		      System.out.println(ejemploLista);
			if(ejemploLista.contains(Entrada)) {
				Resultado= false;
			}else {
				Resultado = true;
			}
			return Resultado;
		
		
		
		
		
		
	}

}
