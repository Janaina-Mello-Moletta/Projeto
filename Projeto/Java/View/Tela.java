package View;

import controller.*;
import model.*;
import java.util.*;




/**
 * Escreva uma descrição da classe Tela aqui.
 * 
 * @author (Janaina Mello Moletta) 
 * @version (11/04/2022)
 */
  public class Tela
{
   public static void  inicializarApp()
   {
     
   Scanner sc= new Scanner(System.in);
   int opt =99;
   List<PessoaAluno>ListPessoaAluno=new ArrayList<PessoaAluno>();
   //referencia do controller
   PessoaAlunoController ctl= newPessoaAlunoController();
 
 while(opt!=0)
 {
     System.out.println("Nome");
     System.out.println("telefone");
     System.out.println("data de nascimento");
     System.out.println("data de cadastro da pessoa");
     System.out.println("data da ultima alteração");
     System.out.println("nota final do curso");
     System.out.println("informções de uma pessoa aluno");
    
     if(opt==1){
     //mostrar todas as pessoas e alunos criadas 
     //Atualizar dados de uma pessoa ou aluno
     //Deletar uma pessoa ou aluno
     //Encerrar o programa
     //pega os dados da Pessoa Aluno
     Systen.out.print("informe o nome");
     String nom = sc.nextLine(nom);
     Systen.out.print("informe telefone");
     String nom = sc.nextLine(telefone);
     Systen.out.print("informe data de cadastro da pessoa");
     String nom = sc.nextLine(data de cadastro da pessoa);
     Systen.out.print("informe data da ultima alteração");
     String nom = sc.nextLine(data da ultima alteração);
     Systen.out.print("informe informações de uma pessoa aluno");
     String nom = sc.nextLine(informe informações de uma pessoa aluno);
     //envia para controller
     boolean ok = clt.pegarDados("","", "","","");
     //Pega o retorno e exibe mensagem 
    
    
     if (ok) {
     

        
    }
    
      else if(opt==2) {
          //caso o usuario informe a nota final do curso,deve ser criado um aluno caso não seja informada,deve ser criada uma pessoa
          //pega o dado a ser informado(nome,telefone data de nascimento e curso)
          //data de cadastro de pessoa
          //data da ultima alteração
          //nota final do curso
          //envia para o controller e exibe mensagem na tela
          String ListPessoaAluno = ctlpegarDados();
          System.out.println(lisPessoaAluno);
        }
        else {
            System.out.println("Informe a nota final do curso");
        
        
         }
       } 
       
     }  


   








   