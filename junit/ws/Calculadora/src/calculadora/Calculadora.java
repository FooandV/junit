package calculadora;

public class Calculadora {

//	public static int suma(int a, int b) {
//
//		return a + b;
//
//	}
//
//	public static int resta(int a, int b) {
//		return a - b;
//	}
//	
//	public static void main(String arg[]) {
//		
//		int a= 3, b=2;
//		int resultado = suma(a,b);
//		int esperado=5;
//		if(resultado == esperado) {
//			System.out.println("Este programa esta bien hecho");
//		}else {
//			
//			System.out.println("Este programa esta mal hecho");
//		}
//		System.out.println("3 + 2 = " + resultado);
//	}

	private int ans; //en esta variable se guarda los calculos de la calculadora
	
	public Calculadora() {
		ans=0;
	}
	//este metodo retornara la suma de a+b
	public int add(int a, int b) { 
		ans= a+b;
		return ans;
	}
	//este metodo retornara la resta de a-b
	public int sub(int a, int b) {
		ans= a-b;
		return ans;
	}
	//metodo acumulativo, donde se le pasa un unico valor y suma a ans + v
	public int add(int v) {
		ans +=v;
		return ans;
	} 
	//metodo acumulativo, donde se le pasa un unico valor y resta a ans - v
	public int sub(int v) {
		ans -=v;
		return ans;
	} 
	public int ans() {
		return ans;
	}



}
