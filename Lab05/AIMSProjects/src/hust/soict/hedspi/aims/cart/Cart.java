package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Cart {

    private final ArrayList<Media> mediaList = new ArrayList<>();

    public void addMedia(Media item) {
        if (!mediaList.contains(item)) {
            mediaList.add(item);
            System.out.println("Media added: " + item.getTitle());
        } else {
            System.out.println("This media already exists in the cart: " + item.getTitle());
        }
    }

    public void removeMedia(Media item) {
        if (mediaList.remove(item)) {
            System.out.println("Media removed: " + item.getTitle());
        } else {
            System.out.println("Item not found: " + item.getTitle());
        }
    }

    public float calculateTotalCost() {
        return mediaList.stream()
                .map(Media::getCost)
                .reduce(0f, Float::sum);
    }

    public void displayCart() {
        System.out.println("=========== CART CONTENTS ===========");
        if (mediaList.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            int index = 1;
            System.out.println("Items ordered:");
            for (Media item : mediaList) {
                System.out.println(index++ + ". " + item);
            }
            System.out.printf("Total cost: %.2f $\n", calculateTotalCost());
        }
        System.out.println("======================================");
    }

    public void findById(int searchId) {
        for (Media item : mediaList) {
            if (item.getId() == searchId) {
                System.out.println("Media found:\n" + item);
                return;
            }
        }
        System.out.println("No media matches ID: " + searchId);
    }

    public Media findByTitle(String keyword) {
        boolean hasMatch = false;
        for (Media item : mediaList) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                if (!hasMatch) {
                    System.out.println("Matching items:");
                }
                System.out.println(item);
                hasMatch = true;
            }
        }
        if (!hasMatch) {
            System.out.println("No media matches title: " + keyword);
        }
        return null;
    }

    public ArrayList<Media> getMediaList() {
        return mediaList;
    }

    public void emptyCart() {
        mediaList.clear();
        System.out.println("All items have been removed from the cart.");
    }

    public void print() {
        System.out.println("---------- YOUR CART ----------");
        if (mediaList.isEmpty()) {
            System.out.println("Cart is currently empty.");
        } else {
            for (int i = 0; i < mediaList.size(); i++) {
                System.out.println((i + 1) + ". " + mediaList.get(i));
            }
        }
        System.out.println("-------------------------------");
    }
}
