public class Book2 {
    String title;
    double price;

    public void setVar(String title, double price) {
        this.title = title;
        this.price = price;

    }
    public void showVar() {
        System.out.println("The title is" + title);
        System.out.println("The price is" + price);
    }
    public boolean startsWith()
    {
        return title.startsWith("Java");
    }
}
class main
{
    public static void main(String[] args) {
        Book2 b1=new Book2();
        Book2 b2=new Book2();
        Book2 b3=new Book2();
        Book2 b4=new Book2();
        b1.setVar("Java",3245.5);
        b2.setVar("Math",245.5);
        b3.setVar("Science",1245.5);
        b4.setVar("Social",535.5);
        if (b1.startsWith())
        {
          b1.showVar();
            System.out.println();
        }
        if (b2.startsWith())
        {
            b2.showVar();
            System.out.println();
        }
        if (b3.startsWith())
        {
            b3.showVar();
            System.out.println();
        }
        if (b4.startsWith())
        {
            b4.showVar();
            System.out.println();
        }
    }
}

