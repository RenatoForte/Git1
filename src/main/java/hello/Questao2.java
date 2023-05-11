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
package hello;

public class Questao2 {
    public static int calculaTrocasGarrafas(int garrafasVazias, int garrafasNecessariasParaTroca, int dias) {
        int garrafasCheias = 0;
        System.out.println("garrafasVazias: "+ garrafasVazias);
        System.out.println("garrafasCheias: "+ garrafasCheias);

        for(int i = 1; i <= dias; i++){ // bebo as garrafas cheias
            System.out.println("Indo ao mercado efetuar as trocas do dia " + i);
            garrafasVazias += garrafasCheias;
            garrafasCheias = 0;

            while(garrafasVazias >= garrafasNecessariasParaTroca) {// vou pro mercado fazer as trocas
                garrafasVazias -= garrafasNecessariasParaTroca;  //pago as garrafas vazias
                garrafasCheias++; // pego as garrafas cheias
                System.out.println("Efetuei uma troca, fiquei com " + garrafasVazias + " garrafas vazias");
            }
            System.out.println("Trocas do dia " + i);
            System.out.println("garrafasVazias: "+ garrafasVazias);
            System.out.println("garrafasCheias: "+ garrafasCheias);
        }

            return garrafasVazias;

    }
}

