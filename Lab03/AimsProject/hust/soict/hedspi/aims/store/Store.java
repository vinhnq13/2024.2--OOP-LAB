package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Media> inventory = new ArrayList<>();

    public void insertMedia(Media item) {
        if (inventory.contains(item)) {
            System.out.println("This media already exists in the store: " + item.getTitle());
        } else {
            inventory.add(item);
            System.out.println("Media successfully added: " + item.getTitle());
        }
    }

    public void deleteMedia(Media item) {
        if (inventory.remove(item)) {
            System.out.println("Media removed from store: " + item.getTitle());
        } else {
            System.out.println("Media not found: " + item.getTitle());
        }
    }

    public void showAllMedia() {
        if (inventory.isEmpty()) {
            System.out.println("Store is empty.");
            return;
        }

        System.out.println("============= STORE INVENTORY =============");
        int index = 1;
        for (Media m : inventory) {
            System.out.println(index++ + ". " + m);
        }
        System.out.println("===========================================");
    }

    public Media lookupByTitle(String title) {
        return inventory.stream()
                .filter(media -> media.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    // Alias methods for compatibility
    public Media searchByTitle(String title) {
        return lookupByTitle(title);
    }

    public List<Media> getAllMedia() {
        return new ArrayList<>(inventory);
    }
}
