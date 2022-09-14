import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String agenda[][][] = new String[12][31][8];
		boolean valido = false;		
		int opcao = 0;			 
		while(!valido) {			
			System.out.println("Digite 1 para adicionar compromisso: ");
		    System.out.println("Digite 2 para verificar compromisso: ");
		    System.out.println("Digite 0 para sair do compromisso: ");
		    opcao = sc.nextInt();
			if(opcao == 1) {
				boolean mesValido = false;
				int mes =0;
				while(!mesValido) {
					System.out.println("Entre com o  mes: ");
					mes = sc.nextInt();
					if(mes >=1 && mes <= 12) {
						mesValido = true;
					}
					else {
						System.out.println("Mes invalido, digite novamente: ");
					}
				}
				boolean diaValido = false;
				int dia =0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mes: ");
					 dia = sc.nextInt();
					if(dia >0 && dia <= 31) {
						diaValido = true;
					}
					else {
						System.out.println("Dia invalido, digite novamente");
					}
				}
				
				boolean horaValido = false;
				int hora = 0;
				while(!horaValido) {
					System.out.println("Entre com a hora valida ");
					 hora = sc.nextInt();
					if(hora >=0 && hora <= 8) {
						horaValido = true;
					}
					else {
						System.out.println("Hora invalido, digite novamente");
					}
				}
				
				System.out.println("Digite o compromisso ");				
				agenda [mes][--dia][hora] =  sc.next();			
				
				
			}if(opcao == 2) {
				boolean mesValido = false;
				int mes =0;
				while(!mesValido) {
					System.out.println("Entre com o  mes: ");
					mes = sc.nextInt();
					if(mes >=1 && mes <= 12) {
						mesValido = true;
					}
					else {
						System.out.println("Mes invalido, digite novamente: ");
					}
				}
				boolean diaValido = false;
				int dia =0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mes: ");
					 dia = sc.nextInt();
					if(dia >0 && dia <= 31) {
						diaValido = true;
					}
					else {
						System.out.println("Dia invalido, digite novamente");
					}
				}
				
				boolean horaValido = false;
				int hora = 0;
				while(!horaValido) {
					System.out.println("Entre com a hora valida ");
					 hora = sc.nextInt();
					if(hora >=0 && hora <= 24) {
						horaValido = true;
					}
					else {
						System.out.println("Hora invalido, digite novamente");
					}
				}
				
				dia--;
				
				System.out.println("O compromisso agendado é:");
				System.out.println(agenda[mes][dia][hora]);
				
			}else if(opcao == 0){
				valido = true;
				System.out.println("Saiu da agenda");
			}
		    
		}
	}
}
