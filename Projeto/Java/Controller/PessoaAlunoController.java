package controller;
import model.*;
import java.*;
/**
 * Escreva uma descrição da classe PessoaAlunoController aqui.
 * 
 * @author (Jananaina Mello Moletta) 
 * @version (11/04/2022)
 */
public class PessoaAlunoController
{

    /**
     * Método que pega os dados da PessoaAluno para cadastrar
     * 
     * @param String nome
     * @param Integer telefone
     * @param Integer datadenascimento
     * @param Integer data de cadastro da pessoa
     * @param Integer nota final do curso
     * @param Double nota final 
     * @param Boolean true caso o curso informe a nota final do curso,deve ser criado um aluno caso não seja informada,deve ser criada uma pessoa
     * 
     */
    public boolean pegaraDados(String nome, Integer telefone,Integer datadenascimento,Integer data de cadastro da pessoa,Integer nota final do curso,Double nota final);
    { 
        //criar  o objeto PessoaAluno,ajustar os dados
        PessoaAluno = new.PessoaAluno();
        objPessoaAluno.setNome(nom);
        objPessoaAluno.setTelefone(tel);
        objPessoaAluno.setDatadenascimeto(data de nascimento);
        objPessoaAluno.setDatade cadastrodapessoa(data de cadastro da pessoa);
        objPessoaAluno.setNotafinal curso(nota final curso);
        objPessoaAluno.setNota final (nota final );
        //atualizar dados de uma pessoa ou aluno
        //deletar uma pessoa ou aluno
        //encerrar o programa
       PessoaAluno daoPessoaAluno = newPessoaAluno();
       daoPessoAlunoinserir(objPessoAluno);
       
       return true;
    }

   /**
   *Colocar os comentarios   
   */
    public String atualizarDados(){
        PessoaAlunoDAO daoPessoaAluno = new PesoaAluno();
        Lis<PessoaAluno>listPessoaAluno= daoPessoaAluno
        return lstPessoaAluno.toString();
    }


