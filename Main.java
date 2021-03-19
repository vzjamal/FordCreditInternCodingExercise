import java.util.*;
import java.lang.Math;

//class point to hold coordinates.
class Point{ 

    //x and y coordinates of the point 
    int x,y;

    //Constructor()
    Point(int x, int y){
        this.x = x;
        this.y = y;
}
    public String toString(){
        return"(" + x + "," + y + ")";
    }
}
public class Main{
    
    //Method to input point 
    public static Point getPoint(String name){
        int x, y;
        Scanner scan = new Scanner(System.in);

        //input point coordinates
        System.out.println("Enter the Co-ordinates of point " + name);

        System.out.println("Enter x: ");
        x= scan.nextInt();

        System.out.println("Enter y: ");
        y= scan.nextInt();

        //return a point Object
        return new Point(x, y);
    }
    //Method to calculate Manhattan Distance
    public static int getManhattanDistance(Point p1, Point p2){
        /* Manhattan distance = |x2-x1| + |y2-y1|
        p1 = (x1, y1)
        p2 = (x2, y2)*/
        return Math.abs(p2.x - p1.x) + Math.abs(p2.y - p1.y);
    }

    //Method to display results 
    public static void printDistance(Point p1, Point p2){
        System.out.printf("%-20s %-20s %-18s%n", "Point A(x, y)", "Point B(x, y)", "Distance between A and B");
        System.out.printf("%-20s %-20s %-20s%n", p1, p2, getManhattanDistance(p1, p2));
    }
    public static void main(String[] args){
        boolean stop = true;
        do{
            //input point 1
            Point p1 = getPoint("A");

            //input point 2
            Point p2 = getPoint("B");

            //Display Results 
            printDistance(p1, p2);

            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to calculate another Distance? Y/N");

            String yesNo = scan.next();

            boolean yes = yesNo.toLowerCase().charAt(0) == 'y';
            boolean no = yesNo.toLowerCase().charAt(0) == 'n';

            if(yes){
                stop = false;
            }else if (no){
                stop = true;
            }else 
                System.out.println("Only Y or N is Expected.");
        }
        while (!stop);
    }
}