package vacas;

import java.util.Scanner;

public class Vacas {

	public static void main(String[] args) {
		
		int vacasA[] = new int[]{2,4,10,20};
		int vacasB[] = new int[vacasA.length];
		int caminho[] = new int[5];
		
		int a = 0;
		int b = 0;
		
		int temp = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Lado A");
		
		for(int i=0 ; i<vacasA.length;i++) {
			
			System.out.print(vacasA[i]+", ");
			
		}
		
		System.out.println();
		
		a = entrada.nextInt();
		b = entrada.nextInt();
		
		if (a < vacasA[2] && a < vacasA[3] && b < vacasA[2] && b < vacasA[3]) {
			
			vacasB[0] = a; 
			vacasB[1] = b; 
			vacasA[0] = 0;
			vacasA[1] = 0;
			
			System.out.println("Lado B");
			
			for (int i = 0 ; i<vacasB.length;i++) {
				
				if(vacasB[i]>0) {
					
					System.out.print(vacasB[i]+ ", ");
					
				}
					
				
			}
			
			temp = temp + b;
			caminho[0] = b;
			
			System.out.println();
			
			a = entrada.nextInt();
			
			if (a == vacasB[0]) {
				
				vacasA[0] = a;
				vacasB[0] = 0;
				
				temp = temp + a;
				caminho[1] = a;
				
				System.out.println("Lado A");
				
				for (int i = 0 ; i<vacasA.length;i++) {
					
					if(vacasA[i]>0) {
						
						System.out.print(vacasA[i]+", ");
						
					}
						
					
				}
				
				System.out.println();
				
				a = entrada.nextInt();
				b = entrada.nextInt();
				
				temp = temp + b;
				caminho[2] = b;
				
				vacasB[2] = a;
				vacasB[3] = b;
				vacasA[2] = 0;
				vacasA[3] = 0;
				
				System.out.println("Lado B");
				
				for (int i = 0 ; i<vacasB.length;i++) {
					
					if(vacasB[i]>0) {
						
						System.out.print(vacasB[i]+ ", ");
						
					}
						
					
				}
				
				System.out.println();
				
				a = entrada.nextInt();
				
				temp = temp + a;
				
				caminho[3] = a; 
				
				vacasA[1] = a;  
				vacasB[1] = 0;  
				
				System.out.println("Lado A");
				
				for (int i = 0 ; i<vacasA.length;i++) {
					
					if(vacasA[i]>0) {
						
						System.out.print(vacasA[i]+", ");
						
					}
						
					
				}
				
				System.out.println();
				
				a = entrada.nextInt();
				b = entrada.nextInt();
				
				temp = temp + b;
				caminho[4] = b;
				
				vacasB[0] = a;
				vacasB[1] = b;
				vacasA[0] = 0;
				vacasA[1] = 0;
				
				System.out.println("Lado B");
				
				for (int i = 0 ; i<vacasB.length;i++) {
					
					if(vacasB[i]>0) {
						
						System.out.print(vacasB[i]+ ", ");
						
					}
						
					
				}
				
			}
			
		}
		
		
		if (temp == 34) {
			
			System.out.println();
			System.out.print("caminho-->");
			for(int i = 0 ; i < caminho.length;i++) {
				System.out.print(caminho[i]+"+");
			}
			
			System.out.println();
			
			System.out.println("parabens");
			
		}else {
			
			System.out.println(temp+ " a ponte caiu tente novamente");
			
		}	
	}
}

