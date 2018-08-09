package utilities;

import org.springframework.stereotype.Component;

@Component
public class Multiplication implements Calculator {

	@Override
	public void calculate() {
		
		System.out.println("multiplication"); 
	}

}
