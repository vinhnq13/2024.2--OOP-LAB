class Cart {
    private DigitalVideoDisc[] items = new DigitalVideoDisc[20];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            items[qtyOrdered++] = disc;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[--qtyOrdered] = null;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("Disc not found in cart.");
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += items[i].getCost();
        }
        return sum;
    }

    public void printCart() {
        System.out.println("Cart contains:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + " - " + items[i].getTitle() + " - " + items[i].getCost());
        }
        System.out.println("Total cost: " + totalCost());
    }
}