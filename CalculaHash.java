import java.util.Scanner;
public class CalculaHash {
	public static void main(String arg[]){
		boolean sair = false ;
		while(sair == false ){
		
		Scanner ler = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("DIGITE A FUNCAO DESEJADA");
		System.out.println("1 - CALCULAR O GANHO DE UMA PLACA ESPECIFICA");
		System.out.println("2 - CALCULAR GASTO ENERGETICO");
		System.out.println("3 - CALCULAR TODA A RIG");
		System.out.println("4 - VARIAS RIGS");
		System.out.println("5 - SAIR");
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
				
				double custoEnergiaDiaDouble = ((watt*24)/1000)*0.9;   //calcula o valor em Reais por dia de energia
				float custoEnergiaDia = (float)custoEnergiaDiaDouble;  // transforma a variavel Double  em Float
				double custoEnergiaDouble = ((watt*720)/1000)*0.9;  //calcula o valor em Reais por mes de energia
				float custoEnergia = (float)custoEnergiaDouble;  // transforma a variavel Double em Float

				float brutoEth = (mhs*mineEth)/100;  // calcula o valor bruto em ETH		
				float brutoReal = brutoEth * ethValor;  //calcula o valor bruto em Reais
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
				
				float liquidoReal = brutoReal-custoEnergiaDia;  //calcula o lucro por dia em Reais
				float liquidoRealMes = brutoRealMes-custoEnergia;  //calcula o lucro por mes em Reais
				float liquidoEth = brutoEth-(custoEnergiaDia/ethValor);  //calcula o lucro por dia em Eth
				float liquidoEthMes = brutoEthMes-(custoEnergia/ethValor);  //calcula o lucro por mes em Eth

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
				System.out.println("--------------------------------------------------");
				System.out.println("!! OBS: OS VALORES ACIMA SAO UMA ESTIMATIVA !!");
				System.out.println("==================================================");
				
				System.out.println("==================================================");    //começo da função sair 
				System.out.println("DESEJA FAZER OUTRA OPERACAO ?");
				System.out.println("DIGITE A OPCAO ABAIXO");
				System.out.println("1 PARA SIM / 2 PARA NAO");
				System.out.println("==================================================");
				int resp = ler.nextInt();
				if(resp == 2){
					sair = true;
				}  //fim da função sair 
				
			break;
			case 2:
				System.out.println("==================================================");
				System.out.println("       DIGITE SEU GASTO ENERGETICO EM WATTS");
				System.out.println("==================================================");
				float watt = ler.nextFloat();
				
				System.out.println("==================================================");
				System.out.println("       DIGITE O VALOR DO KW/H DA SUA REGIAO");
				System.out.println("==================================================");
				float kw = ler.nextFloat();
				
				double custoEnergiaDiaDouble = ((watt*24)/1000)*kw;   //calcula o valor em Reais por dia de energia
				float custoEnergiaDia = (float)custoEnergiaDiaDouble;  // transforma a variavel Double  em Float
				double custoEnergiaDouble = ((watt*720)/1000)*kw;  //calcula o valor em Reais por mes de energia
				float custoEnergia = (float)custoEnergiaDouble;  // transforma a variavel Double em Float
				
				System.out.println("==================================================");
				System.out.println("O SEU GASTO DE ENERGIA ");
				System.out.println("--------------------------------------------------");
				System.out.println("R$:"+ custoEnergiaDia +" POR DIA");
				System.out.println("--------------------------------------------------");
				System.out.println("R$:"+ custoEnergia +" POR MES");
				System.out.println("--------------------------------------------------");
				System.out.println("!! OBS: OS VALORES ACIMA SAO UMA ESTIMATIVA !!");
				System.out.println("==================================================");
				
				System.out.println("==================================================");    //começo da função sair 
				System.out.println("DESEJA FAZER OUTRA OPERACAO ?");
				System.out.println("DIGITE A OPCAO ABAIXO");
				System.out.println("1 PARA SIM / 2 PARA NAO");
				System.out.println("==================================================");
				int resp = ler.nextInt();
				if(resp == 2){
					sair = true;
				}  //fim da função sair
			break;
			case 3:
				System.out.println("4 - {EM CONSTRUCAO}");
				sair = false;
			break;
			case 4:
			break;
			case 5:
					sair = true; 
			break;	
			} // fim switch
		} // fim while sair	
	} //fim main
} //fim CalculaHash

