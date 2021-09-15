import java.util.Objects;

public class Gerente extends Funcionario implements Autenticavel {
    
    private String login;
    private String senha;
    
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.cargo = "Gerente";
    }
    
    public double getBonificacao() {
        return super.getBonificacao(1) + this.getSalario();
    }
    
    @Override
    public void setCredenciais(String login, String senha) {
        
        if (login.length() >= 6 && login.length() <= 12) {
            this.login = login;
        } else System.out.println("O seu login precisa ter entre 6 e 12 caracteres.");
        
        if (senha.length() >= 6 && senha.length() <= 8) {
            this.senha = senha;
        } else System.out.println("A sua senha precisa ter entre 6 e 8 caracteres.");
    }
    
    @Override
    public String getLogin() {
        return this.login;
    }
    
    @Override
    public boolean autenticar(String senha) {
        String caller = this.getCargo() + " @" + this.getLogin();
        
        if (Objects.equals(senha, this.senha)) {
            System.out.println("Autenticando " + caller + " ...");
            return true;
        } else return false;
    }
    
}
