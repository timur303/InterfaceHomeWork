package HomeWork;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Eshmat", 19);
        Person person1 = new Person("Tashmat", 20);

        Person person2 = new Person("Nurs", 20);
        Person person3 = new Person("Elaman", 24);

        Person person4 = new Person("Asan", 27);

        Person[] people = {person, person1};
        Family families1 = new Family(people);
        Hotel hotel = new Hotel(families1);
        System.out.println(hotel);
        System.out.println("Канча адам жашайт "+hotel.family.people.length);

        hotel.payRent();
        hotel.payCom();
        System.out.println("________________________________________________________________________________________");
        Person[] people1 = {person2, person3};
        Family families2 = new Family(people1);
        Apartment apartment = new Apartment(families2);
        System.out.println(apartment);
        System.out.println("Канча адам жашайт "+apartment.family.people.length);

        apartment.payRent();
        apartment.payCom();
        System.out.println("________________________________________________________________________________________");
        Person[] people2 = {person4};
        Family families3 = new Family(people2);
        Hostel hostel = new Hostel(families3);
        System.out.println(hostel);
        System.out.println("Канча адам жашайт "+ hostel.family.people.length);

        hostel.payRent();
        hostel.payCom();

    }

}
