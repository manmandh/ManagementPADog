import java.util.Scanner;

public class Main {
    public static void displayMenu(){
        System.out.println("___Please choose function___");
        System.out.println("1. Add one person");
        System.out.println("2. Add one Dog");
        System.out.println("3. See all information");
        System.out.println("4. Sort Animal by Age ");
        System.out.println("5. Sort Animal by height, if the same height then ascend by weight ");
    }
    public static void main(String[] args) {
        Handle handle = new Handle();
        Scanner scanner = new Scanner(System.in);
        boolean programme = true;
        while (programme){
            try{
                displayMenu();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        handle.add1Peron();
                        break;
                    case 2:
                        handle.add1Dog();
                        break;
                    case 3:
                        handle.display();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                }

            }catch (Exception e){
                System.out.println("Error!! Restart Menu");
            }
        }

    }
}