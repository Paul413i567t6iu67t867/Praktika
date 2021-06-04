package com.mycompany.praktika;

public class Main {
    public static void main(String[] args) {
    Ordering ordering = new Ordering();
    Storekeeper adm = new Storekeeper();
    Client client = new Client();
    Warehouse warehouse = new Warehouse();
    
   
    ordering.OrderingOut();
    adm.StorekeeperOut();
    client.ClientOut();
    warehouse.WarehouseOut();
    }
}
