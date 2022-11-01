package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int faixa1;
		double faixa2;
		double faixa3;
		double faixa4;
		int opcao = 0;
		
			while (opcao != 2) {
				System.out.println("Digite 1 para consultar INSS;");
				System.out.println("Digite 2 para encerrar programa.");
				Scanner teclado = new Scanner(System.in);
				opcao = teclado.nextInt();
				switch (opcao) {
					case 1:
						Scanner entrada = new Scanner(System.in);
						System.out.println("Digite o seu salário bruto:");
						double salario = entrada.nextDouble();
						double inss = 0;
						
						if (salario < 1212) {
							System.out.println("Salário abaixo do piso!");
						}
						else if (salario == 1212) {
							inss = salario*0.075;
							System.out.printf("Contribuição inss = %.2f %n",+inss);
							
						}
						else if (salario >= 1212.01 && salario<= 2427.35) {
							faixa1 = 1212;
							faixa2 = salario - 1212;
							inss = (faixa1*0.075) + (faixa2*0.09);
							System.out.printf("Contribuição do inss = %.2f %n", + inss);
						}
						else if (salario >= 2427.36 && salario <= 3641.03) {
							faixa1 = 1212;
							faixa2 = 1215.35;
							faixa3 = salario - (faixa1 + faixa2);
							inss = (faixa1*0.075) + (faixa2*0.09) + (faixa3*0.12);
							System.out.printf("Contribuição do inss = %.2f %n", + inss);
						}
						else if (salario >= 3641.04 && salario <= 7087.22) {
							faixa1 = 1212;
							faixa2 = 1215.35;
							faixa3 = 1213.68;
							faixa4 = salario - (faixa1+faixa2+faixa3);
							inss = (faixa1*0.075) + (faixa2*0.09) + (faixa3*0.12) + (faixa4*0.14);
							System.out.printf("Contribuição do inss = %.2f %n", + inss);
							}
							
						else {
							inss = 828.38;
							System.out.printf("Contribuição do inss = %.2f %n", + inss);
							break;
						}
	}
	}
			System.out.println("Programa encerrado");

	}

}
