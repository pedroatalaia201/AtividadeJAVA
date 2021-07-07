public class Paciente extends Pessoa {
    public double altura;
    public double peso;

    //public Contato contato = new Contato();

    public Paciente(String nome, char sexo, double altura, double peso,String email, String telefone, String naturalidade){
        super(nome, sexo, naturalidade);
        this.altura = altura;
        this.peso = peso; 
        contato.setEmail(email);   
        contato.setTelefone(telefone);
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public double calcularImc(){
        return peso / (altura * altura);
    }

    @Override
    public void imprimirFicha() {
        System.out.println("Sr. | Sra. " + getNome() + "\nNatural de: " + getNaturalidade() + "  Fone: " + contato.getTelefone() + "E-mail: " + 
        contato.getEmail());
            System.out.println("IMC: " + calcularImc());
    }
    
    
}
