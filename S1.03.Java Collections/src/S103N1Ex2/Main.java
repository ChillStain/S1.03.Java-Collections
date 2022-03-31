package S103N1Ex2;



import java.util.ArrayList;
import java.util.HashSet;


public class Main {
    public Main(){

    }

    public static void main(String[] args) {
            new Month("name");
        HashSet<Month> month = new HashSet<Month>();

        month.add(new Month("January"));
        month.add(new Month("February"));
        month.add(new Month("March"));
        month.add(new Month("April"));
        month.add(new Month("May"));
        month.add(new Month("Juny"));
        month.add(new Month("July"));
        month.add(new Month("September"));
        month.add(new Month("October"));
        month.add(new Month("November"));
        month.add(new Month("December"));

        month.add(new Month("August"));
        month.add(new Month("August"));
        month.add(new Month("August"));

        for(Month months:month){

            System.out.println(months.getName());
        }
    }
}
