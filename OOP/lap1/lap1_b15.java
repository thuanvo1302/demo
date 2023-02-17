package lap1;
import java.util.Scanner;

class lap1_b15
{
    public static void main(String[] args)
    {
        System.out.println("----Menu----");
        System.out.println("1. Coca");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.println("4. Snake");
        System.out.println("5. Shutdown Machine");
        System.out.println("Please enter the number:");
        Scanner nhap = new Scanner(System.in);
        int x = nhap.nextInt();
        if(x<1){
            System.out.println("Khong du tien");
        
        }
        System.out.println("Moi quy khach nhap tien");
        
        
        double a = nhap.nextDouble();
        switch(x)
        {
            case 1:
            System.out.println("The price of Coca is: 2$");
            Double tienthua = a-2;
            System.out.println("Your change is: $" + tienthua);
            break;
            case 2:
            System.out.println("The price of Pepsi is: 3$");
            tienthua = a-3;
            System.out.println("Your change is: $" + tienthua);
            break;
            case 3:
            System.out.println("The price of Sprite is: 3$");
            tienthua = a-3;
            System.out.println("Your change is: $" + tienthua);
            break;
            case 4:
            System.out.println("The price of Snake is: 1$");
            tienthua = a-1;
            System.out.println("Your change is: $" + tienthua);
            break;
            case 5:
            default:
        }
        nhap.close();
    }
}