import java.util.Scanner;
public class Ingridience {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minWater = 200;
        int minMilk = 50;
        int minBeans = 15;
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = in.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = in.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = in.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int needsCups = in.nextInt();
        int canCups = 0;
        while(true) {
            if (water >= minWater && milk >= minMilk && beans >= minBeans) {
                canCups++;
                water -= minWater;
                milk -= minMilk;
                beans -= minMilk;
            } else {
                break;
            }
        }
        if(canCups == needsCups){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if(canCups > needsCups){
            int remainingCups = canCups - needsCups;
            System.out.println("Yes, I can make that amount of coffee (and even " + remainingCups + " more than that)\"");
        }
        else{
            System.out.println("\"No, I can make only " + canCups + " cup(s) of coffee\"");
        }


        System.out.println("git!!!!");
    }
}
