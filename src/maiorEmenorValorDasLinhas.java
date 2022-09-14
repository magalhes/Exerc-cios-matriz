import java.util.Random;

public class maiorEmenorValorDasLinhas {

	public static void main(String[] args) {
		int matriz [][] = new int [10][10];
		Random aleatorio = new Random();
		 
		for(int i =0; i<matriz.length; i++) {
			for(int j =0; j<matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(100);
				System.out.print(matriz[i][j] + " - ");
			}
			System.out.println();
		}
		int linha5 = 5;
		int maiorLinha5 = 0;
		int menorLinha5 = Integer.MAX_VALUE;
		for(int i =0; i<matriz[linha5].length; i++) {			
				if(matriz[linha5][i] > maiorLinha5) {
					maiorLinha5 = matriz[linha5][i];
					
				}
				if(matriz[i][i] < menorLinha5) {
					menorLinha5 = matriz[linha5][i];
				}
			}
			System.out.println("O maior valor da Linha 5 é " + maiorLinha5);
			System.out.println("O menor valor da Linha 5 é " + menorLinha5);
			int coluna7 = 7;
			int maiorColuna7 = 0;
			int menorColuna7 = Integer.MAX_VALUE;
			for(int i =0; i<matriz.length; i++) {
				if(matriz[i][coluna7] >maiorColuna7) {
					maiorColuna7 = matriz[i][coluna7];
				}
				if(matriz[i][coluna7] <menorColuna7) {
					menorColuna7 = matriz[i][coluna7];
				}
			}
			System.out.println("O maior valor da linha 7 é "+ maiorColuna7);
			System.out.println("O menor valor da linha 7 é "+ menorColuna7);
		}
	}


