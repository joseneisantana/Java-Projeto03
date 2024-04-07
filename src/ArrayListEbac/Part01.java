package ArrayListEbac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part01 {

	public static void main(String[] args) {
		List<String> salaDeAula = new ArrayList<>(Arrays.asList("Cadeira", "mesa","lixeira", "Quadro","Maçã"));
          
		
		System.out.println(Arrays.toString(salaDeAula.toArray()));
	}
	public static List<String> OrdenaReponsavel(List<String> salaDeAula){
		
		 salaDeAula.sort(null);
		
		return   salaDeAula;
	}		
}
