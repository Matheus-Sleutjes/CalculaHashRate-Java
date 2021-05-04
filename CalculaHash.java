import java.util.Scanner;
public class CalculaHash {
	public static void main(String arg[]){
		Scanner ler = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("DIGITE A FUNCAO DESEJADA");
		System.out.println("1 - CALCULAR O GANHO DE UMA PLACA ESPECIFICA");
		System.out.println("2 - CALCULAR GASTO ENERGETICO POR MES");
		System.out.println("3 - CALCULAR TODA A RIG");
		System.out.println("4 - {EM CONSTRUCAO}");
		System.out.println("5 - {EM CONSTRUCAO}");
		System.out.println("==================================================");
		int OP = ler.nextInt();
			
		// -------------------------------------------------------------------------------------
		
		switch (OP) {
			case 1:
					
				System.out.println("==================================================");
				System.out.println("        DIGITE O QUANTOS MH/s A PLACA FAZ");
				System.out.println("==================================================");
				float mhs = ler.nextFloat();
				System.out.println("==================================================");
				System.out.println("       DIGITE SEU GASTO ENERGETICO EM WATTS");
				System.out.println("==================================================");
				float watt = ler.nextFloat();
					
				System.out.println("==================================================");
				System.out.println("        DIGITE O QUAL O VALOR DO ETHEREUM");
				System.out.println("==================================================");
				float ethValor = ler.nextFloat();
		
				System.out.println("==================================================");
				System.out.println(" DIGITE A QUANTIDADE DE ETH POR 100 MH/s MINERADO");
				System.out.println("   VOCE PODE ENCONTRAR ESSA INFORMACAVO NO SITE");
				System.out.println("              https://hiveon.net/");
				System.out.println("  PEGAR A '24-hour average earnings' AGRADECIDO");
				System.out.println("==================================================");
				float mineEth = ler.nextFloat();

				//-----------------------------------------------------------------------------------------
				
				double custoEnergiaDiaDouble = ((watt*24)/1000)*0.9;
				float custoEnergiaDia = (float)custoEnergiaDiaDouble;  // transforma a variavel Double  em Float
				double custoEnergiaDouble = ((watt*720)/1000)*0.9;
				float custoEnergia = (float)custoEnergiaDouble;  // transforma a variavel Double em Float

				float brutoEth = (mhs*mineEth)/100;		
				float brutoReal = brutoEth * ethValor;
				float brutoEthMes = brutoEth * 30;
				float brutoRealMes = brutoReal * 30;
				System.out.println("==================================================");
				System.out.println("O VALOR BRUTO DO LUCRO E DE:");
				System.out.println("--------------------------------------------------");
				System.out.println("ETH:"+ brutoEth +" POR DIA");
				System.out.println("--------------------------------------------------");
				System.out.println("ETH:"+ brutoEthMes +" POR MES");
				System.out.println("--------------------------------------------------");
				System.out.println("R$:"+ brutoReal +" POR DIA");
				System.out.println("--------------------------------------------------");
				System.out.println("R$:"+ brutoRealMes +" POR MES");
				System.out.println("--------------------------------------------------");
				System.out.println("!! OBS: OS VALORES ACIMA SAO UMA ESTIMATIVA !!");
				System.out.println("==================================================");
				
				float liquidoReal = brutoReal-custoEnergiaDia;
				float liquidoRealMes = brutoRealMes-custoEnergia;
				float liquidoEth = brutoEth-(custoEnergiaDia/ethValor);
				float liquidoEthMes = brutoEthMes-(custoEnergia/ethValor);

				System.out.println("==================================================");
				System.out.println("O VALOR LIQUIDO DO LUCRO E:");
				System.out.println("--------------------------------------------------");
				System.out.println("ETH:"+ liquidoEth +" POR DIA");
				System.out.println("--------------------------------------------------");
				System.out.println("ETH:"+ liquidoEthMes +" POR MES");
				System.out.println("--------------------------------------------------");
				System.out.println("R$:"+ liquidoReal +" POR DIA");
				System.out.println("--------------------------------------------------");
				System.out.println("R$:"+ liquidoRealMes +" POR MES");
				System.out.println("==================================================");
				
			break;
			case 2:
				System.out.println("4 - {EM CONSTRUCAO}");
			break;
			case 3:
				System.out.println("4 - {EM CONSTRUCAO}");
			break;
		}
	}
}

