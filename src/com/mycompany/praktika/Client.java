package com.mycompany.praktika;

public class Client {
   String FIO_clienta = ("Авадяев Кирил Виссарионович");
        public String getFIO_visitor(){
            return FIO_clienta;
        }
        String adress = ("Улица Лермонтова дом пять");
        public String getAdress(){
            return adress;
        }
            
        int phone_number = (1592);
        public int getDate_birth(){
            return phone_number;
        }
        int passport_num = (1417634587);
        public int getPassport_num(){
            return passport_num;
        }
        int date_purchase = (130721);
        public int getDate_purchase(){
            return date_purchase;
        }
        int number_of_purchases = (5);
        public int getnumber_of_purchasesy(){
            return number_of_purchases;
        }
        // вывод информации о соискателе
        void ClientOut(){
            System.out.println("Имя клиента: " + FIO_clienta);
            System.out.println("Адресс: " + adress);
            System.out.println("номер телефона: " + phone_number);
            System.out.println("Номер паспорта: " + passport_num);
            System.out.println("Дата покупки: " + date_purchase);
            System.out.println("Кол-во покупок: " +number_of_purchases);
            System.out.println("");
        }
} 
