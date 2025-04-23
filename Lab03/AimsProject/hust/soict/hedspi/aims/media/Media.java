package hust.soict.hedspi.aims.media;

public abstract class Media {

    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    // Constructor gọi nhau
    public Media(String title) {
        this(title, "", 0f);
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
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

    public float getCost() {
        return cost;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %.2f $", title, category, cost);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Media)) return false;
        Media other = (Media) obj;
        return this.title != null && this.title.equalsIgnoreCase(other.title);
    }
}
