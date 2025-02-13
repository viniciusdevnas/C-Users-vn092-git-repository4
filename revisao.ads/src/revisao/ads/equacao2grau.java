package revisao.ads;

import java.io.IOException;
import java.util.Iterator;

public class equacao2grau {
	public static void main(String[] args) throws IOException {
		//processará e resolverá equações de segundo grau
		double  x1, x2, delta;
		int  a, b, c = 0;
	
		a = 1;
		b =  -5;
		c = 6;
		
 delta = (b*b -4 * a * c);	
 if(delta != 0 && delta > 0) { 
x1 = (-b + Math.sqrt(delta))/ 2 * a;
x2 = (-b - Math.sqrt(delta))/ 2 * a;
 System.out.println("o primeiro valor de x é " + x1);
 System.out.println("o segundo valor de x é" + x2);
	} else {
		System.out.println("não é possível calcular");
	}
	}

}
