package sayisalLoto;

import java.util.ArrayList;
import java.util.Random;

public class ProductManager {
	
	public void play(Product product) {
		
		//ArrayList<Integer> numbers = new ArrayList<>();
		int[] numbers = new int[6];

		
			for(int i = 0; i < 6; i++) {
				 int random1 = (int) (Math.random() * 50);
				for(int j = 0; j < i; j++) {
					if (numbers[j] == random1) 
			        {
			            random1 = (int) (Math.random() * 50);
			            j = -1;
			        }
					//System.out.print(random1 +",");
				}
				numbers[i] = random1;
			}
		
		
		
		
		for (int i = 0; i < numbers.length; i++)
		    System.out.print(numbers[i] + " ");

		
	}
}
