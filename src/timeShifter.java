import java.util.Scanner;

public class timeShifter {

    public static void main(String[] args) {

        // aktualna godzina, ile godzin minelo, pokazac ktora jest godzina
       /* int currentTime = 11;
        int hoursAdded = 122;
        int actTime = (currentTime + hoursAdded)%24;
        System.out.println(actTime);*/

      /*  if(sumTime>24){
             actTime = sumTime%24;
             System.out.println(actTime);
         } else {
             System.out.println(sumTime);
         }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj aktualną godzinę");
      int time = scanner.nextInt();
        System.out.println("Ile godzin minie?");
      int shift = scanner.nextInt();

      int shiftedTime = (time + shift) % 24;
        System.out.println("Będzie godzina " +shiftedTime);

    }
}
