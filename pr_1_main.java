import java.util.*;
public class pr_1_main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        pr_1 obj = new pr_1();

        System.out.println("Default value of radius = " + obj.rad);
        System.out.println("Enter radius of radius");
        double radia = sc.nextDouble();
        
       pr_1 obj1 = new pr_1(radia);

        double area = obj.getArea();
        System.out.println("Area of circle is : " + area);
        
        double peri = obj.getPerimeter();
        System.out.println("perimeter of circle is : " + peri);
    }
}


