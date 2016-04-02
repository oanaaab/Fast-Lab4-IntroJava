import javax.swing.*;
import java.util.Scanner;

/**
 * Created by icondor on 26/03/16.
 */
public class SkeletonJava {

    /* utility methods for INPUT/OUTPUT using a GUI or Console, please leave them as they are */

    // GUI
    public static int readIntGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        int returnValue = Integer.parseInt(input);
        return returnValue;
    }

    public static double readDoubleGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        double returnValue = Double.parseDouble(input);
        return returnValue;
    }

    public static String readStringGUI(String label) {
        String input = JOptionPane.showInputDialog(null,
                label);
        return input;
    }

    public static void printGUI(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(int text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public static void printGUI(double text) {
        JOptionPane.showMessageDialog(null, text);
    }
    // CONSOLE
    public static String readStringConsole(String label) {
        System.out.print(label);
        String input = new Scanner(System.in).nextLine();
        return input;
    }

    public static int readIntConsole(String label) {
        System.out.print(label);
        int input = new Scanner(System.in).nextInt();
        return input;
    }

    public static double readDoubleConsole(String label) {
        System.out.print(label);
        double input = new Scanner(System.in).nextDouble();
        return input;
    }

    public static void printConsole(String text) {
        System.out.println(text);
    }

    public static void printConsole(int text) {
        System.out.println(text);
    }

    public static void printConsole(double text) {
        System.out.println(text);
    }
    /* end of utility methods*/


    /* here starts the main class */
    public static void main(String[] arguments) {
       /* int a = readIntGUI("Introduceti un numar:"); // input using GUI
        printGUI("Ati introdus:" + a); // output using GUI

        int b = readIntConsole("Introduceti alt numar:");  // input using console
        printConsole("Ati introdus:" + b); // output using console */


        // EX 2

        // n1, n2, media aritmetica, daca media e peste 5 ai trecut clasa, altfel corigent

       /* int n1 = readIntConsole("Introduceti un numar:");
        int n2 = readIntConsole("Introduceti alt numar:");
        double medie = (n1 + n2) / 2.0;
        if (medie <= 4) {
            System.out.println("Din pacate, nu ai trecut clasa!");
            System.out.println("Media ta este" +medie);
        } else {
            if (medie == 5 ) {
                System.out.println("Ai trecut la limita! Painea elevului!");
                System.out.println("Media ta este " +medie);
            } else {
                if (medie == 6 ) {
            System.out.println("Asa si asa!");
            System.out.println("Media ta este " +medie);}
                else  {
                    System.out.println("Bravo! Ai trecut clasa cu bine!");}
                }

        } */



/* Se poate si asa
        int n1 = readIntConsole("Introduceti un numar:");
        int n2 = readIntConsole("Introduceti alt numar:");
        int medie = (n1 + n2) / 2;
       switch (medie) {
           case 1:
               printConsole("Ai picat!");
               break;
           case 2:
               printConsole("Ai picat!");
               break;
           case 3:
               printConsole("Ai picat!");
               break;
           case 4:
               printConsole("Ai picat!");
               break;
           case 5:
               printConsole("Ai trecut la limita!");
               break;
           case 6:
               printConsole("Asa si asa!");
               break;
           case 7:
               printConsole("Bravo!");
               break;
           default:
               printConsole("Bravo!");
       } */




        /* --- //pentru a afisa nr de la 1 la 100, declaram contorul, punem conditia, si adunam contorul, printam contorul
        for (int contor=1; contor<101; contor++) {
            System.out.println(contor);
        } */




      /*  // Sa se citeasca numere pana se introduce 0
int n; //declaram variabila
        do
        {
            n = readIntConsole("Introduceti un numar:"); //citeste numarul introdus
        }
       // while( n != 0); //cere numere PANA CAND n este diferit de 0, atata timp cat n nu e 0 stai acolo...
        while( n*2 < 100 ); // pana cand dublura nr trece de 100   */


        //array cu medie
        /*

        //declaram array
        int[] notemate = {5, 6, 2, 9};
        int suma = 0;
        //parcurgem sirul
        for (int i = 0; i < notemate.length; i++)
            System.out.println(notemate[i]);
        suma = suma + notemate[i];
        System.out.println("pas" + i + "suma=" + suma);

    int media = suma/notemate.length
            */

        //note de la tastatura + medie
      /*  int sum = 0;
        int[] note=new int[2];
        for (int i=0; i<note.length;i++) {
            note[i] = readIntConsole("Introdu nota:");
            sum += note[i];
        }
        int media = sum/note.length;
        System.out.println("Media e: "+media);
        */

        // cu max!
      /*  int sum = 0;
        int[] note=new int[2];
        for (int i=0; i<note.length;i++) {
            note[i] = readIntConsole("Introdu nota:");
            sum += note[i];
        }
        int max = note[0];
        for (int i = 0; i <note.length; i++) {
            if (note[i] > max) {
                max =note[i];}
            }
        System.out.println("Nota maxima e: " +max);
        */

        // sa se calculeze numerele introduse pana cand dam 0
        int n; //declaram variabila
        int sum = 0;

        do
        {
            n = readIntConsole("Introduceti un numar:");
            sum += n

        }
        while( n != 0);



    }

        }







    //end of main method

// end of class
