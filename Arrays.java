public class Arrays {
    public static void main(String[] args) {
        int age = 20;
        double height = 1.674d;
        String Name = "Pranay";
        char Blood = 'O';

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        int even_num[] = new int[5];
        int odd_num[] = new int[5];

        int count = 0;
        int count_odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even_num[count] = numbers[i];
                count++;
            } else {
                odd_num[count_odd] = numbers[i];
                count_odd++;
            }
        }

        System.out.println("Even Numbers:");
        for (int i = 0; i < even_num.length; i++) {
            System.out.print(even_num[i] + " ");
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < odd_num.length; i++) {
            System.out.print(odd_num[i] + " ");
        }
    }
}