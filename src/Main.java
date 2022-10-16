import java.util.Random;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int money=0;
        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(100_000) + 100_000; money+=arr[i];

        }
        System.out.println("Сумма трат за месяц составила " +money+ " рублей");
        return arr;


            }

    public  static int[] array=generateRandomArray();
    public static void main (String [] args) {

        System.out.println("Task 2");


        int min = 700000;
        int max = -1;
        for (int i = 0; i < array.length; i++) {
           if (min>array[i]){
               min=array[i];

           }
            if (max<array[i]){
                max=array[i];
            }
            System.out.println("Минимальная сумма трат за день составила "+min+ " рублей. Максимальная сумма трат за день составила"+max+" рублей».max");

        }


        System.out.println("task3");

        int sum=0;
        double mean = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];

        }
            mean =  sum/array.length;
        System.out.println("Средняя сумма трат за месяц составила " +mean+ " рублей");


        System.out.println("task4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0;i--) {
            System.out.print(reverseFullName[i]);

        }


    }
}















