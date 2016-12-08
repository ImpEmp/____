public class triangle extends Shape{
   double side;
	public triangle(double x){
	 this.side = x;
	}
	public double getSide(){
	return side;
	}
	public void setSide(double side){
	this.side=side; 
	}
	public double findArea(){
	 return side*side*Math.sqrt(3)/4;
	}
	public double findPerimeter(){
	 return side*3;
	}
	public double findAltitude(){
	 return side*Math.sqrt(3)/2;
	}
}
	