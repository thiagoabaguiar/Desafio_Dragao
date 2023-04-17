import java.util.Scanner;

public class App {

    public static void main(String[] args){

        int qtyCasesToTesting = 0;
        int limitEnergy = 8000;
        int actualEnergy = 0;
        String msgForBugs = "Inseto!";
        String msgForNoBugs = "Perigo!";
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a qtd de casos para testagem: ");
        qtyCasesToTesting = scan.nextInt();

        for(int i = 1; i <= qtyCasesToTesting; i++){

            while(actualEnergy < 100 || actualEnergy > 100000){

                System.out.println("Digite o nível da ENERGIA: ");
                actualEnergy = scan.nextInt();
                
            }

            if (actualEnergy <= limitEnergy){
                System.out.println(msgForBugs);
            } else {
                System.err.println(msgForNoBugs);
            }                

        }

        scan.close();

    }

}