package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {

    private static int discCount = 0;

    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor đơn giản
    public DigitalVideoDisc(String title) {
        this(title, "", "", 0, 0f);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, "", 0, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, director, 0, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.id = ++discCount;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static int getDiscCount() {
        return discCount;
    }

    @Override
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $", title, category, director, length, cost);
    }
}
