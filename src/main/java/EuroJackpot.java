import java.util.Random;
import java.util.TreeSet;

public class EuroJackpot {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    private static int ticketSerialNumber = 0;

    private static double ticketPrice = 2.00;
    private TreeSet ticketNumbersMain;
    private TreeSet ticketNumbersBonus;
    private int luckyNumbersMainCount;
    private int luckyNumbersBonusCount;


    public EuroJackpot() {

        // game mechanics
        LotteryStatistics.setTicketCount();
        GenerateTicketNumbersMain();
        GenerateTicketNumbersBonus();
        TicketInfoPrint();
        TicketNumbersCheck();
        WinningsCount();
        System.out.println("-----------------------------");

    }

    public EuroJackpot(int howManyTickets){

        int i = 0;
        while (i < howManyTickets){

            // game mechanics
            LotteryStatistics.setTicketCount();
            GenerateTicketNumbersMain();
            GenerateTicketNumbersBonus();
            TicketInfoPrint();
            TicketNumbersCheck();
            WinningsCount();
            System.out.println("-----------------------------");

            i++;
        }
    }



    private void WinningsCount() {

            if ((luckyNumbersMainCount == 2) && (luckyNumbersBonusCount == 1)){
                LotteryStatistics.setLuckyTicketLevel1();
                System.out.println( ANSI_GREEN + "Won 8 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 1) && (luckyNumbersBonusCount == 2)){
                LotteryStatistics.setLuckyTicketLevel2();
                System.out.println( ANSI_GREEN + "Won 10 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 3) && (luckyNumbersBonusCount == 0)){
                LotteryStatistics.setLuckyTicketLevel3();
                System.out.println( ANSI_GREEN + "Won 15 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 2) && (luckyNumbersBonusCount == 2)){
                LotteryStatistics.setLuckyTicketLevel4();
                System.out.println( ANSI_GREEN + "Won 18 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 3) && (luckyNumbersBonusCount == 1)){
                LotteryStatistics.setLuckyTicketLevel5();
                System.out.println( ANSI_GREEN + "Won 21 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 3) && (luckyNumbersBonusCount == 2)){
                LotteryStatistics.setLuckyTicketLevel6();
                System.out.println( ANSI_GREEN + "Won 60 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 4) && (luckyNumbersBonusCount == 0)){
                LotteryStatistics.setLuckyTicketLevel7();
                System.out.println( ANSI_GREEN + "Won 110 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 4) && (luckyNumbersBonusCount == 1)){
                LotteryStatistics.setLuckyTicketLevel8();
                System.out.println( ANSI_GREEN + "Won 240 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 4) && (luckyNumbersBonusCount == 2)){
                LotteryStatistics.setLuckyTicketLevel9();
                System.out.println( ANSI_GREEN + "Won 4,000 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 5) && (luckyNumbersBonusCount == 0)){
                LotteryStatistics.setLuckyTicketLevel10();
                System.out.println( ANSI_GREEN + "Won 100,000 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 5) && (luckyNumbersBonusCount == 1)){
                LotteryStatistics.setLuckyTicketLevel11();
                System.out.println( ANSI_GREEN + "Won 500,000 Euros" + ANSI_RESET);
            }
            else if ((luckyNumbersMainCount == 5) && (luckyNumbersBonusCount == 2)){
                LotteryStatistics.setLuckyTicketLevel12();
                System.out.println( ANSI_GREEN + "Won 90,000,000 Euros" + ANSI_RESET);
            }

    }

    private int SingleNumberGenerator(int minNumber, int MaxNumber) {

        int randomNumber1 = (int) ((Math.random() * ((MaxNumber - minNumber) + 1)) + minNumber);
        return randomNumber1;

    }

    private TreeSet<Integer> GenerateTicketNumbersMain(){

        ticketSerialNumber++;
        Random rand = new Random();

        int numberNeeded = 5;
        int luckyNumber = 0;

        TreeSet<Integer> randNumbersTree = new TreeSet<>();

        for (int counter = 0; counter < numberNeeded; counter++){
            int number = rand.nextInt(49) + 1 ;
            randNumbersTree.add(number);
            if (randNumbersTree.size() <= 5){
                if (randNumbersTree.size() == 5) {
                    numberNeeded = 4;
                }
                numberNeeded++;
                randNumbersTree.add(number);
            }
        }

        this.ticketNumbersMain = randNumbersTree;
        return randNumbersTree;

    }

    private TreeSet<Integer> GenerateTicketNumbersBonus(){

        Random rand = new Random();

        int numberNeeded = 2;

        TreeSet<Integer> randNumbersTree = new TreeSet<>();

        for (int counter = 0; counter < numberNeeded; counter++){
            int number = rand.nextInt(9) + 1 ;
            randNumbersTree.add(number);
            if (randNumbersTree.size() <= 2){
                if (randNumbersTree.size() == 2) {
                    numberNeeded = 1;
                }
                numberNeeded++;
                randNumbersTree.add(number);
            }
        }
        this.ticketNumbersBonus = randNumbersTree;
        return randNumbersTree;

    }

    private void TicketInfoPrint() {
        
        System.out.printf("\nLottery Euro Jackpot! | ");
        System.out.printf("Ticket number: %06d%n", ticketSerialNumber);
        System.out.printf("Ticket play numbers are : %s - %s%n", ticketNumbersMain, ticketNumbersBonus);
        System.out.printf("Ticket price: %.2f €%n", ticketPrice);
        System.out.println();

    }

    private void TicketNumbersCheck(){

        // Creating the array and using toArray()
        Object[] arrayTicketNumbers = ticketNumbersMain.toArray();
        Object[] arrayLotteryNumbers = EuroJackpotLotteryNumbers.getLotteryNumbersMain().toArray();
        Object[] arrayTicketNumbersBonus = ticketNumbersBonus.toArray();
        Object[] arrayLotteryNumbersBonus = EuroJackpotLotteryNumbers.getLotteryNumbersBonus().toArray();
        int luckyNumberMain = 0;
        int luckyNumberBonus = 0;
        
        int resultOfMainNumber1 = search(arrayLotteryNumbers, arrayTicketNumbers[0]);
        if(resultOfMainNumber1 == -1)
            System.out.print("");
        else {
            System.out.println("Lucky Numbers: " + ANSI_RED + arrayTicketNumbers[0] + ANSI_RESET);
            luckyNumberMain++;
        }

        int resultOfMainNumber2 = search(arrayLotteryNumbers, arrayTicketNumbers[1]);
        if(resultOfMainNumber2 == -1)
            System.out.print("");
        else {
            System.out.println("Lucky Numbers: " + ANSI_RED + arrayTicketNumbers[1] + ANSI_RESET);
            luckyNumberMain++;
        }

        int resultOfMainNumber3 = search(arrayLotteryNumbers, arrayTicketNumbers[2]);
        if(resultOfMainNumber3 == -1)
            System.out.print("");
        else {
            System.out.println("Lucky Numbers: " + ANSI_RED + arrayTicketNumbers[2] + ANSI_RESET);
            luckyNumberMain++;
        }

        int resultOfMainNumber4 = search(arrayLotteryNumbers, arrayTicketNumbers[3]);
        if(resultOfMainNumber4 == -1)
            System.out.print("");
        else {
            System.out.println("Lucky Numbers: " + ANSI_RED + arrayTicketNumbers[3] + ANSI_RESET);
            luckyNumberMain++;
        }

        int resultOfMainNumber5 = search(arrayLotteryNumbers, arrayTicketNumbers[4]);
        if(resultOfMainNumber5 == -1)
            System.out.print("");
        else {
            System.out.println("Lucky Numbers: " + ANSI_RED + arrayTicketNumbers[4] + ANSI_RESET);
            luckyNumberMain++;
        }

        int resultOfBonusNumber1 = search(arrayLotteryNumbersBonus, arrayTicketNumbersBonus[0]);
        if(resultOfBonusNumber1 == -1)
            System.out.print("");
        else {
            System.out.println("Lucky Numbers: " + ANSI_RED + arrayTicketNumbersBonus[0] + ANSI_RESET);
            luckyNumberBonus++;
        }

        int resultOfBonusNumber2 = search(arrayLotteryNumbersBonus, arrayTicketNumbersBonus[1]);
        if(resultOfBonusNumber2 == -1)
            System.out.print("");
        else {
            System.out.println("Lucky Numbers: " + ANSI_RED + arrayTicketNumbersBonus[1] + ANSI_RESET);
            luckyNumberBonus++;
        }

        if ((luckyNumberBonus == 0) && (luckyNumberMain == 0))
            System.out.println("Lucky numbers count: -");
        else
            System.out.println("Lucky numbers count: " + (luckyNumberMain + luckyNumberBonus));

        this.luckyNumbersMainCount = luckyNumberMain;
        this.luckyNumbersBonusCount = luckyNumberBonus;


    }

    public static int search(Object[] arr, Object x){
        int n = arr.length;
        for(int i = 0; i < n; i++){

            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static double getTicketPrice() {
        return ticketPrice;
    }

    public static void setTicketPrice(double ticketPrice) {
        EuroJackpot.ticketPrice = ticketPrice;
    }

    public static int getTicketSerialNumber() {
        return ticketSerialNumber;
    }

} // end class EuroJackpot --------------------------
