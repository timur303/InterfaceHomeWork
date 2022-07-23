package HomeWork;

public class Hostel extends LivingPlace {

    public Hostel(Family families) {
        super(families);
    }

    @Override
    public void payRent() {

    }

    @Override
    public void payCom() {
        System.out.println("Аренда толойт");
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "families=" + family +
                "} " ;
    }
}
