import java.util.Scanner;
public class Dog extends Animal{
    private String color;
    public Dog(String name, boolean isGender, int age, int weight, int height, String color) {
        super(name, isGender, age, weight, height);
        this.color = color;
    }
    public  Dog(){

    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName()+ '\'' +
                ", isGender=" + super.isGender() +
                ", age=" + super.getAge() +
                ", weight=" + super.getWeight() +
                ", height=" + super.getHeight()+
                "color='" + color + '\'' +
                '}';
    }

    public void display(){
        System.out.println("Dog{" +
                "name='" + super.getName()+ '\'' +
                ", isGender=" + super.isGender() +
                ", age=" + super.getAge() +
                ", weight=" + super.getWeight() +
                ", height=" + super.getHeight()+
                "color='" + color + '\'' +
                '}');
    }

    public void addInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("___Display information Dog___");
        super.addInformation();
        scanner.nextLine();
        System.out.println("Input color:");
        this.color = scanner.nextLine();
    }
}
