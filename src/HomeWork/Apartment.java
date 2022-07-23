package HomeWork;

public class Apartment extends LivingPlace {

    public Apartment(Family families) {
        super(families );
    }

    @Override
    public void payRent() {

    }

    @Override
    public void payCom() {
        System.out.println("Комуналка толойт");
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "families=" + family +
                "} " ;
    }
}
