package family;

public class Apartment implements Services{
    private Person[] family;

    public Apartment(Person[] family) {
        this.family = family;
    }

    public Person[] getFamily() {
        return family;
    }

    public void Family() {
        System.out.println("Квартарирадагы уй було!!");
        for (Person p:family) {
            System.out.println("Name =  "+p.getName()+"  Age = "+p.getAge()+"  Who = "+p.getGender() );
        }
        System.out.println("\n");
    }

    @Override
    public void service(int sum) {
        System.out.println("Биз квартирада жашайбыз");
        System.out.println("Биз ком услугага "+sum+" сом толойбуз!");
        System.out.println("---------------");
    }

}
