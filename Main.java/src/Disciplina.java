public class Disciplina {
    
    private ICalcMedia CalcMedia;

    public double media;
    private String nome; 
    private double p1;
    private double p2;
    public String situacao;

    public void setCalcMedia(ICalcMedia calcMedia) {
        CalcMedia = calcMedia;
    }
    
    public void setMedia(double media) {
        this.media = media;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setP1(double p1) {
        this.p1 = p1;
    }
    public void setP2(double p2) {
        this.p2 = p2;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    


    public ICalcMedia getCalcMedia() {
        return CalcMedia;
    }
    
    public double getMedia() {
        return media;
    }
    public String getNome() {
        return nome;
    }
    public double getP1() {
        return p1;
    }
    public double getP2() {
        return p2;
    }
    public String getSituacao() {
        return situacao;
    }

    
    public double Calculo()
    {
        return this.CalcMedia.CalculaMedia(this.p1, this.p2);

    }
    
    
    
}
