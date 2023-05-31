import java.util.Scanner;

public class luckyNumbers {
    public static void main(String[] args) {
        // take number input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        // initiate array
        int arr[] = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = i+1;
        }

        // find lucky number
        for (int step = 2; step < num/2; step++) {
            int count = 0;
            for (int i = 0; i < num; i++) {
                // the variable 'count' increase only when the element is not 0
                // this way we can get coorect non-zero elements
                if (arr[i] != 0) {
                    count++;
                }
                // using count to get the correct element
                // and change it to 0
                if (count % step == 0) {
                    arr[i] = 0;
                }
            }
        }
        // print array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        // close scanner
        sc.close();
    }
}
