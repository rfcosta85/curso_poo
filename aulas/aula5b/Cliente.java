package aulas.aula5b;

public class Cliente 
{

    public static void main(String[] args) 
    {
        
        ContaBanco cliente1 = new ContaBanco();

        cliente1.abrirConta("CC");
        cliente1.setNumeroConta(28931);
        cliente1.setDono("Jubileu");        
        cliente1.depositar(300);
        System.out.println("\nNome do Cliente: " + cliente1.getDono());
        System.out.println("\nNumero da Conta: " + cliente1.getNumeroConta());        
        cliente1.pagarMensalidade();
        System.out.println("\nSaldo da conta corrente é de: " + cliente1.getSaldo() + "\n");
        
        ContaBanco cliente2 = new ContaBanco();

        cliente2.abrirConta("CP");
        cliente2.setNumeroConta(18994);
        cliente2.setDono("Creuza");
        cliente2.depositar(500);
        System.out.println("\nNome do Cliente: " + cliente2.getDono());
        System.out.println("\nNúmero da Conta: " + cliente2.getNumeroConta());
        cliente2.pagarMensalidade();
        System.out.println("\nSaldo da conta corrente é de: " + cliente2.getSaldo() + "\n");

    }

}
