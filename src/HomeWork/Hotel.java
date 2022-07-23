package HomeWork;

public class Hotel extends LivingPlace {

    public Hotel(Family families) {
        super(families);
    }

    @Override
    public void payRent() {
        System.out.println("Арендв толойт");
    }

    @Override
    public void payCom() {

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "families=" + family +
                "} " ;
    }
}
