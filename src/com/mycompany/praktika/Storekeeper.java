package com.mycompany.praktika;

public class Storekeeper {
    int id = (6460);
        public int getID(){
            return id;
        }
        String FIO = ("Ильин Антон Александрович");//кладовщик
        public String getFIO(){
            return FIO;
        }
         int date_start = (120303);
        public int getDate_start(){
            return date_start;
        }
         int date_end = (245355);
        public int getDate_end(){
            return date_end;
        }
        void StorekeeperOut(){
            System.out.println("Имя кладовщика: " + FIO);//кладовщик
            System.out.println("Номер кладовщика: " + id);
            System.out.println("Дата начала работы: " + date_start);
            System.out.println("Дата истечения рабочего контракта: " + date_end);
            System.out.println("");
        } 
}
