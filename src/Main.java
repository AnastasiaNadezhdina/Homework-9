import java.util.Arrays;

//TIP Для <b>запуска</b> кода нажмите <shortcut actionId="Run"/> или
// щелкните значок <icon src="AllIcons.Actions.Execute"/> в боковой области.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] inputArray1 = {5500, 6000, 5000, 7300, 10000};
        int sum = 0;
        int max = inputArray1[0];;
        int min = inputArray1[0];
        double medium = 0;

        for (int element : inputArray1){
            sum = sum + element;
        }
        for (int element : inputArray1){
            if (element > max){
                max = element;
            }
        }

        for (int element : inputArray1){
            if (element < min){
                min = element;
            }
        }

        medium = sum / inputArray1.length;

        double []outputArray1 = {sum, max, min,medium};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1) + "\n");

        System.out.println("Задача 2");

        int [] inputArray2 = {55000, 63000, 58000, 73000, 100000};
        float [] outputArray2 = new float[5];
        int index = 0;
        float tax = 0;
        for (float elements : inputArray2){
            tax = elements * 0.13f;
            outputArray2[index] = tax;
            index++;
        }

        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2) + "\n");

        System.out.println("Задача 3");

        int [] inputArray3 = {5500, 4000, 3800, 7300, 8000};
        boolean bonusSize = true;
        int arrayOfFlags = 0;
        boolean [] outputArray3 = new boolean[5];
        for (int bonus : inputArray3){
            if (bonus >= 5000) {
                bonusSize = true;
            } else {
                bonusSize = false;
            }
            outputArray3[arrayOfFlags] = bonusSize;
            arrayOfFlags++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3) + "\n");

        System.out.println("Задача 4");

        int [] inputArray4 = {350, 400, 200, -120, -300};
        boolean remains = true;
        int indicator = 0;
        boolean [] outputArray4 = new boolean[5];
        for (int money : inputArray4){
            if (money >= 0){
                remains = true;
            }else {
               remains = false;
               break;
            }
            outputArray4[indicator] = remains;
            indicator++;
        }
        System.out.println(remains);
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4) + "\n");

        System.out.println("Задача 5");

        int [] inputArray5 = {5000, 7000, 2000, -200, -3000};
        boolean profit = true;
        int month = 0;
        boolean [] outputArray5 = new boolean[5];
        for (int sumProfit : inputArray5){
            if (sumProfit > 0){
                profit = true;
            } else{
                profit = false;
                continue;
            }
            outputArray5[month] = profit;
            month++;

        }
        System.out.println("Количество месяцев, в которых прибыль была положительной = " + month);
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5) + "\n");
    }
}