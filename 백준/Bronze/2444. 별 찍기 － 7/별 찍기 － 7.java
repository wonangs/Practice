import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1; i++){
            int stars = i<=n?i:2*n-i;
            for(int j=1; j<=n-stars; j++) System.out.print(" ");
            for(int j=1; j<=2*stars-1; j++) System.out.print("*");
            System.out.println();
        }
    }
}