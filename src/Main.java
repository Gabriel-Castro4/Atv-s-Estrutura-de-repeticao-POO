import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        exercicios questions = new exercicios();

        System.out.println("Olá, seja bem vindo ao nosso catálogo de questões de estrutura de repetição!\n" +
                "Aqui você encontrará diversas questões\n" +
                "==================================\n" +
                "[1]Este é um algoritmo que imprime na tela os números de 0 a 30.\n" +
                "[2]Este é um algoritmo que imprime \n" +
                "   todos os números múltiplos de 3 entre 0 e 100  (while e for)\n" +
                "[3]Este é um algoritmo que imprime  solicita 10 números do usuário e em seguida exiba a \n" +
                "   mensagem “O número {x} é ímpar/par” de acordo com o valor que foi digitado.  (for/while)\n" +
                "[4]Este é um algoritmo que solicita uma palavra ao usuário. Caso a palavra “sim”, o \n" +
                "  programa imprime a mensagem “você decidiu continuar” e solicita mais uma vez\n" +
                "   uma palavra ao usuário. Caso o usuário digite “não”, imprima a mensagem “você\n" +
                "   saiu”, e encerre o programa. Para qualquer outra palavra do usuário, exiba a\n" +
                "   mensagem “palavra inválida” e continue solicitando uma palavra correta.\n" +
                "[5]Este é um algoritmo que solicita a idade de 10 usuários, em seguida exiba a\n" +
                "   média das idades.\n" +
                "[6]Vamos jogar um jogo de adivinha? chute um número até acertar.\n" +
                "[7]Este é um algoritmo que pede 10 números inteiros, calcula e mostra a quantidade\n" +
                "   de números pares e a quantidade de números ímpares.\n" +
                "[8]Este é um algoritmo que solicita dois números ao usuário entre 0 e 20. Em\n" +
                "   seguida imprime na tela todos os números que existem no intervalo.\n" +
                "[9]Este é um algoritmo que lê um nome de usuário e a sua senha e não aceite a\n" +
                "   senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a\n" +
                "   pedir as informações. As informações devem ser solicitadas enquanto o usuário\n" +
                "   digitar as informações incorretas.\n" +
                "[10]Este é um algoritmo que lê 5 números e informa a soma e a média dos\n" +
                "    números.\n" +
                "[11]Este é um algoritmo que solicita um número de 1 á 9 e em seguida\n" +
                "    mostre a tabuada deste número \n" +
                "[12]Esta panificadora possui a seguinte política de preços:o valor da unidade de pão é de R$0,18 de 1 a\n" +
                "    10 pães, R$0,16 de 11 a 20 pães, R$0,13 de 21 a 30 pães, R$0,09 a partir de de\n" +
                "    31 pães.\n" +
                "[13]Vamos jogar um jogo de adivinha? chute um número até acertar,\n" +
                "   só que agora com dicas\n" +
                "[14]Este é um algoritmo que solicita ao usuário 10 números inteiros. Em seguida\n" +
                "    informa o menor deles.\n" +
                "[15]Este é um algoritmo que solicita ao usuário 10 números inteiros. Em seguida\n" +
                "     informa o maior deles.\n" +
                "[16]Um atleta olímpico de salto participou das olimpíadas do brasil e fez um total de\n" +
                "    5 saltos. Este é um algoritmo que solicita a distância atingida pelo atleta em cada\n" +
                "    salto e exibe: O tamanho médio dos saltos, o menor salto e o maior salto.\n");

        for(String escolhaUser = "sim";!escolhaUser.equalsIgnoreCase("não");) {
            System.out.println("Digite o número da questão que você deseja ver: (1 á 16)");
            int escolhaQuest = scan.nextInt();

            switch (escolhaQuest) {
                case 1:
                    questions.quest1();
                    break;
                case 2:
                    questions.quest2();
                    break;
                case 3:
                    questions.quest3();
                    break;
                case 4:
                    questions.quest4();
                    break;
                case 5:
                    questions.quest5();
                    break;
                case 6:
                    questions.quest6();
                    break;
                case 7:
                    questions.quest7();
                    break;
                case 8:
                    questions.quest8();
                    break;
                case 9:
                    questions.quest9();
                    break;
                case 10:
                    questions.quest10();
                    break;
                case 11:
                    questions.quest11();
                    break;
                case 12:
                    questions.quest12();
                    break;
                case 13:
                    questions.quest13();
                    break;
                case 14:
                    questions.quest14();
                    break;
                case 15:
                    questions.quest15();
                    break;
                case 16:
                    questions.quest16();
                    break;

            }
            System.out.println("Você deseja continuar?");
            escolhaUser = scan.next();
            if (escolhaUser.equalsIgnoreCase("não")){
                System.out.println("Obrigado por usar nosso sistema! Até a próxima");
            }
        }
    }
}
