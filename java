import java. util.Arrays;
import java.util.Scanner;

public class SortArray {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Input: size of array
int N = sc.nextInt();

// Input: array elements
int[] arr = new int[N];
for (int i = 0; i < N; i++) {
arr[i] = sc.nextInt();

// Sort the array
Arrays.sort(arr);

// Print sorted array
for (int i = 0; i < N; i++) {
System.out.print(arr[i] +" ");

sc.close();

}

}
