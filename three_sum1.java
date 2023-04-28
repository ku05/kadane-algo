import java.util.*;
class three_sum1{
    public static boolean sum(int a[],int target,int n){
        Arrays.sort(a, 0, n-1);
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                if(a[i]+a[l]+a[r]==target){
                    System.out.print(a[i]+" "+a[l]+" "+a[r]);
                    return true;
                }else if(a[i]+a[l]+a[r]<target){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a[]=new int[5];
        System.out.println("Enter the array :");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the value of target :");
        int target=sc.nextInt();
        int n=a.length;
        System.out.println(sum(a, target, n));
    } 
}