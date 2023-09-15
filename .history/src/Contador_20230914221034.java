import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o Primeiro parâmetro: ");
        int primeiroParametro = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = terminal.nextInt();

        try {
            verificarParametros(primeiroParametro, segundoParametro);
            imprimirContagem(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: " + exception.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void verificarParametros(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
        	System.out.println("O segundo parâmetro deve ser maior que o primeiro ");
            throw new ParametrosInvalidosException();
        }
    }

    static void imprimirContagem(int primeiroParametro, int segundoParametro) {
        for (int i = primeiroParametro; i <= segundoParametro; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}



        

