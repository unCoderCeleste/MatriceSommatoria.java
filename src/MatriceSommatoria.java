/*Esercizio 3:
Scriviamo un'applicazione che generi 20 volte un numero a caso
scelto entro un determinato range di valori: (es.: range ->[0,10] o range -->[10,50], ecc)
I numeri devono essere stampati su 4 colonne
es:
1  5  6  7
4  10  8 12
12  9  7  6
18  1  5  3
Implementazione dell'esercizio:
Calcolare la somma di ogni riga e stamparla su una ulteriore colonna
es.
1   5  6  7  =19   perchè (1+5+6+7 =19)
4  10  8 12  =34
12  9  7  6  =34
18  1  5  3  =27
*/
import java.util.Scanner;
public class MatriceSommatoria {
    public static void main(String[] args) {
        Scanner matrice= new Scanner(System.in);
        System.out.println("MATRICE SOMMATORIA.\n");

        int limInf, limSup;
        int c, r;

        System.out.print("Quantità di COLONNE: ");
        int col= matrice.nextInt();
        System.out.print("Quantità di RIGHE: ");
        int rig= matrice.nextInt();
        System.out.print("limiteSuperiore del range: ");
        limSup= matrice.nextInt();
        do{System.out.print("limiteInferiore (<" +limSup +") range: ");
        limInf= matrice.nextInt();}
        while(limInf>=limSup);
        System.out.println();

        int range= limSup - limInf;
        int sommaRiga=0;

        for (r=0; r<rig; r++){
            for (c=0; c<col; c++) {
            int nro = (int) (Math.random() * range) + limInf;
            System.out.print(nro +"\t");
            sommaRiga= sommaRiga+nro;
            }
            System.out.print("= " +sommaRiga + " (Sommatoria " +(r+1)+"ª riga)");
            sommaRiga=0;
            System.out.println();
            c=0;
        }
    }
}