import java.util.Scanner;

public class SumofSubArray {
    public static int sumofsubArray(int[] array)
    {
        int result = 0;
        for(int i=0;i<array.length;i++)
        {
            int sum = 0;
            for(int j=i;j<array.length;j++)
            {
                sum+=array[j];
                result+=sum;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(sumofsubArray(array));
    }

    }
