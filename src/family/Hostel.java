package family;

public class Hostel implements Rent{
    private Person[] family;

    public Hostel(Person[] family) {
        this.family = family;
    }

    public Person[] getFamily() {
        return family;
    }

    public void Family() {
        System.out.println("Гостиницадагы уй було!!");
        for (Person p:family) {
            System.out.println("Name =  "+p.getName()+"  Age = "+p.getAge()+"  Who = "+p.getGender() );
        }
        System.out.println("\n");
    }

    @Override
    public void rent(int sum) {
        System.out.println("Биз гостиницада жашайбыз");
        System.out.println("Биз арендага "+sum+" сом толойбуз");
        System.out.println("---------------");
    }
}
