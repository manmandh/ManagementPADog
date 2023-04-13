import java.util.ArrayList;
public class Handle {
    private ArrayList<Person> list;

    public Handle(){
        list = new ArrayList<Person>();
    }

    public void add(Person person){
        this.list.add(person);
    }

    //add one person
    public void add1Peron(){
        for (int i=0; i<1; i++){
            System.out.println(String.format("Enter information (%d/%d)",i+1,1));
            Person person = new Person();
            person.addInformation();
            this.add(person);
        }
    }

    //add one dog
    public void add1Dog() {
        for (int i = 0; i < 1; i++) {
            System.out.println(String.format("Enter information (%d/%d)", i + 1, 1));
        }
        for (Person animal : list) {
            Animal animal1 = new Animal();
            animal.addInformation();
            this.add((Person)animal1);
        }
    }

    //print all information
    public void display(){
        System.out.println("Print all information:");
        for(Person person: list){
            person.display();
            System.out.println("____");
        }
    }
}
