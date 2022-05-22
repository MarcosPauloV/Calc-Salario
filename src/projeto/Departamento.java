package projeto;

import java.util.ArrayList;

public class Departamento {
    
    private String Descricao;
    private Double ValorHora;
    private ArrayList<Funcionario> objFun;
    private int cont;

    /* Geter e Setter */
    
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
    
    public Departamento() {
       this.Descricao = Descricao;
       this.ValorHora = ValorHora;
       this.objFun = objFun;
       this.cont = 0;
    }
    
    public void CadastroDep(String pDescricao, Double pValorHora) {
        setDescricao(pDescricao);
        setValorHora(pValorHora);
    }
    
    public void AddFuncionario(){
        
        Funções Fun = new Funções();
        
        int op;
        String msm = null;
        
        op = Fun.lerInt("Insira o valor da Opção \n 1-Mensalista \n 2-Comissionado \n 3-Horista", msm);
        
        switch(op){
            case 1:
                Mensalista objM = new Mensalista();
                objM.setALL(Fun.LerString("Digite o nome: ",msm), Fun.LerString("Digite a cidade: ",msm), Fun.LerString("Digite o Estado: ",msm), Fun.LerDouble("Digite a quantidade de horas: ",msm), Fun.LerDouble("Digite o valor do Salario: ",msm));
                objFun.add(objM);
                break;
            case 2:
                Comissionado objC = new Comissionado();
                objC.setALL(Fun.LerString("Digite o nome: ",msm), Fun.LerString("Digite a cidade: ",msm), Fun.LerString("Digite o Estado: ",msm), Fun.LerDouble("Digite a quantidade de horas: ",msm), Fun.LerDouble("Digite o valor da Comissão: ",msm), Fun.LerDouble("Digite o valor de venda: ",msm));
                objFun.add(objC);
                break;
            case 3:
                Horista objH = new Horista();
                objH.setALL(Fun.LerString("Digite o nome: ",msm), Fun.LerString("Digite a cidade: ",msm), Fun.LerString("Digite o Estado: ",msm), Fun.LerDouble("Digite a quantidade de horas: ",msm), Fun.LerDouble("Digite a quantidade de horas trabalhadas: ",msm));
                objFun.add(objH);
                break;
            default:
                Fun.ImprimirString("Erro opção invalida!!");
                
        }
        cont++;
    }
    
    
   
    
    
    public void ListarTodosOsSalario(){
        Mensalista men = new Mensalista();
        Comissionado com = new Comissionado();
        Horista hora = new Horista();
        Funções Fun = new Funções();
        
        for(int i = 0; i < objFun.size(); i++){
            
            if(objFun.get(i).getClass() == men.getClass()){
              men = (Mensalista) objFun.get(i);
              Fun.ImprimirString("O funcionario: " + men.getNome() + "Ganha: " + men.calcSalario());
              
            }
            
            if(objFun.get(i).getClass() == com.getClass()){
               com = (Comissionado) objFun.get(i);
               Fun.ImprimirString("O funcionario: " + com.getNome() + "Ganha: " + com.calcSalario());
                
            }
            
            if(objFun.get(i).getClass() == hora.getClass()){
               hora = (Horista) objFun.get(i);
               Fun.ImprimirString("O funcionario: " + hora.getNome() + "Ganha: " + hora.calcSalario());
            }
            
        }
    }
       
}
