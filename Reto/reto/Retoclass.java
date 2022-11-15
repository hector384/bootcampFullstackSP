
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Retoclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner Dato=new Scanner(System.in);
			String Entrada, Dato1, Dato2;
			Dato1= "Tipo A";
			Dato2= "Tipo B";
			System.out.println("Ingrese un valor:  Tipo A, Tipo B");
			Entrada = Dato.nextLine();
			System.out.println(Entrada);
			String[] lista = new String[8];
			for(int i=0; i<=7; i++) {
				 lista[i] = Integer.toString(ThreadLocalRandom.current().nextInt(0, 9));
			} 
			String Cadena = lista[0]+lista[2]+lista[3]+lista[4]+lista[5]+lista[6]+lista[7]+lista[1];
			
			if(Entrada.equals(Dato1)) {
				System.out.println("54"+Cadena);
			}else if (Entrada.equals(Dato2)) {
				System.out.println("08"+Cadena);
			}else {
				System.out.println("Dato invalido");
			}
			
		} catch (Exception e) {
			System.out.println("algo salio mal");
		}
		
	}

}


