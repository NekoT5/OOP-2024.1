public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            print("The cart is almost full.");
        } else {
            itemsOrdered[qtyOrdered] = disc; // Add the disc to the array
            qtyOrdered++; // Increase the quantity
            print(disc.getTitle() + " has been added to the cart.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc); // Call the existing method for each disc
        }
    }

    // Search for DVDs by title
    public void searchByTitle(String title) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null && itemsOrdered[i].isMatch(title)) { // Use the isMatch method to check for a match
                print("DVD Found: " + itemsOrdered[i]);
                found = true;
            }
        }

        if (!found) {
            print("No match found for title: " + title);
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                found = true;
                // Shift all items after the removed disc to the left
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; // Nullify the last element after shifting
                qtyOrdered--; // Decrease the quantity
                print(disc.getTitle() + " has been removed from the cart.");
                break;
            }
        }
        if (!found) {
            print(disc.getTitle() + " is not found in the cart.");
        }
    }

    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost(); // Sum the cost of each disc
        }
        return total;
    }

    // Method to print the details of all DVDs in the cart
    public void print() {
        if (qtyOrdered == 0) {
            print("The cart is empty.");
        } else {
            print("Cart contains the following DVDs:");
            for (int i = 0; i < qtyOrdered; i++) {
                print(itemsOrdered[i].toString());
            }
        }
    }

    // Method to print messages or DVD details
    private void print(String message) {
        System.out.println(message);
    }
}
