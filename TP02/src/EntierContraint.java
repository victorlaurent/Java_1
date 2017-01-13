/**
 * Created by Victor Laurent on 11/01/2017.
 */

import java.util.Scanner;


class EntierContraint
{
    public EntierContraint(int a, int b, int x)
    /** Constructeur EntierContraint avec 3 arguments
     * Entree   int     min
     *      Borne inférieur de l'entier contraint
     * Entree   int     max
     *      Borne supérieur de l'entier contraint
     * Entree   int     val
     *      Valeur de l'entier contenu entre min et max
     */
    {
        if ( x>=min & x<=max )
        {
            min = a;
            max = b;
            val = x;
        }
        else
        {
            System.out.println("Error");
        }
    }

    public void affhiche ()
    // Procédure d'affichage
    {
        System.out.print(val);
    }

    public void saisir ()
    // Procédure de saisie des valeurs min, max et val
    {
        Scanner userInput = new Scanner(System.in);
        int nouVal=0;
        newVal= userInput.nextInt();
        while(nouVal>max | nouVal < min)
        {
            System.out.println("Error_input from saisir function, try again :");
            nouVal = userInput.nextInt();
        }
        val= nouVal;
    }

    public void incr ( int i )
    //Procedure d'incrémentation d'un entier i (argument) à val
    {
        if( (val+i)>=min & (val+i)<=max )
        {
            val+=i;
        }
    }

    private int min, max, val;
}

public class TestEntierContraint
{

}
