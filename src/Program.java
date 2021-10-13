import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ingridience = new int[]{400, 540, 120, 550, 9};
        int waterIndex = 0;
        int milkIndex = 1;
        int beansIndex = 2;
        int moneyIndex = 3;
        int cupIndex = 4;
        int[] espresso = new int[]{250, 0, 16, 4};
        int[] latte = new int[]{350, 75, 20, 7};
        int[] cappuchino = new int[]{200, 100, 12, 6};
        while(true){
            System.out.println("The coffee machine has:");
            System.out.println(ingridience[waterIndex] + " ml of water");
            System.out.println(ingridience[milkIndex] + " ml of milk");
            System.out.println(ingridience[beansIndex] + " g of coffee beans");
            System.out.println(ingridience[cupIndex] + " disposable cups");
            System.out.println("$ " + ingridience[moneyIndex] + " of money");
            System.out.println("Write action (buy, fill, take): ");
            String action = in.nextLine();
            if(action.equals("buy")){
                ingridience = buy(ingridience, waterIndex, milkIndex, beansIndex, moneyIndex, cupIndex, espresso, latte, cappuchino);
                continue;
            }
            else if(action.equals("fill")){
                ingridience = fill(ingridience,waterIndex, milkIndex, beansIndex, moneyIndex, cupIndex);
                continue;
            }
        }
    }
    public static int[] buy(int[] ingridience,int waterIndex, int milkIndex, int beansIndex, int moneyIndex, int cupIndex,
                            int[] espresso, int[] latte, int[] cappuchino) {
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int kind = in.nextInt();
        switch (kind) {
            case 1:
                if (espresso[waterIndex] <= ingridience[waterIndex] && espresso[beansIndex] <= ingridience[beansIndex]) {
                    ingridience[moneyIndex] += espresso[moneyIndex];
                    ingridience[waterIndex] -= espresso[waterIndex];
                    ingridience[beansIndex] -= espresso[beansIndex];
                    ingridience[cupIndex]--;
                }
                break;
            case 2:
                if (latte[waterIndex] <= ingridience[waterIndex] && latte[milkIndex] <= ingridience[milkIndex]
                        && latte[beansIndex] <= ingridience[beansIndex]) {
                    ingridience[moneyIndex] += latte[moneyIndex];
                    ingridience[milkIndex] -= latte[milkIndex];
                    ingridience[waterIndex] -= latte[waterIndex];
                    ingridience[beansIndex] -= latte[beansIndex];
                    ingridience[cupIndex]--;
                }
                break;
            case 3:
                if (cappuchino[waterIndex] <= ingridience[waterIndex] && cappuchino[milkIndex] <= ingridience[milkIndex]
                        && cappuchino[beansIndex] <= ingridience[beansIndex]) {
                    ingridience[moneyIndex] += cappuchino[moneyIndex];
                    ingridience[milkIndex] -= cappuchino[milkIndex];
                    ingridience[waterIndex] -= cappuchino[waterIndex];
                    ingridience[beansIndex] -= cappuchino[beansIndex];
                    ingridience[cupIndex]--;
                }
                break;
        }
        return ingridience;
    }
    public static int[] fill(int[] ingridience,int waterIndex, int milkIndex, int beansIndex, int moneyIndex, int cupIndex){
        Scanner in = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        ingridience[waterIndex] += in.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        ingridience[milkIndex] += in.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        ingridience[beansIndex] += in.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        ingridience[cupIndex] += in.nextInt();
        return ingridience;
    }
    public static void take(){

    }
}
