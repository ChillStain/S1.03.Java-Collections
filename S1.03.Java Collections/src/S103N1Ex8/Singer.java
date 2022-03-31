package S103N1Ex8;

public class Singer {

    private String name;
    private String song;

    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public String getSong() {
        return song;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", song='" + song + '\'' +
                '}';
    }
}
