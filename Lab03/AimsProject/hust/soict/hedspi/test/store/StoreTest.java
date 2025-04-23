package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Tạo DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Sci-Fi", "Wachowski", 136, 25.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 30.0f);

        // Tạo Book
        Book book = new Book("The Pragmatic Programmer", "Programming", 35.5f);
        book.addAuthor("Andrew Hunt");
        book.addAuthor("David Thomas");

        // Tạo CD
        CompactDisc cd = new CompactDisc("Hits Collection", "Pop", "Mike", "Producer X", 0);
        cd.addTrack(new Track("Hit 1", 4));
        cd.addTrack(new Track("Hit 2", 5));

        // Thêm media vào store
        store.insertMedia(dvd1);
        store.insertMedia(dvd2);
        store.insertMedia(book);
        store.insertMedia(cd);

        // Thử thêm trùng
        store.insertMedia(dvd1);

        // Hiển thị danh sách
        System.out.println("\n>> Store Inventory:");
        store.showAllMedia();

        // Tìm kiếm theo tiêu đề
        System.out.println("\n>> Search media by title:");
        String searchTitle = "Interstellar";
        var result = store.lookupByTitle(searchTitle);
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("No media found with title: " + searchTitle);
        }

        // Xóa media
        System.out.println("\n>> Removing media from store:");
        store.deleteMedia(book);
        store.deleteMedia(book); // Thử xóa lại - không còn trong store

        // Hiển thị lại sau khi xóa
        System.out.println("\n>> Store Inventory After Removal:");
        store.showAllMedia();
    }
}
