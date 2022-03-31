package S103N1Ex3;

public class TheShining {
    private String character[] = new String[6];
    private static int index = 0;

    public TheShining(){
        character[0] = "Danny";
        character[1] = "Jack";
        character[2] = "Wendy";
        character[3] = "Halloran";
        character[4] = "Ullman";
        character[5] = "Delbert";

    }

    public String next(){
        int temp = index;
        index = index+1;
        index = index % character.length;
                return character[temp];
    }
}
