package projeto;

import java.util.ArrayList;

public class Departamento {
    
    private String Descricao;
    private Double ValorHora;
    private ArrayList<Funcionario> objFun;

    public Departamento() {
        this.Descricao = Descricao;
        this.ValorHora = ValorHora;
        this.objFun = objFun;
    }
    
    public void AddFuncionario(){
        
        Funções Fun = new Funções();
        
        int op;
        String msm = null;
        
        op = Fun.lerInt("Insira o valor da Opção \n 1-Mensalista \n 2-Comissionado \n 3-Horista", msm);
        
        switch(op){
            case 1:
                Mensalista objM = new Mensalista();
                objM.setALL(msm, msm, msm, 0);
                objFun.add(objM);
            case 2:
            
                
                
            case 3:
                
                
        }
          
    }
    
    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(Double ValorHora) {
        this.ValorHora = ValorHora;
    }
       
}
