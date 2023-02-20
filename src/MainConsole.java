import java.util.Scanner;

/*
* File: MainConsole.java
* Author: Molnár Csenge Anna
* Copyright: 2023, Molnár Csenge Anna
* Group: Szoft I-1 N
* Date: 2023-02-20
* Github: https://github.com/Verfarkas02/dolgozat_telteg.git
* Licenc: GNU GPL
*/
public class MainConsole {
    public MainConsole(){
        task();
        about();
        doit();
    }


    private void task(){
        System.out.println("Feladat 0354 Megoldás");
        System.out.println("Telteg dolgozat");
    }

    private void doit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg az A oldal hosszt!");
        String oldal = scanner.nextLine();
        double a = Double.parseDouble(oldal);
        System.out.println("Kérem adja meg a B oldal hosszt!");
        String oldal2 = scanner.nextLine();
        double b = Double.parseDouble(oldal2);

        double terulet =(2*a*2*b)/2;
        System.out.println("Telek területe:" +terulet);

      scanner.close();
    }



    private void about(){
        System.out.println("--------------------------------------------------");
        System.out.println("------------------Molnar Csenge Anna---------------");
        System.out.println("------------------Szoft I-1-N----------------------");
        System.out.println("------------------2023-02-20-----------------------");
        System.out.println("--------------------------------------------------");
    }
}
