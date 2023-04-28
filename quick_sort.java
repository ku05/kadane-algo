import java.util.*;
class quick_sort{
    public static int participation(int a[],int low,int high){
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp=a[i];
        a[i]=a[high];
        a[high]=temp;
        return i;  
    }
    public static void quick(int a[],int low,int high){
        if(low<high){
            int pidx=participation(a,low,high);
            quick(a, low, pidx-1);
            quick(a, pidx+1, high);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the array :");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int n=a.length;
        int low=0;
        int high=n-1;
        quick(a, low, high);
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }
}