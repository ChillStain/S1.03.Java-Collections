package S103N1Ex7;

public class Employee {
    private String name;
    private double salary;

    public  Employee(String name) {
        this.name = name;
        salary = 5000;
    }


    public String toString() {
        return "[Name =" + name+ ", salary = " +salary + "]";
    }
}




