   //Name cameron Date_____________
 //Read you neet to use shapes circle rectangle(the one called rectangle.java) triangle square 
   import java.io.*;
   public class Driver06
   {
      public static void main(String[] args) throws Exception
      {
         System.setOut(new PrintStream(new FileOutputStream("output.txt")));
      
      //create the objects
         Circle c = new Circle(75);
         rectangle r = new rectangle(30.0, 40.);    
         square s = new square(50.0);			 	// remove the comment slashes 	
      	triangle t = new triangle(37);          // when your classes are finished
      
      //test the instance methods
         System.out.println("Circle");
         System.out.println("------");
         System.out.println("Radius: " + c.getRadius());
         System.out.println("Area: " + c.findArea());
         System.out.println("Circumference: " + c.findCircumference());
         System.out.println();
      
         System.out.println("Rectangle");
         System.out.println("---------");
         System.out.println("Length: " + r.getLength());
         System.out.println("Height: " + r.getHeight());
         System.out.println("Area: " + r.findArea());
         System.out.println("Perimeter: " + r.findPerimeter());
         System.out.println("Diagonal: " + r.findDiagonal());
         System.out.println();
         
         System.out.println("Square");
         System.out.println("------");
         System.out.println("diagonal"+s.findDiagonal());
         System.out.println("hight"+s.getHeight());
			
         s.setSide(10.0);
         System.out.println("New side: " + s.getSide());
         System.out.println("New area: " + s.findArea());	
         System.out.println(); 
      
         System.out.println("Triangle");
         System.out.println("--------");
         System.out.println("diagonal"+t.findArea());
         System.out.println("hight"+t.getSide());
         System.out.println();
      }
   }
