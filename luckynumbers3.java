import java.util.*;
public class luckynumbers3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }
        for (int step = 2; step < num / 2; step++) {
            int c = 0;
            for (int i = 0; i < num; i++) {
                if (arr[i] != 0) {
                    c++;
                }
                if (c%step == 0) {
                    arr[i] = 0;
                }
            }
        }
        for(int i =0; i<arr.length;i++){
            if (arr [i]!=0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}