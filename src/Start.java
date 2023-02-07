import java.util.Arrays;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        System.out.println("----------------------Starting----------------------------");

        enum Month {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
        }

        for (Month month : Month.values()) {
            if(month.toString().endsWith("Y")){
            System.out.println(month + " ends with an Y");} else {
            System.out.println(month + " doesn't end with an Y");
            }
        }

        System.out.println("------------------------------------------------------------");
    }
}


