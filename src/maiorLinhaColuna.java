import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class maiorLinhaColuna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		
		int matriz [][] = new int [4][4];
		Random aleatorio = new Random();
		 int maior = 0;
		 int menor =Integer.MAX_VALUE;
		for(int i =0; i<matriz.length; i++) {
			for(int j =0; j<matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(100);
				System.out.print(matriz[i][j] + " - ");
			}
			System.out.println();
		}
		int maiorLinha = 0;
		int maiorColuna = 0;
		int menorLinha = 0;
		int menorColuna = 0;
		for(int i =0; i<matriz.length; i++) {
			for(int j =0; j<matriz[i].length; j++) {
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
					maiorLinha = i;
					maiorColuna = j;
				}
				
			}
		}
		System.out.println();
		System.out.println("O maior valor é " + maior);
		System.out.println("A maior valor da Linha " + maiorLinha);
		System.out.println("A maior valor da coluna é " + maiorColuna);	
		
	}

}
