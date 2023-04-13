import java.util.Scanner;
public class Person extends Animal{
    private String address;
    private String maritalStatus;
    public Person(String name, boolean isGender, int age, int weight, int height, String address, String maritalStatus) {
        super(name, isGender, age, weight, height);
        this.address = address;
        this.maritalStatus = maritalStatus;
    }

    public Person(){

    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + super.getName() + '\'' +
                ", isGender=" + super.isGender() +
                ", age=" + super.getAge() +
                ", weight=" + super.getWeight() +
                ", height=" + super.getHeight()+
                "address='" + address + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }

    public void display(){
        System.out.println("Person{" +
                "name='" + super.getName() + '\'' +
                ", isGender=" + super.isGender() +
                ", age=" + super.getAge() +
                ", weight=" + super.getWeight() +
                ", height=" + super.getHeight()+
                ", address='" + address + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}');

    }

    public void addInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("___Display information Person___");
        super.addInformation();
        System.out.println("Input address: ");
        this.address = scanner.nextLine();
        System.out.println("Input maritalStatus: ");
        this.maritalStatus = scanner.nextLine();
    }
}
