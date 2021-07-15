package it.euris.ires;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int minus(int a,int b){return a-b;}

	public int per(int a,int b){return a*b;}

	public int diviso(int a,int b){return a/b;}

	public static void test(){
		int a =2;
		int b =1;
		int tot = a+b;
		System.out.printf("Dati %d e %d la loro somma dovrebbe essere 3,risultato %d",a,b,tot);
	}


}
