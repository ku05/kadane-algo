import java.util.*;
public class kadane_algo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array :");
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int max_sum=Integer.MIN_VALUE;
        int sum_ending=0;
        int start=0;
        int s=0;
        int end=0;
        for(int i=0;i<5;i++){
            sum_ending=sum_ending+a[i];
            if(max_sum<sum_ending){
                max_sum=sum_ending;
                start=s;
                end=i;
            }
            if(sum_ending<0){
                sum_ending=0;
                s=i+1;
            }
        }
        System.out.println("Maximum sub array is :"+ max_sum);
        System.out.println("First Index is :"+ start + "Last Index is :"+ end);
    }
}
