public class findEvenNumber {
    public static void main(String[] arg)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Even numbers in the array:");
        for(int number:numbers)
        {
            if(number%2==0) {
                System.out.println(number);
            }
        }

    }
}
