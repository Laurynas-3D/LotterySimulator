package cf.laurynas;

import java.util.Random;
import java.util.TreeSet;

public class EuroJackpotLotteryNumbers {

    private static TreeSet lotteryNumbersMain;
    private static TreeSet lotteryNumbersBonus;

    public EuroJackpotLotteryNumbers(){

        GenerateLotteryNumbersMain();
        GenerateLotteryNumbersBonus();
        LotteryNumbersPrint();

    }

    public static TreeSet getLotteryNumbersMain() {
        return lotteryNumbersMain;
    }

    public static TreeSet getLotteryNumbersBonus() {
        return lotteryNumbersBonus;
    }

    private TreeSet<Integer> GenerateLotteryNumbersMain(){


        Random rand = new Random();

        int numberNeeded = 5;

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
        this.lotteryNumbersMain = randNumbersTree;
        return randNumbersTree;

    }

    private TreeSet<Integer> GenerateLotteryNumbersBonus(){

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
        this.lotteryNumbersBonus = randNumbersTree;
        return randNumbersTree;

    }

    private void LotteryNumbersPrint() {
        System.out.printf("\nLottery Euro Jackpot Numbers Are!\n");
        System.out.printf("Lottery numbers are : %s - %s%n", lotteryNumbersMain, lotteryNumbersBonus);
        System.out.println();

    }

} // end of EuroJackpot.EuroJackpotLotteryNumbers class