
public class TesteSistema {

    public static void main(String[] args) {
        Departamento Compras = new Departamento("Compras");
        Departamento Vendas = new Departamento("Vendas");
        Cargo Comprador = new Cargo("Comprador");
        Cargo Vendedor = new Cargo("Vendedor");

        Funcionario Funcionario1 = new Funcionario("Gabriel Martins", "111.111.111.11", Compras, Comprador, 2.200);
        Funcionario Funcionario2 = new Funcionario("Martins Gabriel", "222.222.222-22", Vendas, Vendedor, 3.200);
        Funcionario Funcionario3 = new Funcionario();

        System.out.println("Funcionarios: ");
        System.out.println(Funcionario1);
        System.out.println(Funcionario2);
        System.out.println(Funcionario3);

        alterarDados.Funcionario3("Capivarinha Jorgina", "333.333.333-33", Compras, Comprador, 30.000);

        aplicarReajuste.Funcionario1();

        demitir.Funcionario3();
    }
}
