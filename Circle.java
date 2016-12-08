
    public class Circle extends Shape
   {
      private double myRadius;
   	
       public Circle(double x)
      {
         myRadius = x;
      }
   	

       public double getRadius()
      {
         return myRadius;
      }
		

       public void setRadius(double x)
      {
         myRadius= x;
      }
		
       public double findArea()
      {
         return Math.PI*myRadius*myRadius;
      }

       public double findCircumference()
      {
         return 2* Math.PI*myRadius;
      }
   }