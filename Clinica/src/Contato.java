public class Contato{
    public String telefone;
    public String email;

    public Contato(String telefone){
        this.telefone = telefone;
    }

    public Contato(String telefone, String email){
        this.telefone = telefone;
        this.email = email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return telefone;
    }

    public String getEmail(){
        return email;
    }
}
