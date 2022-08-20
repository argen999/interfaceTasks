package family;

public class Hotel implements Rent{
    private Person[] family;

    public Hotel(Person[] family) {
        this.family = family;
    }

    public Person[] getFamily() {
        return family;
    }

    public void Family() {
        System.out.println("Общежитиядагы уй було!!");
        for (Person p:family) {
            System.out.println("Name =  "+p.getName()+"  Age = "+p.getAge()+"  Who = "+p.getGender() );
        }
        System.out.println("\n");
    }

    @Override
    public void rent(int sum) {
        System.out.println("Биз общежитияда жашайбыз");
        System.out.println("Биз "+sum+" сом толойбуз");
        System.out.println("---------------");
    }
}
