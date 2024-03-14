import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // LocalDate.now().getDayOfWeek().name();
        LocalDate DZISIAJ = LocalDate.now();
        String today = DZISIAJ.getDayOfWeek().name();
        System.out.println(LocalDate.now());

        double cena = 40;
        double znizka = 100;
        double znizka2 = 100;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek : ");
        int wiek = scanner.nextInt();
        System.out.println("Czy osoba jest mieszkańcem Warszawy ? (tak/nie)");
        String mieszkaniec = scanner.next();

        if (wiek < 10) {
        //    ("WEJSCIE DARMOWE")
            cena = cena *= 0;
            znizka = znizka *= 0.0;
        }else if(wiek > 10 && wiek < 18 ) {
        //   ("ZNIZKA 50%")
            cena = cena *= 0.5;
            znizka = znizka *= 0.5;
        } else if (wiek == 10){
            cena = cena *= 0.5;
            znizka = znizka *= 0.5;
            // znizka 50%
        } else if (wiek == 18) {
            cena = cena *= 0.5;
            znizka = znizka *= 0.5;
            // znizka 50%
        }

        if (mieszkaniec.equals("tak")){
            cena = cena *= 0.9;
            znizka2 = znizka2 *= 0.1;
            //znizka 10%
        }


        System.out.println("Data: " + wiek + "years old, " + "weekday Ticket price: " + cena + " PLN");
        System.out.println("Discount: " + (znizka + znizka2) + "%");
    }
}