package model;
import java .util.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;




/**
 * Escreva uma descrição da classe CursoDAO aqui.
 * 
 * @author (Janaina Mello Moletta) 
 * @version (11/04/2022)
 */
public class CursoDAO
{
    private List<PessoaAluno>lstPessoaAluno;
    
    /**
     * Construtor para objetos da classe CursoDAO
     */
    public PesoaAluno()
    {
        if (lstPessoaAluno.size()== 0){
          lstPessoaAluno = new ArrayList<PessoaAluno>  
     }
    }
    /**
     * Método que grava um PessoaAluno no  Array(List,Set ou Map)
     * 
     * @param  obj  objeto PessoaAluno
     */
    public void inserir(PessoaAluno obj)
    {
      this.lstPessoaAluno.add(obj);
      System.out.println(obj).toString());
    }
    
    /**
     * Metodo que atualiza dados com as informações criadas 
     * @ atualiza lis<PessoaAluno>
     */
     public void inserir(){
         
         atualizar this.listPessoaAluno;
     }

    }
    