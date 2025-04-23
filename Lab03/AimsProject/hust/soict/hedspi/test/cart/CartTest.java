package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.Track;

public class CartTest {
    public static void main(String[] args) {
        Cart myCart = new Cart();

        // Create DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladdin", "Animation", "Guy Ritchie", 90, 18.99f);

        // Create Book
        Book book = new Book(4, "Clean Code", "Programming", 30.5f);
        book.addAuthor("Robert C. Martin");

        // Create CD and add tracks
        CompactDisc cd = new CompactDisc(5, "Greatest Hits", "Pop", "John Doe", "Jane Smith", 0);
        Track track1 = new Track("Track One", 4);
        Track track2 = new Track("Track Two", 5);
        cd.addTrack(track1);
        cd.addTrack(track2);

        // Add media to cart
        myCart.addMedia(dvd1);
        myCart.addMedia(dvd2);
        myCart.addMedia(book);
        myCart.addMedia(cd);

        // Try adding duplicate media
        myCart.addMedia(dvd1); // should notify already in cart

        // Print cart contents
        System.out.println("\nPrinting cart:");
        myCart.displayCart();

        // Search by ID
        System.out.println("\nSearching by ID:");
        myCart.findById(2); // should find Star Wars
        myCart.findById(999); // not found

        // Search by Title
        System.out.println("\nSearching by Title:");
        myCart.findByTitle("Code"); // should find Clean Code
        myCart.findByTitle("Unknown"); // not found

        // Remove media
        System.out.println("\nRemoving media:");
        myCart.removeMedia(dvd2); // Star Wars removed
        myCart.removeMedia(dvd3); // Not in cart

        // Total cost after removal
        System.out.printf("\nTotal cost after removal: %.2f $\n", myCart.calculateTotalCost());

        // Clear cart
        System.out.println("\nClearing cart...");
        myCart.emptyCart();

        // Final check
        myCart.print();
    }
}
