package projeto;

public class Comissionado extends Funcionario implements CalcSalario{
   
    private double PercComissao;
    private double valVendas;
    
    public double getValVendas() {
        return valVendas;
    }

    public void setValVendas(double valVendas) {
        this.valVendas = valVendas;
    }
    
    
    public double getPercComissao() {
        return PercComissao;
    }

    public void setPercComissao(double PercComissao) {
        this.PercComissao = PercComissao;
    }
    
    
    public void setALL(String pNome, String pCidade, String pEstado, double pQauntHoras, double pPercComissao, double pValVendas){
         setALL(pNome, pCidade, pEstado, pQauntHoras);
         setPercComissao(pPercComissao);
         setValVendas(pValVendas);
    }

    @Override
    public double calcSalario() {
        return getPercComissao() * getValVendas();
    }
    
}
