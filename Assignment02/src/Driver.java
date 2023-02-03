import java.util.Scanner;

public class Driver {
    public static void main(String []args){
        char choice;
        int sales1, sales2, sales3, sales4, sales5;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Sales for the Store 1");
            sales1 = sc.nextInt();
            System.out.println("Enter the Sales for the Store 2");
            sales2 = sc.nextInt();
            System.out.println("Enter the Sales for the Store 3");
            sales3 = sc.nextInt();
            System.out.println("Enter the Sales for the Store 4");
            sales4 = sc.nextInt();
            System.out.println("Enter the Sales for the Store 5");
            sales5 = sc.nextInt();
            TimePassing tp = new TimePassing(sales1, sales2, sales3, sales4, sales5);

            System.out.println("Sales Bar Chart");
            System.out.print("Store 1:  ");
            sales1 = tp.getStore1Bars();
            for (int i = 0; i < sales1; i++)
                System.out.print('*');
            System.out.println();

            System.out.print("Store 2:  ");
            sales2 = tp.getStore2Bars();
            for (int i = 0; i < sales2; i++)
                System.out.print('*');
            System.out.println();

            System.out.print("Store 3:  ");
            sales3 = tp.getStore3Bars();
            for (int i = 0; i < sales3; i++)
                System.out.print('*');
            System.out.println();

            System.out.print("Store 4:  ");
            sales4 = tp.getStore4Bars();
            for (int i = 0; i < sales4; i++)
                System.out.print('*');
            System.out.println();

            System.out.print("Store 5:  ");
            sales5 = tp.getStore5Bars();
            for (int i = 0; i < sales5; i++)
                System.out.print('*');
            System.out.println();

            System.out.println("Do you want to see sales for another day??  s / S to stop");
            choice = Character.toLowerCase(sc.next().charAt(0));
        }while (choice != 's');
    }
}
