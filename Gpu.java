public class Gpu{
    private float mhs;
    private float watt;
    private String name;
    private float tempTrab;
    private float custo;
    private float lucro;

    public void setMhs(float m){
        this.mhs = m;
    }
    
    public float getMhs(){
        return (this.mhs);
    }

    public void setWatt(float watt){
        this.watt = watt;
    }

    public float getWatt(){
        return (this.watt);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return (this.name);
    }
    
    public void setTempTrab(float t){
        this.tempTrab = t;
    }
    
    public float getTempTrab(){
        return (this.tempTrab);
    }

    public void setCusto(float c){
        this.custo = c;
    }

    public float getCusto(){
        return(this.custo);
    }

    public void setLucro(float l){
        this.lucro = l;
    }

    public float getLucro(){
        return(this.lucro);
    }
}