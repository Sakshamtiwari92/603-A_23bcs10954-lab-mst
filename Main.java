
import java.util.Scanner;
class Product
{
    int id;
     int nameCode;
     double price;

     public Product(int id,int nameCode,double price)
     {
        if(id<0||price<=0)
        {
            throw new  IllegalArgumentException("invalid input: Id must be>0 and Price must be>=0");

        }
        this.id=id;
        this.nameCode= nameCode;
        this.price= price;
     }

     public void display()
     {
        System.out.println("Product Id:"+ id);
        System.out.println("Product NameCode:"+ nameCode);
        System.out.println("Product price:₹"+ price);
     }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int nameCode = sc.nextInt();
        int price= sc.nextInt();
         Product p =new Product(id, nameCode, price);
         p.display();
         sc.close();

    }
}
