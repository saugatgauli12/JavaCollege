public class Rectangles {
        int length;
        int breadth;
        public Rectangles(int length,int breadth)
        {
            this.length=length;
            this.breadth=breadth;
        }
        public int computeArea()
        {
            return length*breadth;
        }
        public void displayArea()
        {
            int area=computeArea();
            System.out.println("The area is"+area);
        }
    }
    class Main4
    {
        public static void main(String[] args) {
            Rectangles r1=new Rectangles(4,7);
            Rectangles r2=new Rectangles(5,3);
            int area1=r1.computeArea();
            int area2=r2.computeArea();
            if(area1>area2)
            {
                System.out.println("The larger rectangle is"+area1);

            }
            else
            {
                System.out.println("The larger rectangle is"+area2);
            }
        }
    }

