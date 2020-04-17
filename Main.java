import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int number = input.nextInt();
        System.out.println("Enter your array:");
        int arr[] = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter what number you would like to find:");
        int findnum = input.nextInt();
        boolean check = false;
        int a;
        while(!check) {
            check = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    check = false;
                    a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                }
            }
        }
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(arr));
        int f = 0;
        int l = arr.length - 1; 
        func(arr, findnum, f, l);
    }
    public static int func (int[] array, int dig, int least, int highest) {
        int place = -1;
        while (least <= highest) {
            int middle = (least + highest) / 2;
            if (array[middle] < dig) {
                least = middle + 1;
            } else if (array[middle] > dig) {
                highest = middle - 1;
            } else if (array[middle] == dig) {
                place = middle;
                break;
            }
        }
        System.out.print("Index of your number is ");
        System.out.println(place);
        return place;
        }
}
