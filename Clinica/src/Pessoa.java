public abstract class Pessoa {
    private String nome;
    private char sexo;
    private String naturalidade;
    public Contato contato;

    public Pessoa(String nome, char sexo, String naturalidade){
        this.nome = nome;
        this.sexo = sexo; 
        this.naturalidade = naturalidade;
    }

    public String getNome(){
        return nome;
    }

    public char getSexo(){
        return sexo;
    }

    public void setNaturalidade(String naturalidade){
        this.naturalidade = naturalidade;
    }
 
    public String getNaturalidade(){
        return naturalidade;
    }

    public void setContato(Contato contato){
    }

    public abstract void imprimirFicha();

}
