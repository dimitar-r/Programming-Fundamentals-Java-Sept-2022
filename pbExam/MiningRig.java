package pbExam;

import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceVideo = Integer.parseInt(scanner.nextLine());
        int priceTransition = Integer.parseInt(scanner.nextLine());
        double priceEnergyPerDay = Double.parseDouble(scanner.nextLine());
        double profitOneVideoOneDay = Double.parseDouble(scanner.nextLine());
        int priceAllVideos = priceVideo * 13 ;
        int priceAllTransitions = priceTransition * 13;
        int allMoneySpent = priceAllVideos + priceAllTransitions + 1000;
        double profitVideo = profitOneVideoOneDay - priceEnergyPerDay;
        double totalProfitVideos = 13 * profitVideo;
        double days = allMoneySpent / totalProfitVideos;
        System.out.println(allMoneySpent);
        System.out.printf("%.0f",Math.ceil(days));
    }
}
