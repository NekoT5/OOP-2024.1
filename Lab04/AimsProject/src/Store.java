public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int numItemsInStore;

    // Constructor to initialize the store with a maximum number of DVDs
    public Store(int maxItems) {
        itemsInStore = new DigitalVideoDisc[maxItems];
        numItemsInStore = 0;
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (numItemsInStore < itemsInStore.length) {
            itemsInStore[numItemsInStore] = dvd;
            numItemsInStore++;
            print(dvd.getTitle() + " has been added to the store.");
        } else {
            print("The store is full. Cannot add more DVDs.");
        }
    }

    // Method to remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < numItemsInStore; i++) {
            if (itemsInStore[i].equals(dvd)) {
                found = true;
                // Shift all items after the removed DVD to the left
                for (int j = i; j < numItemsInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[numItemsInStore - 1] = null; // Nullify the last element after shifting
                numItemsInStore--;
                print(dvd.getTitle() + " has been removed from the store.");
                break;
            }
        }
        if (!found) {
            print(dvd.getTitle() + " was not found in the store.");
        }
    }

    // Method to print the details of all DVDs in the store
    public void print() {
        if (numItemsInStore == 0) {
            print("The store is empty.");
        } else {
            print("Store contains the following DVDs:");
            for (int i = 0; i < numItemsInStore; i++) {
                print(itemsInStore[i].toString());
            }
        }
    }

    // Helper method to print messages
    private void print(String message) {
        System.out.println(message);
    }
}
