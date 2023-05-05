/*
A supermarket is doing a sales promotion for soft drinks. 
If one day you buy soft drinks and bring the empty bottles 
the next day, they exchange each set of K empty bottles for 
a full one. A customer wants to make the most of this offer 
and therefore bought several bottles on the first day of the 
promotion. 
Now he wants to know how many bottles he will have at the end 
of the second day of the promotion if he use it to the fullest.

Make a program to calculate this.

Input
The first input line contains integer T (1 ≤ T ≤ 10000), which 
indicates the number of test cases. In each of the following T 
lines come two integers N and K (1 ≤ K, N ≤ 10000), respectively 
the number of soft drinks bought and the number of empty bottles 
to gain a full.

Output
For each test case print the number of bottles that the customer 
will have on the second day, if he makes the most of the offer.
*/
package Git1;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // número de casos de teste

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // número de refrigerantes comprados
            int k = sc.nextInt(); // número de garrafas vazias para trocar por uma cheia

            int totalBottles = n; // total de garrafas no primeiro dia
            int emptyBottles = n; // garrafas vazias no primeiro dia

            while (emptyBottles >= k) {
                // troca garrafas vazias por cheias
                int exchangedBottles = emptyBottles / k;
                totalBottles += exchangedBottles;
                emptyBottles = exchangedBottles + (emptyBottles % k);
            }

            System.out.println(totalBottles);
        }

        sc.close();
    }
}