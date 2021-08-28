import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hej med dig!");
        FindGennemSnitAfTal();

    }

    public static void FindGennemSnitAfTal(){
        Scanner scanner = new Scanner(System.in);
        String userInput;
        double sumOfValues = 0;
        double amountOfNumbers = 0;
        boolean firstRun = true;



        while(true){
            if(firstRun){
                System.out.print("Indtast et tal: ");
                userInput = scanner.next();
                if(userInput.equals("q") || userInput.equals("Q")) System.exit(0);
                try{
                    sumOfValues = (Double.parseDouble(userInput) + sumOfValues);
                    amountOfNumbers = amountOfNumbers+1;
                    firstRun = false;

                }catch (NumberFormatException exception){
                    System.out.println("Du skal bruge et tal eller trykke 'Q' for at stoppe programmet");
                }

            }else{
            System.out.print("Indtast endnu et tal: ");
            userInput = scanner.next();
            if(userInput.equals("q") || userInput.equals("Q")) System.exit(0);
            try{
                sumOfValues = (Double.parseDouble(userInput) + sumOfValues);
                amountOfNumbers = amountOfNumbers+1;

                System.out.println("Gennemsnittet af de indtastede tal er " + calculateAverage(sumOfValues,amountOfNumbers));

            }catch (NumberFormatException exception){
                System.out.println("Du skal bruge et tal eller trykke 'Q' for at stoppe programmet");
            }
        }
    }}



    public static double calculateAverage(double sum, double amountOfNumbers ){
        return sum/amountOfNumbers;

    }




}
