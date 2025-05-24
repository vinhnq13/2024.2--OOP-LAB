class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle Adventure", "Adventure", "Nature Studios", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Galactic Battles", "Science Fiction", "Lucas Space", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Magic Carpet Ride", "Fantasy", "Arabian Nights", 90, 18.99f);
        
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        
        cart.printCart();
        
        cart.removeDigitalVideoDisc(dvd2);
        cart.printCart();
    }
}