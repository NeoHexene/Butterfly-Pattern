import java.util.*;

import javax.lang.model.util.ElementScanner14;



class butterflypattern {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");

        int n = sc.nextInt();


        //upper half
        for(int i=1; i<=n; i++){
            //1st part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces=2*(n-i);
            for(int k=1; k<=spaces; k++){
                    System.out.print(" ");
                }
            //2nd part
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
             
            System.out.println();
        }

        //lower half
        for(int i=n; i>=1; i--){
            //1st part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces=2*(n-i);
            for(int k=1; k<=spaces; k++){
                    System.out.print(" ");
                }
            //2nd part
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
             
            System.out.println();
        }
       
    }
}
