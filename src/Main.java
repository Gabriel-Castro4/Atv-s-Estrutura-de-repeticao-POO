import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        exercicios questions = new exercicios();

        System.out.println("Digite o número da questão que você deseja ver: (1 á 16)");
        int escolhaUser = scan.nextInt();

        switch (escolhaUser){
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
    }
}
