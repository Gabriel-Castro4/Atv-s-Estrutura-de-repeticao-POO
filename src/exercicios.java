import java.util.Scanner;

public class exercicios {
    Scanner scan = new Scanner(System.in);

    public void quest1(){
        int i = 0;
        while(i <= 30){
            System.out.println(i);
            i++;
        }
    }
    public void quest2(){
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
