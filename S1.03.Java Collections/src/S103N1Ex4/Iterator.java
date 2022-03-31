package S103N1Ex4;

public class Iterator<T> implements Comparable<Iterator<T>>{

    private String graffity;
    private static int index = 0;

    public Iterator(String graffity){
        this.graffity = graffity;
    }

    public Iterator() {

    }


    public String toString() {
        return "Iterator{" +
                "graffity='" + graffity + '\'' +
                '}';
    }


    public int compareTo(Iterator<T> o) {
        return this.graffity.compareTo(o.graffity);

    }

    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return letters();
    }

    private boolean letters() {
    return true;}
   /* public String next(){
        int temp = index;
        index = index+1;
        index = index % graffity.length();
        return graffity[temp];
    }

    public boolean hasNext() {
    }*/
}
