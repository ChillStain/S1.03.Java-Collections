package S103N1Ex1;

import java.util.ArrayList;


public class Main {
    public Main(){

    }

    public static void main(String[] args) {
        new Month("name");
        ArrayList<Month> month = new ArrayList();
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

        month.add(7,new Month("August"));



        for(Month months:month){

            System.out.println(months.getName());
        }
    }
}
