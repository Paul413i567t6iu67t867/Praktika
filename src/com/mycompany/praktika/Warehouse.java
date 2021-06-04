package com.mycompany.praktika;

public class Warehouse {
   String place = ("филиал в Казахстане: Караганда");
        public String getPlace(){
            return place;
        }
        String name = ("У Сергея Абрековича");
        public String getName(){
            return name;
        }
         int nomer_Ordering = (339);
        public int getNomer_Ordering(){
            return nomer_Ordering;
        }
        String availability = ("Да");
        public String getavailability(){
            return availability;
        }
        String product =("постельное бельё,банные принадлежности");
        public String getproduct(){
            return product;
        }
        String nazvaniye = ("полотенце, подушки, одеяло, наволочки");
        public String getNazvaniye(){
            return nazvaniye;
        }
        String pai_for = ("да");
        public String getpai_for(){
            return pai_for;
        }
        int number_of_purchases = (5);
        public int getnumber_of_purchasesy(){
            return number_of_purchases;
        }
        int date_of_issue = (190721);
        public int getdate_of_issue(){
            return date_of_issue;
        }
        void WarehouseOut(){
            System.out.println("ИНФОРМАЦИЯ О ПОСЕЩЕНИИ");
            System.out.println("Расположение: " + place);
            System.out.println("Название склада: " + name);
            System.out.println("Номер заказа: " + nomer_Ordering);
            System.out.println("Продукт: " + product );
            System.out.println("Тип товара: " + nazvaniye );
            System.out.println("Есть ли в наличии: " + availability);
            System.out.println("Кол-во покупок: " +number_of_purchases);
            System.out.println("Оплачено: " + pai_for);
            System.out.println("Дата выдочи товара: " + date_of_issue);
            System.out.println("");
        }
}
