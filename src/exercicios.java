import java.util.Scanner;

public class exercicios {
    Scanner scan = new Scanner(System.in);

    public void quest1(){
        int i = 0;

        System.out.println("Faça um programa que imprima na tela os números de 0 a 30.");

        while(i <= 30){
            System.out.println(i);
            i++;
        }
    }
    public void quest2(){
        System.out.println("Faça um programa que imprima todos os números múltiplos de 3 entre 0 e 100  (while e for");
        int i = 0;

        while (i <= 100){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }

        System.out.println("===============");

        for (int num = 0; num <= 100; num++){
            if(num % 3 == 0) {
                System.out.println(num);
            }
        }

    }
    public void quest3(){
        System.out.println("Faça um programa que solicita 10 números do usuário e em seguida exiba a\n" +
                "mensagem “O número {x} é ímpar/par” de acordo com o valor que foi digitado.  (for/while");
        for (int i = 1; i <= 10; i++){
            System.out.println(i + "- Insira um número inteiro: ");
            int userNum = scan.nextInt();

            if (userNum % 2 == 0){
                System.out.println(userNum + " É par");
            }else {
                System.out.println(userNum + " É ímpar");
            }
        }

        System.out.println("=========================");

        int n = 1;
        while(n <= 10){
            System.out.println(n + "- Insira um número inteiro: ");
            int userNum = scan.nextInt();

            if (userNum % 2 == 0){
                System.out.println(userNum + " É par");
            }else {
                System.out.println(userNum + " É ímpar");
            }
            n++;
        }
    }
    public void quest4(){
        System.out.println("Faça um programa que solicite uma palavra ao usuário. Caso a palavra “sim”, o\n" +
                "programa imprime a mensagem “você decidiu continuar” e solicita mais uma vez\n" +
                "uma palavra ao usuário. Caso o usuário digite “não”, imprima a mensagem “você\n" +
                "saiu”, e encerre o programa. Para qualquer outra palavra do usuário, exiba a\n" +
                "mensagem “palavra inválida” e continue solicitando uma palavra correta.");
        for (int perguntas = 1;;perguntas++){
            System.out.println("Digite uma palavra: ");
            String resposta = scan.next();

            if(resposta.equalsIgnoreCase("Sim"))
            {
                System.out.println("Você decidiu continuar");
            }
            else if (resposta.equalsIgnoreCase("Nao")
                    || resposta.equalsIgnoreCase("não"))
            {
                System.out.println("Você decidiu encerrar");
                break;
            }
            else
            {
                System.out.println("Palavra inválida");
            }
        }
    }
    public void quest5(){
        System.out.println("Faça um programa que solicite a idade de 10 usuários, em seguida exiba a\n" +
                "média das idades.");
        int soma = 0;

        System.out.println("Digite o total de pessoas: ");
        int numPessoas = scan.nextInt();

        int i;
        for (i = 1; i <= numPessoas; i++)
        {
            System.out.println(i + "- Insira sua idade: ");
            int idade = scan.nextInt();
            soma = soma + idade;
            System.out.println(soma);

        }
        System.out.println("Soma das idades: " + soma);
        double mediaIdade = (double) soma / numPessoas;
        System.out.printf("A média de idada é: %.2f%n", mediaIdade);

    }
    public void quest6(){
        System.out.println("Vamos criar um jogo de adivinha. Primeiramente crie uma variável com um\n" +
                "número secreto. Em seguida faça um looping que solicite um número ao\n" +
                "usuário. Verifique se o usuário acertou. Caso tenha acertado, mostre a\n" +
                "mensagem “você acertou! O número secreto é {…}”. O programa somente para de\n" +
                "solicitar os números quando o número secreto é acertado.");
        int numSec = 20;

        while (true)
        {
            System.out.println("Advinhe o número: ");
            int chute = scan.nextInt();

            if (chute == numSec)
            {
                System.out.println("Você acertou, o número secreto é " + numSec);
                break;
            }
            else
            {
                System.out.println("Tente novamente");
            }
        }

    }
    public void quest7(){
        System.out.println("Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade\n" +
                "de números pares e a quantidade de números ímpares.");
        int i;
        int contadorPar = 0;
        int contadorImpar = 0;

        for (i = 1; i <= 10; i++){
            System.out.println(i + "- Insira um número inteiro: ");
            int userNum = scan.nextInt();

            if (userNum % 2 == 0){
                System.out.println(userNum + " É par");
                contadorPar++;
            }else {
                System.out.println(userNum + " É ímpar");
                contadorImpar++;
            }
        }
        System.out.println("A quantidade de número pares são: " + contadorPar);
        System.out.println("A quantidade de número ímpares são: " + contadorImpar);

    }
    public void quest8(){
        System.out.println("Faça um programa que solicite dois números ao usuário entre 0 e 20. Em\n" +
                "seguida imprima na tela todos os números que existem no intervalo.");

        System.out.println("Digite um número entre 0 e 20: ");
        int n1 = scan.nextInt();
        System.out.println("Digite outro número entre 0 e 20: ");
        int n2 = scan.nextInt();

        if(n1 > 20 || n2 > 20 || n1 < 0 || n2 < 0){
            System.out.println("Você só pode escolher números entre 0 e 20");
        }
        else if (n1 < n2){
            for (;n1 < n2; n1++){
                System.out.println(n1);
            }
        }else if (n2 < n1){
            for (; n2 < n1; n2++){
                System.out.println(n2);
            }
        }

        System.out.println("==============");
        System.out.println("Agora utilizando o while:  ");

        System.out.println("Digite um número entre 0 e 20: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número entre 0 e 20: ");
        int num2 = scan.nextInt();

        if(num1 > 20 || num2 > 20 || num1 < 0 || num2 < 0){
            System.out.println("Você só pode escolher números entre 0 e 20");
        }
        else if (num1 < num2)
        {
            while (num1 < num2){
                System.out.println(num1);
                num1++;
            }
        }else {
            while (num2 < num1){
                System.out.println(num2);
                num2++;
            }
        }

    }
    public void quest9(){
        System.out.println("Faça um programa que leia um nome de usuário e a sua senha e não aceite a\n" +
                "senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a\n" +
                "pedir as informações. As informações devem ser solicitadas enquanto o usuário\n" +
                "digitar as informações incorretas.");
        for (int login = 1;;login++){
            System.out.println("Digite seu nome: ");
            String nomeUser = scan.next();
            System.out.println("Digite sua senha: ");
            String senhaUser = scan.next();

            if (nomeUser.equalsIgnoreCase(senhaUser)){
                System.out.println("Sua senha não pode ser o seu nome de usuário");
            }else{
                System.out.println("Login realizado com sucesso");
                break;
            }
        }

    }
    public void quest10(){
        System.out.println("Faça um programa que leia 5 números e informe a soma e a média dos\n" +
                "números.");
        int soma = 0;
        int i;
        for (i = 1; i <= 5; i++)
        {
            System.out.println(i + "- Insira um número: ");
            int idade = scan.nextInt();
            soma = soma + idade;
            System.out.println(soma);

        }
        System.out.println("Soma das idades: " + soma);
        double mediaIdade = (double) soma / 5;
        System.out.printf("A média de idada é: %.2f%n", mediaIdade);

    }
    public void quest11(){
        System.out.println("Vamos ajudar uma criança a aprender a tabuada. Faça um programa que solicite\n" +
                "um número de 1 a 9, e em seguida mostre a tabuada desse número. Ex. Dada a\n" +
                "entrada 5 seu programa deve mostrar:" +
                "5 x 1 = 5\n" +
                "5 x 2 = 10");
        System.out.println("Digite um número entre 1 e 9 que você deseja saber a tabuada: ");
        int tabuada = scan.nextInt();

        if (tabuada > 9 || tabuada < 0){
            System.out.println("Você só pode digitar um número entre 1 e 9");
        }else{
            for (int i = 0; i <= 10; i++){
                System.out.println(tabuada * i);
            }
        }

    }
    public void quest12(){
        System.out.println("Você como programador foi convidado a desenvolver um sistema da\n" +
                "panificadora São José. Essa panificadora adota uma política de preços de\n" +
                "desconto progressivo. o Cálculo do valor da unidade de pão é de R$0,18 de 1 a\n" +
                "10 pães, R$0,16 de 11 a 20 pães, R$0,13 de 21 a 30 pães, R$0,09 a partir de de\n" +
                "31 pães. Faça um algoritmo que receba a quantidade de pães desejada e calcule\n" +
                "o preço total da compra. Mostre a resposta da seguinte forma:\n" +
                "1 unidade(s): R$0,x\n" +
                "2 unidade(s): R$0,2x\n" +
                "…\n" +
                "Valor total: R$ x, x");
        double precoUnidadePaes;
        double somaPrecoUnidade = 0;

        System.out.println("Seja bem-vindo(a)! Quantos pães vai querer?");
        System.out.println("Insira o valor da quantidade: ");
        int qtdUnidadePaes = scan.nextInt();

        for (int i = 1; i <= qtdUnidadePaes; i++){

            if(i > 0 && i <=  10){
                precoUnidadePaes = 0.18;
                somaPrecoUnidade += precoUnidadePaes;
            } else if (i > 10 && i <= 20){
                precoUnidadePaes = 0.16;
                somaPrecoUnidade += precoUnidadePaes;
            } else if (i > 20 && i <= 30) {
                precoUnidadePaes = 0.13;
                somaPrecoUnidade += precoUnidadePaes;
            } else {
                precoUnidadePaes = 0.09;
                somaPrecoUnidade += precoUnidadePaes;
            }

            System.out.printf(i + " unidade(s): R$ %.2f\n", somaPrecoUnidade);

        }

    }
    public void quest13(){
        System.out.println("Vamos fazer um jogo. Defina um número secreto. Em seguida, solicite um\n" +
                "número ao usuário. Caso o usuário acerte, exiba a mensagem “Parabéns! Você\n" +
                "acertou.” Caso o valor digitado seja menor que o número secreto, exiba “Ainda\n" +
                "não. Escolha um número maior”. Caso o valor digitado seja maior, exiba a\n" +
                "mensagem “Ainda não. Escolha um número menor.” . O jogo só termina quando\n" +
                "o usuário acertar o número secreto.");
        int numSec = 20;

        while (true)
        {
            System.out.println("Advinhe o número: ");
            int chute = scan.nextInt();

            if (chute == numSec)
            {
                System.out.println("Você acertou, o número secreto é " + numSec);
                break;

            } else if (chute < numSec) {
                System.out.println("Chute um número maior");

            } else
            {
                System.out.println("chute um número menor");
            }
        }

    }
    public void quest14(){
        System.out.println("Faça um programa que solicite ao usuário 10 números inteiros. Em seguida\n" +
                "informe o menor deles.");
        int numMenor = 0;

        System.out.println("Informe dez números e direi qual é o menor entre eles.");

        for (int i = 1; i <= 10; i++){
            int userNum = scan.nextInt();
            if (i == 1){
                numMenor = userNum;
            } else if (userNum < numMenor){
                numMenor = userNum;
            }
        }

        System.out.println("O menor número dos quais você inseriu foi: " + numMenor);

    }
    public void quest15(){
        System.out.println("Faça um programa que solicite ao usuário 10 números inteiros. Em seguida\n" +
                "informe o maior deles.");
        int numMaior = 0;

        System.out.println("Informe dez números e direi qual é o maior entre eles.");

        for (int i = 1; i <= 10; i++){
            int userNum = scan.nextInt();
            if (i == 1){
                numMaior = userNum;
            } else if (userNum > numMaior){
                numMaior = userNum;
            }
        }

        System.out.println("O maior número dos quais você inseriu foi: " + numMaior);

    }
    public void quest16(){
        System.out.println("Um atleta olímpico de salto participou das olimpíadas do brasil e fez um total de\n" +
                "5 saltos. Faça um programa que solicite a distância atingida pelo atleta em cada\n" +
                "salto e exiba: O tamanho médio dos saltos, o menor salto e o maior salto.");
        double saltoMaior = 0;
        double saltoMenor = 0;
        double mediaSaltos = 0;

        System.out.println("Digite as distâncias do salto do viado: ");

        for (int i = 1; i <= 5; i++){
            double saltos = scan.nextDouble();
            mediaSaltos += saltos;

            if (i == 1){
                saltoMaior = saltos;
                saltoMenor = saltos;
            } else if (saltos > saltoMaior) {
                saltoMaior = saltos;
            } else if (saltos < saltoMenor) {
                saltoMenor = saltos;
            }
        }
        System.out.printf("A média dos saltos é: %.2f\n", mediaSaltos / 5);
        System.out.printf("O maior salto foi: %.2f\n", saltoMaior);
        System.out.printf("O menor salto foi: %.2f\n", saltoMenor);

    }

}
