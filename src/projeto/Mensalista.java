package projeto;

public class Mensalista extends Funcionario{

 
    private double Salario;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    public void setALL(String pNome, String pCidade, String pEstado, double pQauntHoras, double pSalario){
        
        setALL(pNome, pCidade, pEstado, pQauntHoras);
        
        setSalario(pSalario);
        
}
    
}
