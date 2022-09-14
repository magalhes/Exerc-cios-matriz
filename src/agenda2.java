import java.util.Locale;
import java.util.Scanner;

public class agenda2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String agenda [][] = new String [24][31];
		
		int hora = 0;
		int dia = 0;;
		String opcao;
		do {
			System.out.println("Agenda");
			
			boolean diaValido =false;
			while(!diaValido) {
			System.out.print("Digite dia do  evento: ");
			dia = sc.nextInt()-1;
			if(dia >0 && dia<= 31) {
				diaValido = true;
			}else {
				System.out.println("Dia invalido, digite novamente");
			}
			}
			boolean horaValido =false;
			while(!horaValido) {
				System.out.print("Digite a hora: ");
				hora = sc.nextInt();
				if(hora >0 && hora <=24) {
					horaValido = true;
				}
				else {
					System.out.println("Hora invalida, digite novamente");
				}
			}			
			sc.nextLine();
			System.out.print("Descrição: ");
			agenda [hora][dia] = sc.nextLine();
			System.out.print("Continua S/N: ");
			opcao = sc.nextLine();
		}while(opcao.equalsIgnoreCase("s"));
		
		for(int d =0; d<31; d ++) {
			for(int h =0; h<24; h++) {
				if(agenda[h][d] != null) {
					System.out.printf("Dia %d hora %d: - %s\n ", d,h,agenda[h][d]);
					System.out.println("---------------------------------");
				}				
			}
		}
		
		
		
	}

}
