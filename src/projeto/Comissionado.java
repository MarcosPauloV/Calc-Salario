package projeto;

public class Comissionado extends Funcionario{
    private double PercComissao;

    public double getPercComissao() {
        return PercComissao;
    }

    public void setPercComissao(double PercComissao) {
        this.PercComissao = PercComissao;
    }
    
    public void setALL(String pNome, String pCidade, String pEstado, double pQauntHoras, double pPercComissao){
         setALL(pNome, pCidade, pEstado, pQauntHoras);
         setPercComissao(pPercComissao);
    }
}
