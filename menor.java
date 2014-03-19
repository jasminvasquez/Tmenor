package tareamenor;

import java.util.Scanner;

public class menor {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);  
	        System.out.println("Ingresa un numero ");  
	        int A = sc.nextInt();  
	        System.out.println("Ingresa otro numero ");  
	        int B = sc.nextInt();  
	       
	        if(A < B ){  
	        System.out.println("El numero menor es " + A);  
	        }else{  
	            if(B < A ){  
	            	int A1= sc.nextInt(); 
	            System.out.println("El numero menor es " + B);  
	            System.out.println("El numero menor es " + A); 
	            }else{  
	            System.out.print("Los numeros son Iguales ");
		         
	            }  
	        }  
	     }  
	}  
