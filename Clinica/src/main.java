import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class App{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        int op = 0;
        while(op != 3){
            System.out.print("1- Cadastrar paciente;\n2- Listar pacientes;\n3- Sair;\n");
            op= Integer.parseInt(read.nextLine());

            if(op == 1){
                System.out.print("Digite o nome do paciente:");
                String nome = read.nextLine();

                System.out.print("Digite o sexo do paciente(M/F): ");
                char sexo = read.nextLine().charAt(0);

                System.out.print("Digite a altura  do paciente: ");
                double altura = Double.parseDouble(read.nextLine());

                System.out.print("Digite o peso do paciente: ");
                double peso = Double.parseDouble(read.nextLine());

                System.out.print("Digite a nacionalidade do paciente: ");
                String naturalidade = read.nextLine();

                System.out.println("Digite os contatos do paciente: ");
                System.out.print("Telefone: ");
                String telefone = read.nextLine();               

                System.out.println("O paciente possue e-mail? (s/n)");
                char possue = read.nextLine().charAt(0);

                if(possue == 's'){
                    System.out.print("E-mail: ");
                    String email = read.nextLine();

                    Contato contato = new Contato(telefone, email);
                    list.add(new Paciente(nome, sexo, altura, peso, contato, naturalidade));
                }
                else{
                    Contato contato = new Contato(telefone);
                    list.add(new Paciente(nome, sexo, altura, peso, contato, naturalidade));
                }                                                   
            }

            if(op == 2){
                for (Pessoa pessoa : list) {
                    pessoa.imprimirFicha();
                }
            }
        }
        read.close();
    }   
}