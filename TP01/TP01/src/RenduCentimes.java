/**
 * Created by Victor Laurent on 11/01/2017.
 * TP01 exercice 5
 */

import java.util.Scanner;

public class RenduCentimes
{

    public static void main(String[] args)
    {
        System.out.println("Entrez un montant en euro entier: ");
        Scanner userInput = new Scanner(System.in);

        int montant = userInput.nextInt();

        for(int piece1 = 0;piece1<=montant;piece1++) {
            for(int piece50 = 0;piece50<=(montant-piece1)*2;piece50++) {
                for(int piece20 = 0;piece20*20<=((montant-piece1)*100-piece50*50);piece20++) {
                    for(int piece10 = 0;piece10*10<=((montant-piece1)*100-piece50*50-piece20*20);piece10++) {
                        System.out.println("piece de 1€ : "+ piece1 +"\n piece de 0.5€ : "+ piece50 +"\n piece de 0.2€ : "+ piece20 +"\n piece de 0.1€ : "+ piece10 +" \npiece de 0.05€ : " +((montant-piece1)*100-piece50*50-piece20*20)/5);

                    }
                }
            }
        }
    }
}