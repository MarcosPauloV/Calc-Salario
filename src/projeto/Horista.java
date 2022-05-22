package projeto;

public class Horista extends Funcionario implements CalcSalario{
   
    private double HorasTrab;

    public double getHorasTrab() {
        return HorasTrab;
    }

    public void setHorasTrab(double HorasTrab) {
        this.HorasTrab = HorasTrab;
    }
    
    public void setALL(String pNome, String pCidade, String pEstado, double pQauntHoras, double pHorasTrab){
        
        setALL(pNome, pCidade, pEstado, pQauntHoras);
        setHorasTrab(pHorasTrab);
        
        
    }
    
    @Override
    public double calcSalario() {
        return getHorasTrab() * getQuantHoras();
    }
    
    
    
    
}
