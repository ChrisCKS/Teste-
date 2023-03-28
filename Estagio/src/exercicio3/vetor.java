package exercicio3;

//GERAR NUMEROS ALEATÓRIOS NOS VETORES 'A' E 'B', ENQUANTO O VETOR K RECEBE RESPECTIVAMENTE A DIVISÃO DOS NÚMEROS DE A POR B

public class vetor {

	public static void main(String[] args) {
		 int[] A = new int[15];
	     int[] B = new int[15];
	     double[] K = new double[15];

	    
	        for (int i = 0; i < 15; i++) {
	            A[i] = (int) (Math.random() * 100);
	            B[i] = (int) (Math.random() * 100);
	        }

	        for (int i = 0; i < 15; i++) {
	            K[i] = (double) A[i] / B[i];
	        }

	        System.out.println("Vetor A:");
	        for (int i = 0; i < 15; i++) {
	            System.out.print(A[i] + " ");
	        }
	        System.out.println("\n");

	        System.out.println("Vetor B:");
	        for (int i = 0; i < 15; i++) {
	            System.out.print(B[i] + " ");
	        }
	        System.out.println("\n");

	        System.out.println("Vetor K:");
	        for (int i = 0; i < 15; i++) {
	            System.out.print(K[i] + " ");
	        }
	        System.out.println("\n");
	    }

	}


