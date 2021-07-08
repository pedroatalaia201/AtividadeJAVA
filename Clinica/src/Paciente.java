public class Paciente extends Pessoa {
    public double altura;
    public double peso;
    public Contato contato;
    //public Contato contato = new Contato();

    public Paciente(String nome, char sexo, double altura, double peso,Contato contato, String naturalidade){
        super(nome, sexo, naturalidade);
        this.altura = altura;
        this.peso = peso; 
        this.contato = contato;       
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
        if(getSexo() == 'M'){
            System.out.println("Sr. " + getNome() + "\nNatural de: " + getNaturalidade() + "  Fone: " + contato.getTelefone() + 
            "E-mail: " + contato.getEmail());
            System.out.println("IMC: " + calcularImc());
        }
        else{
            System.out.println("Sra. " + getNome() + "\nNatural de: " + getNaturalidade() + "  Fone: " + contato.getTelefone() + 
            "E-mail: " + contato.getEmail());
            System.out.println("IMC: " + calcularImc());
        }
        
    }
    
    
}
