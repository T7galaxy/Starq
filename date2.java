import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class date2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //customizes format
        DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate cd = LocalDate.now();
        //prints out date
        System.out.println("Date: " + cd);
        System.out.println("Year: " + cd.getYear());
        System.out.println("Month: " + cd.getMonth());
        System.out.println("Day: " + cd.getDayOfMonth());
        //gets birthday from user
        System.out.print("Enter your birthday (yyyy/mm/dd): ");
        LocalDate bd = LocalDate.parse(sc.nextLine(), fm);
        //calculates age
        int age =Period.between(bd, cd).getYears();
        System.out.println("You are " + age + " years old.");
        //calculates next birthday
        LocalDate  nbd= bd.withYear(cd.getYear());
        if (nbd.isBefore(cd)) nbd = nbd.plusYears(1);
        long days=ChronoUnit.DAYS.between(cd, nbd);
        System.out.println("Days until your next birthday: " + days);

        sc.close();
    }
}