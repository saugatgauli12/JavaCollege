import jdk.dynalink.beans.StaticClass;

public class Product {

    String name;
    double qty;
    double price;

    Product(String name, double qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return qty * price;
    }
}

    class ProductDemo
        {
            public static void main(String[] args) {
                Product p1=new Product("Dove",100.5,35.5);
                Product p2=new Product("Lifeboy",70.3,32.4);
                double Totalprice1 =p1.getTotal();
                double Totalprice2=p2.getTotal();
                System.out.println("The product 1 details");
                System.out.println("Name:"+p1.getName());
                System.out.println("Quantity:"+p1.getQty());
                System.out.println("Price:"+p1.getPrice());
                System.out.println("The product 2 details");
                System.out.println("Name:"+p2.getName());
                System.out.println("Quantity:"+p2.getQty());
                System.out.println("Price:"+p2.getPrice());
                double TotalPrice=Totalprice1+Totalprice2;
                System.out.println("The total price is"+TotalPrice);
            }
        }


