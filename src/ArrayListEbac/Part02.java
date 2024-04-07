package ArrayListEbac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part02 {

	public static void main(String[] args) {
	
		
		
		
		
	    ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João-M");
        nomes.add("Maria-F");
        nomes.add("Pedro-M");
        nomes.add("Ana-F");
        nomes.add("Lucas-M");
        
        System.out.println("Nomes Masculinos:");
        for (String nome : nomes) {
            if (nome.endsWith("-M")) {
                System.out.println(nome.replace("-M", ""));
            }
        }
        
        System.out.println("\nNomes Femininos:");
        for (String nome : nomes) {
            if (nome.endsWith("-F")) {
                System.out.println(nome.replace("-F", ""));
            }
        }

	}

}
