package projeto;

import java.util.ArrayList;

public class Projeto {

   public static void main(String[] args) {
        
       ArrayList<Departamento> Dep = new ArrayList();
       Funções Fun = new Funções();
       String msg = null;
       int op, op2, op3 = 0;
       do{
           
           op=Fun.lerInt("1- Cadastro de Departamento\n 2- Cadastro de Funcionario\n 3- Listar Salarios por departamento\n 4- Todos os Salarios do departamento\n 5- Todos os Salarios 6- Sair\n Selecione a opção: ", msg);
           
           switch(op){
               
               case 1:
                   Departamento objDep = new Departamento();
                   objDep.CadastroDep(Fun.LerString("Insira a Descrição do departamento: ", msg), Fun.LerDouble("Insira o valor da hora: ", msg));
                   Dep.add(objDep);
                   break;
                   
               case 2:
                   for(int i=0; i < Dep.size(); i++){
                       op3 = Fun.lerInt(i + " - " + Dep.get(i).getDescricao(), msg);
                   }
                   Dep.get(op3).AddFuncionario();
                break;
                
               case 3:
                   
                   break;
               case 4:
                   
                   break;
               case 5:
                   
                   break;
               case 6:
                   
                   System.exit(0);
                   break;
           }
               
               
             
               
              
       }while(true);
           
       
       
    }
    
}
