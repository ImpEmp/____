public class rectangle extends Shape{
 private double length,height;
 public rectangle(double w, double h){
  length=w;
  height=h;
 }
 public double findArea(){
 return length*height;
 }
 public double findPerimeter(){
 return length*2+height*2;
 }
 public double findDiagonal(){
 return Math.sqrt(length*length+height*height);
 }
 public double getHeight(){
 return height;
 }
 public double getLength(){
 return length;
 }
 public double setHeight(double height){
 this.height = height;
 return height;
 }
 public double setLength(double length){
 this.length = length;
 return length;
 }
 
}