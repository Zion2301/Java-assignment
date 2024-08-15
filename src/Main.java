import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductImpl menu = new ProductImpl();
        Scanner scan = new Scanner(System.in);
       while(true){
           System.out.println("******************");
           System.out.println("Welcome to the food menu");
           System.out.println("1. Add Food");
           System.out.println("2. Retrieve Food");
           System.out.println("3. Display all Foods");
           System.out.println("4. Delete Food");
           System.out.println("5. Exit");
           System.out.println("******************");

           int newchoice = scan.nextInt();
           scan.nextLine();

           switch (newchoice) {
               case 1:
                   System.out.println("Enter Food: ");
                   String newfood = scan.nextLine();
                   menu.addProduct(newfood);
                   System.out.println("Food has been added");
                   break;


               case 2:
                   System.out.println("Enter name of Food");
                   String food = scan.nextLine();
                   menu.getProduct(food);
                   System.out.println(menu.getProduct(food));
                   break;


               case 3:
                   menu.displayProducts();
                   System.out.println(menu.displayProducts());
                   break;


               case 4:
                   System.out.println("Enter ID to delete");
                   int delete = scan.nextInt();
                   menu.deleteProducts(delete);
                   System.out.println("Successfully deleted");
                   break;


               case 5:
                   System.out.println("Exiting now.....");
                   scan.close();
                   return;

               default:
                   System.out.println("Invalid option");
           }
       }


    }
}