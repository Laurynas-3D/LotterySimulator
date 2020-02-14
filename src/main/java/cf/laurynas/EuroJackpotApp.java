package cf.laurynas;

/**
 * This program:
 *  - simulates game based on "Euro Jackpot" lottery in a simplified way.
 */

public class EuroJackpotApp {

    public static void main(String[] args){

        new EuroJackpotLotteryNumbers();
        new EuroJackpot(100);
        new LotteryStatistics();

    }

    // Multithreading is not yet implemented
    // it is not recommended to buy more than 3,000,000 tickets

}
