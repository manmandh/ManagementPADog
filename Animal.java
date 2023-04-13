import java.util.Scanner;
public class Animal {
    private String name;
    private boolean isGender;
    private int age;
    private int weight;
    private int height;
    public Animal(){

    }

    public Animal(String name, boolean isGender, int age, int weight, int height) {
        this.name = name;
        this.isGender = isGender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isGender() {
        return isGender;
    }
    public void setGender(boolean gender) {
        isGender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", isGender=" + isGender +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public void display(){
        System.out.println("Animal{" +
                "name='" + name + '\'' +
                ", isGender=" + isGender +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}');
    }
    public void addInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("___Display information Animal___");
        System.out.println("Input name: ");
        this.name = scanner.nextLine();
        System.out.println("Input Gender: ");
        this.isGender = scanner.nextBoolean();
        System.out.println("Input age: ");
        this.age = scanner.nextInt();
        System.out.println("Input weight: ");
        this.weight = scanner.nextInt();
        System.out.println("Input height: ");
        this.height = scanner.nextInt();
    }
}
