package iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static int total = 0;
	static int nbCerise = 0;
	
	public static void main(String[] args) throws Exception { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stdin;
		Main scanner = new Main();
		
		
		while( !(stdin=br.readLine()).equals("bye")){
			total = total + scanner.add(stdin);
			total = total - scanner.reduction();
			System.out.println(total);
		}
	}
	
	public int reduction() {
		int reduction = 0;
		if(nbCerise%2==0 && nbCerise !=0){
			reduction = 20;
		}
		return reduction;
	}

	public int add(String fruit){
		if(fruit.equals("Pomme")){
			return 100;
		}
		else if(fruit.equals("Cerise")){
			nbCerise++;
			return 75;
		}
		else{
			return 150;
		}
	}
	
	
}
