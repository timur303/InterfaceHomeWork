package HomeWork;

public abstract class LivingPlace {

    Family family;

    public LivingPlace(Family families) {
        this.family = families;
    }

    public abstract void payRent();

    public abstract void payCom();

    @Override
    public String toString() {
        return "LivingPlace{" +
                "families=" + family +
                '}';
    }
}
