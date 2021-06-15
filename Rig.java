 public class Rig{
    Gpu gpu[] = new Gpu [6];
    private String rigName;
    private float rigWatt = 0;
    private float rigMhs = 0;
    private float rigCusto = 0;
    private float rigLucro = 0;
    private float rigBrutoEth;

    public void addGpu(int i , String n , float w , float m , float t ){ //seta os atributos de cada placa
        gpu[i].setName(n);
        gpu[i].setWatt(w);
        gpu[i].setMhs(m);
        gpu[i].setTempTrab(t);
    }

    public void showGpuRig(){  //mostra cada placa da rig
        for (int i = 0; i <= 5 ; ++i){
            int control = ++i;
            System.out.print("Placa "+control);
            System.out.print(" Nome: "+gpu[i].getName());
            System.out.print(" || MHS: "+gpu[i].getMhs()+" mh/s");
            System.out.print(" || LUCRO: R$ "+gpu[i].getLucro());
            System.out.println(" || ENERGIA: R$ "+gpu[i].getCusto());
            System.out.println("---------------------------------------------------------------------------------");
        }
    }
    
    public void calculaRig(){  //faz a soma dos atributos das GPUs 
        for (int i = 0 ; i <= 5 ; ++i){
            this.rigWatt = gpu[i].getWatt() + this.rigWatt;
            this.rigMhs = gpu[i].getMhs() + this.rigMhs;
            this.rigCusto = gpu[i].getCusto() + this.rigCusto;
            this.rigLucro = gpu[i].getLucro() + this.rigLucro;
        }
    }
    
    public void setRigName(String n){
        this.rigName = n;
    }

    public String getRigName(){
        return (this.rigName);
    }

    public float getRigCusto(){
        return(this.rigCusto);
    }
    
    public float getRigMhs(){
        return(this.rigMhs);
    }
    
    public void setRigLucro(float rl){
        this.rigLucro = rl;
    }

    public float getRigLucro(){
        return(this.rigLucro);
    }

    public void setRigBrutoEth(float rb){
        this.rigBrutoEth = rb;
    }

    public float getRigBrutoEth(){
        return(this.rigBrutoEth);
    }
}