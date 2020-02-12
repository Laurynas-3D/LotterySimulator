public class LotteryStatistics {

    private static int ticketCount;
    private static int winningTickets;
    private static int loosingTickets;
    private static int luckyTicketLevel1;
    private static int luckyTicketLevel2;
    private static int luckyTicketLevel3;
    private static int luckyTicketLevel4;
    private static int luckyTicketLevel5;
    private static int luckyTicketLevel6;
    private static int luckyTicketLevel7;
    private static int luckyTicketLevel8;
    private static int luckyTicketLevel9;
    private static int luckyTicketLevel10;
    private static int luckyTicketLevel11;
    private static int luckyTicketLevel12;
    private static final int PayoutTicketLevel1 = 8;
    private static final int PayoutTicketLevel2 = 10;
    private static final int PayoutTicketLevel3 = 15;
    private static final int PayoutTicketLevel4 = 18;
    private static final int PayoutTicketLevel5 = 21;
    private static final int PayoutTicketLevel6 = 60;
    private static final int PayoutTicketLevel7 = 110;
    private static final int PayoutTicketLevel8 = 240;
    private static final int PayoutTicketLevel9 = 4000;
    private static final int PayoutTicketLevel10 = 100_000;
    private static final int PayoutTicketLevel11 = 500_000;
    private static final int PayoutTicketLevel12 = 90_000_000;

    public LotteryStatistics(){

        gameStatistics();

    }

    private void gameStatistics() {
        System.out.println("++++++++++++ Game Stats ++++++++++++++");
        System.out.println("Tickets Printed: " + getTicketCount());
        System.out.println("Lucky Tickets: " +
                ((getLuckyTicketLevel1() +
                getLuckyTicketLevel2() +
                getLuckyTicketLevel3() +
                getLuckyTicketLevel4() +
                getLuckyTicketLevel5() +
                getLuckyTicketLevel6() +
                getLuckyTicketLevel7() +
                getLuckyTicketLevel8() +
                getLuckyTicketLevel9() +
                getLuckyTicketLevel10() +
                getLuckyTicketLevel11() +
                getLuckyTicketLevel12())));
        System.out.printf("Euros spent: %.2f %s%n" , (getTicketCount() * EuroJackpot.getTicketPrice()) , " €");
        System.out.printf("Euros won: %.2f %s%n" , payoutCalculator() , " €");
        wonTicketStats();

    }

    private double payoutCalculator(){
        double payOutSum = (
                (getLuckyTicketLevel1() * PayoutTicketLevel1)+
                (getLuckyTicketLevel2() * PayoutTicketLevel2)+
                (getLuckyTicketLevel3() * PayoutTicketLevel3)+
                (getLuckyTicketLevel4() * PayoutTicketLevel4)+
                (getLuckyTicketLevel5() * PayoutTicketLevel5)+
                (getLuckyTicketLevel6() * PayoutTicketLevel6)+
                (getLuckyTicketLevel7() * PayoutTicketLevel7)+
                (getLuckyTicketLevel8() * PayoutTicketLevel8)+
                (getLuckyTicketLevel9() * PayoutTicketLevel9)+
                (getLuckyTicketLevel10() * PayoutTicketLevel10)+
                (getLuckyTicketLevel11() * PayoutTicketLevel11)+
                (getLuckyTicketLevel12() * PayoutTicketLevel12));
        return payOutSum;
    }

    private void wonTicketStats(){

        System.out.println("Lucky ticket stats: ");

        if (getLuckyTicketLevel1() == 0)
            System.out.print("");
        else System.out.printf("2+1 = %2d %s%n", getLuckyTicketLevel1(), "tickets won 8 Euros");
        if (getLuckyTicketLevel2() == 0)
            System.out.print("");
        else System.out.printf("1+2 = %2d %s%n" , getLuckyTicketLevel2(), "tickets won 10 Euros");
        if (getLuckyTicketLevel3() == 0)
            System.out.print("");
        else System.out.printf("3 = %4d %s%n" , getLuckyTicketLevel3(), "tickets won 15 Euros");
        if (getLuckyTicketLevel4() == 0)
            System.out.print("");
        else System.out.printf("2+2 = %2d %s%n" , getLuckyTicketLevel4(), "tickets won 18 Euros");
        if (getLuckyTicketLevel5() == 0)
            System.out.print("");
        else System.out.printf("3+1 = %2d %s%n" , getLuckyTicketLevel5(), "tickets won 21 Euros");
        if (getLuckyTicketLevel6() == 0)
            System.out.print("");
        else System.out.printf("3+2 = %2d %s%n" , getLuckyTicketLevel6(), "tickets won 60 Euros");
        if (getLuckyTicketLevel7() == 0)
            System.out.print("");
        else System.out.printf("4 = %4d %s%n" , getLuckyTicketLevel7(), "tickets won 110 Euros");
        if (getLuckyTicketLevel8() == 0)
            System.out.print("");
        else System.out.printf("4+1 = %2d %s%n" , getLuckyTicketLevel8(), "tickets won 240 Euros");
        if (getLuckyTicketLevel9() == 0)
            System.out.print("");
        else System.out.printf("4+2 = %2d %s%n" , getLuckyTicketLevel9(), "tickets won 4,000 Euros");
        if (getLuckyTicketLevel10() == 0)
            System.out.print("");
        else System.out.printf("5 = %4d %s%n" , getLuckyTicketLevel10(), "tickets won 100,000 Euros");
        if (getLuckyTicketLevel11() == 0)
            System.out.print("");
        else System.out.printf("5+1 = %2d %s%n" , getLuckyTicketLevel11(), "tickets won 500,000 Euros");
        if (getLuckyTicketLevel12() == 0)
            System.out.print(""+ EuroJackpot.ANSI_RED + "JackPot prize have not been won\n" + EuroJackpot.ANSI_RESET);
        else System.out.printf("5+2 = %2d %s%n" , getLuckyTicketLevel12(),
                EuroJackpot.ANSI_GREEN + "ticket won 90,000,000 Euros" + EuroJackpot.ANSI_RESET);

    }

    public static int getTicketCount() {
        return ticketCount;
    }

    public static void setTicketCount() {
            ticketCount++;
    }

    public static int getWinningTickets() {
        return winningTickets;
    }

    public static void setWinningTickets(int winningTickets) {
        winningTickets++;
        LotteryStatistics.winningTickets = winningTickets;
    }

    public static int getLoosingTickets() {
        return loosingTickets;
    }

    public static void setLoosingTickets(int loosingTickets) {
        loosingTickets++;
        LotteryStatistics.loosingTickets = loosingTickets;
    }

    public static int getLuckyTicketLevel1() {
        return luckyTicketLevel1;
    }

    public static void setLuckyTicketLevel1() {
        luckyTicketLevel1++;

    }

    public static int getLuckyTicketLevel2() {
        return luckyTicketLevel2;
    }

    public static void setLuckyTicketLevel2() {
        luckyTicketLevel2++;

    }

    public static int getLuckyTicketLevel3() {
        return luckyTicketLevel3;
    }

    public static void setLuckyTicketLevel3() {
        luckyTicketLevel3++;

    }

    public static int getLuckyTicketLevel4() {
        return luckyTicketLevel4;
    }

    public static void setLuckyTicketLevel4() {
        luckyTicketLevel4++;

    }

    public static int getLuckyTicketLevel5() {
        return luckyTicketLevel5;
    }

    public static void setLuckyTicketLevel5() {
        luckyTicketLevel5++;

    }

    public static int getLuckyTicketLevel6() {
        return luckyTicketLevel6;
    }

    public static void setLuckyTicketLevel6() {
        luckyTicketLevel6++;

    }

    public static int getLuckyTicketLevel7() {
        return luckyTicketLevel7;
    }

    public static void setLuckyTicketLevel7() {
        luckyTicketLevel7++;

    }

    public static int getLuckyTicketLevel8() {
        return luckyTicketLevel8;
    }

    public static void setLuckyTicketLevel8() {
        luckyTicketLevel8++;

    }

    public static int getLuckyTicketLevel9() {
        return luckyTicketLevel9;
    }

    public static void setLuckyTicketLevel9() {
        luckyTicketLevel9++;

    }

    public static int getLuckyTicketLevel10() {
        return luckyTicketLevel10;
    }

    public static void setLuckyTicketLevel10() {
        luckyTicketLevel10++;

    }

    public static int getLuckyTicketLevel11() {
        return luckyTicketLevel11;
    }

    public static void setLuckyTicketLevel11() {
        luckyTicketLevel11++;

    }

    public static int getLuckyTicketLevel12() {
        return luckyTicketLevel12;
    }

    public static void setLuckyTicketLevel12() {
        luckyTicketLevel12++;

    }
}
