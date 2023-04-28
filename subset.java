import java.util.*;
class subset{
    public static boolean sub(int a[],int b[]){
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(!s.contains(b[i]))
                return false;
            }
            return true;            
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[4];
        System.out.println("Enter the first array :");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the second array :");
        for(int i=0;i<4;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(sub(a, b));
    }
}
