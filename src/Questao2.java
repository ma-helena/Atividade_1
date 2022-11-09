import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de idade: ");
        int idade = sc.nextInt();

        final double CONSTANTE = 0.023;
        double soma = (double) idade +CONSTANTE;
        System.out.println ("O número da sorte é: " +soma);
    }
}
