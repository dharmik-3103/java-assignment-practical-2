import java.util.*;
public class pr_1 {
    Scanner sc = new Scanner(System.in);

    static double rad = 1.0;

    pr_1()
    {

    }

    pr_1(double r)
    {
        rad = r;
    }

    public static double getPerimeter()
    {
        double peri;
        peri=3.14*2*rad;

        return peri;
    }

    public static double getArea()
    {
        double area;
        area=3.14*rad*rad;

        return area;
    }
}

