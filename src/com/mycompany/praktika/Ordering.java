package com.mycompany.praktika;

public class Ordering {
    String optovay = ("от 150 до 5000");
        public String getcost(){
            return optovay;
        }
        int nomer_Ordering = (339);
        public int getNomer_Ordering(){
            return nomer_Ordering;
        }
        int kolichestvo= (007);
       public int getkolichestvo(){
           return kolichestvo;
       }
       String roznichnay =("от 5000 до 10000");
       public String getroznichnay(){
           return roznichnay;
       }       
       String product =("постельное бельё,банные принадлежности");
        public String getproduct(){
            return product;
        }
         String nazvaniye = ("полотенце, подушки, одеяло, наволочки");
        public String getNazvaniye(){
            return nazvaniye;
        }
        int date_purchase = (130721);
        public int getDate_purchase(){
            return date_purchase;
        }
        int number_of_purchases = (5);
        public int getnumber_of_purchasesy(){
            return number_of_purchases;
        }
        int date_of_issue = (190721);
        public int getdate_of_issue(){
            return date_of_issue;
        }
        void OrderingOut(){
            System.out.println("Номер заказа: " + nomer_Ordering);
            System.out.println("Стоймость оптовая: " + optovay);
            System.out.println("Продукт: " + product );
            System.out.println("Тип товара: " + nazvaniye );
            System.out.println("Стоймость розничная: " + roznichnay );
            System.out.println("Количество товара:"+ kolichestvo);
            System.out.println("Дата покупки: " + date_purchase);
            System.out.println("Кол-во покупок: " +number_of_purchases);
            System.out.println("Дата выдочи товара: " + date_of_issue);
            System.out.println("");
            
        } 

    
}
