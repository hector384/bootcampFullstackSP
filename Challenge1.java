package reto1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
public class Challenge1 {

	public static void main(String[] args) {
		Scanner Data=new Scanner(System.in);
		String DataIn;
		System.out.println("Ingrese un valor:  Tipo A, Tipo B");
		DataIn = Data.nextLine();
		System.out.println(random(DataIn));
		System.out.println("Ingrese un Nombre: ");
		String In = Data.nextLine();
		
		List<String> List = new ArrayList<String>();
	      List.add("Juan");
	      List.add("Pedro");
	      List.add("Jose");
	      List.add("Maria");
	      List.add("Sofia");
	      System.out.println(list(In, List));
		
	}
	public static String random(String DataIn) {
		String Data1= "Tipo A";
		String Data2= "Tipo B";
		String[] list = new String[8];
		for(int i=0; i<=7; i++) {
			 list[i] = Integer.toString(ThreadLocalRandom.current().nextInt(0, 9));
		} 
		String str = list[0]+list[2]+list[3]+list[4]+list[5]+list[6]+list[7]+list[1];
		
		if(DataIn.equals(Data1)) {
			 return DataIn="54"+str;
		}else if (DataIn.equals(Data2)) {
			 return	DataIn= "08"+str;
		}else {
			 return DataIn="invalid data";
			}
	}
	public static boolean list(String In, List<String> list) {
		boolean Result;	
		if(list.contains(In)) {
			Result= false;
		}else {
			Result = true;
		}
		return Result;
	
	}	
}
