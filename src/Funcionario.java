
public class Funcionario {

    private String nome;
    private String cpf;
    private String departamento;
    private String cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cpf, String departamento, String cargo, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Funcionario(String nome, String cpf, Departamento departamento, Cargo cargo, Double salario){
        this.nome = "Indefinido";
        this.cpf = "000.000.000-00";
        this.departamento = null;
        this.cargo = null;
        this.salario = 0.0;
        this.ativo = false;
    }
    
    public void alterarDados(String nome, String cpf, String departamento, String cargo, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public void aplicarReajuste(Double percentual){
        this.salario %= 0.15;
    }
    
    public void demitir(){
        this.ativo = false;
    }

}
