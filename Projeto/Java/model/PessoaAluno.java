package model;


/**
 * Escreva uma descrição da classe PessoaAluno aqui.
 * 
 * @author (Janaina Mello Moletta) 
 * @version (11/04/2022)
 */
public class PessoaAluno
{
  private String nome;
  private Integer telefone;
  private Integer datadenascimento;
 
public PessoaAluno() {
    this.nome = "Aluno";
    this.telefone = 0;
    this.datadenascimento=0;
    }
 
public PessoaAluno(String nome, int telefone,int datadenascimento) {
    this.nome = nome;
    this.telefone =telefone;
    this.datadenascimento =datadenascimento;
    }

public void setNome(String nome) {
    this.nome = nome;
}
public String getNome() {
    return this.nome;
}

public void setTelefone(Integer telefone) {
     this.telefone = telefone;
}
public Integer getTelefone() {
    return this.telefone;
}

public void setDatadadenascimento(Integer datadenascimento) {
    this.datadenascimento =datadenascimento;
    
}
public Integer getdatadenascimento(){
    return this.datadenascimento;
    
   }
 }

