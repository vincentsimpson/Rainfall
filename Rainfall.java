import java.util.Scanner;

public class Rainfall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int dailyRainfall;
        int count = 0;

        double average = 0;
        boolean b = true;

        do {
            System.out.print("Enter the daily rainfall: ");
            dailyRainfall = input.nextInt();
            if(dailyRainfall < 0) {
                b = true;
            } else if(dailyRainfall == 99999) {
                b = false;
            } else {
                total += dailyRainfall;
                count++;
            }


        }while (b);

        if(count > 0){
            average = total / count;
        }
        System.out.println("The average daily rainfall is: " + average);
        input.close();




    }

}