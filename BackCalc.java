import java.util.Scanner;
public class BackCalc{
    private float carteiraMhs = 0;
    private float carteiraWatt = 0;
    Rig rig[] = new Rig[5];
    Scanner ler = new Scanner(System.in);
    Gpu gpu = new Gpu();

    public void addRig(int i , String n){
        rig[i].setRigName(n);
        for (int j = 0 ; j <= 5 ; ++j){
            int cont = ++j;

            System.out.println("==================================================");
            System.out.print("         DIGITE O NOME DA PLACA DE VIDEO "+cont+" : ");
            String name = ler.next();

            System.out.println("==================================================");
			System.out.print("    DIGITE O QUANTOS MH/s A PLACA "+cont+" FAZ: ");
            float mhs = ler.nextFloat();

            System.out.println("==================================================");
            System.out.print("      DIGITE O GASTO EM WATTS DA PLACA "+cont+": ");
            float watt = ler.nextFloat();

            System.out.println("==================================================");
            System.out.print("   DIGITE O TEMPO EM DIAS DE TRABALHO DA PLACA "+cont+" :");
            float temp = ler.nextInt();

            rig[i].addGpu(j,name, watt, mhs, temp);
        }
    }

    public void calcEstimativaGanho( float eth , float hive){ 
        // calcula a estimativa de lucro de uma placa especifica passando o Obj gpu 
        // o valor do ETH e o valor do eth de ganho a cada 100mhs
        
        float brutoMes = (this.getMhs()*hive/100)*30*eth;
        this.setLucro(brutoMes - this.getCusto());
    }

    public void calcMineracao( float coin, float eth ){ // float coin==saldo da carteira || float eth== valor do eth atual
        for (int i = 0; i<=4 ; ++i){
            float percent = (this.rig[i].getRigMhs()*100)/this.getCarteiraMhs();
            this.rig[i].setRigBrutoEth(percent*(coin/100));
            this.rig[i].setRigLucro((this.rig[i].getRigBrutoEth()*eth) -this.rig[i].getRigCusto());
        }
    }

    public void calcEnergia(float kw){ //seta o custo de energia em R$ em cada placa de cada rig 
        for (int i=0; i <= 4; ++i){                      // kw é o valor do kW/h da regiao
            for (int j=0; i<=5; ++j){
                this.rig[i].gpu[j].setCusto(((24* this.rig[i].gpu[j].getTempTrab() * this.rig[i].gpu[j].getWatt())/1000)*kw);
                
            }
            this.rig[i].calculaRig();  //setar o valor do custo da rig em watt
        }
    }

    public void Energia(float kw){ //seta o custo de energia em R$ em uma placa especifica 
        this.setCusto(((24*this.getTempTrab()*this.getWatt())/1000)*kw);    // kw é o valor do kW/h da regiao
    }

    public float getCarteiraMhs(){
        return(this.carteiraMhs);
    }

    public void setCarteiraMhs(float cm){
        this.carteiraMhs = cm;
    }

    public float getCarteiraWatt(){
        return(this.carteiraWatt);
    }

    public void setCarteiraWatt(float cw){
        this.carteiraWatt = cw;
    }

    public void calculaCarteiraMhs(){  //faz a soma dos atributos das GPUs 
        for (int i = 0 ; i <= 4 ; ++i){
            this.setCarteiraMhs( rig[i].getRigMhs() + this.carteiraMhs);
        }
    }

}