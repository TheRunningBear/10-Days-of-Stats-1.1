
import java.util.Arrays;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]x=new int[n];
        for(int i = 0;i<n;i++)
        {
            x[i]=in.nextInt();
        }
        Arrays.sort(x);

        int size;
        int q2;
        if(n%2==1)        {
            size = (n-1)/2;
            q2=x[n/2];

        }
        else{
            size = n/2;
            q2 = (x[n/2]+x[(n/2)-1])/2;
        }
        int q1,q3;
        if(size%2==1)
        {
            q1=x[(size-1)/2];
            q3 = x[(size)+((size-1)/2)];
        }
        else
        {
            q1 = (x[(size/2)-1]+x[size/2])/2;
            int j;
            if(n%2==1)
            {
                j=1;
            }
            else{
                j = -1;
            }
            q3 = (x[(size)+(size/2)+j]+x[(size)+(size/2)])/2;
        }


        System.out.println(q1+"\n"+q2+"\n"+q3);

    }
}
/*import java.util.Scanner;
        import java.util.Arrays;
public class Solution{
    public static void main(String[] args) {
    *//* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. *//*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(median(arr, 0, n / 2 - 1));
        System.out.println(median(arr, 0, n - 1));
        if (n % 2 == 0) {
            System.out.println(median(arr, n / 2, n - 1));
        } else {
            System.out.println(median(arr, n / 2 + 1, n - 1));
        }

        sc.close();
    }

    private static int median(int[] arr, int start, int end) {
        int length = end - start + 1;
        int median = 0;
        if (length % 2 != 0) {
            median = arr[start + length / 2];
        } else {
            median = (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
        }
        return median;
    }
}*/

