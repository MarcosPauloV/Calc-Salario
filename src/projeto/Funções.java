package projeto;

import javax.swing.JOptionPane;

public class Funções {
  
    public static void printErro(String msg){
            
          JOptionPane.showMessageDialog(null,msg,"mensagem de erro",JOptionPane.ERROR_MESSAGE);
          
      }
    
    
    
     public static int lerInt(String Titulo, String msg){
        
        try{
            
            String S = JOptionPane.showInputDialog(null,Titulo,msg,JOptionPane.QUESTION_MESSAGE);///Função que apresenta caixa de dialogo na tela

            int numero = Integer.parseInt(S);//Função que converte de STRING para INT

               return numero;
               
        }catch(NumberFormatException Erro){
             System.err.println("Erro de conversão de inteiro" + Erro.getMessage());
            return -1;
            
            
        }

       
    }
    
    public static String LerString(String Titulo ,String msg){
    
        try{
        
            String LeituraString = JOptionPane.showInputDialog(null,Titulo,msg,JOptionPane.QUESTION_MESSAGE);
            return LeituraString;
            
        }catch(NumberFormatException Erro){
             String LeituraString = "Erro";
             return LeituraString;
            
            
        }
        
    }
     
    public static void ImprimirString(String msg){
        
        JOptionPane.showMessageDialog(null,msg, "Informação", JOptionPane.INFORMATION_MESSAGE);
        

    }
    
    public static void ImprimirInt(int msg){
        
        JOptionPane.showMessageDialog(null,msg, "Informação", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
  
    
}
