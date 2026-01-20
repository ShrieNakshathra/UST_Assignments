package Object_Class_Constructors;

public class Mobile {

    String brand;
    int ram;       
    int storage;    
    double price;

    // Constructor with brand only
    Mobile(String brand) {
        this.brand = brand;
        this.ram = 4;
        this.storage = 64;
        this.price = 12000;
    }

   
    Mobile(String brand, int ram, int storage) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = 18000;
    }

  
    Mobile(String brand, int ram, int storage, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

  
    void display_config() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: " + price);
        System.out.println("--------------------");
    }
}

