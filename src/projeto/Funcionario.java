package projeto;

public abstract class Funcionario {
    
    private String Nome;
    private String Cidade;
    private String Estado;
    private double quantHoras;

    public Funcionario() {
        this.Nome = Nome;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.quantHoras = quantHoras;
    }

    
    
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public double getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(double quantHoras) {
        this.quantHoras = quantHoras;
    }
    
    public void setALL(String pNome, String pCidade, String pEstado, double pQauntHoras){
        
        setNome(pNome);
        setCidade(pCidade);
        setEstado(pEstado);
        setQuantHoras(pQauntHoras);
        
    }
    
}
