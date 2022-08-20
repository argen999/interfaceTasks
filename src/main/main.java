package main;

import family.*;

public class main {
    public static void main(String[] args) {
        Person person1 = new Person("Сыймык",55,"Папа");
        Person person2 = new Person("Айдана",53,"Мама");
        Person person3 = new Person("Кемел",18,"Бала");
        Person person4 = new Person("Асыл",12,"Кыз");
        Person person5 = new Person("Бакай",49,"Папа");
        Person person6 = new Person("Гулипа",50,"Мама");
        Person person7 = new Person("Айжамал",20,"Кыз");
        Person person8 = new Person("Элдияр",28,"Мужчина");
        Person person9 = new Person("Айгерим",24,"Женщина");

        Person[] first = {person1,person2,person3,person4};
        Apartment apartment = new Apartment(first);
        apartment.service(15000);
        apartment.Family();

        Person[] second = {person5,person6,person7};
        Hostel hostel = new Hostel(second);
        hostel.rent(10000);
        hostel.Family();

        Person[] third = {person8,person9};
        Hotel hotel = new Hotel(third);
        hotel.rent(5000);
        hotel.Family();
    }
}
