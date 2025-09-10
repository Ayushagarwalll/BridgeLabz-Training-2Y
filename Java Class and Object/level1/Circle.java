public class Circle
{
    int radius=4;
public double area(){
    double a=Math.PI*Math.pow(radius,2);
    return a;
}
public double circum(){
double p=2*radius*Math.PI;
    return p;
}
public static void main(String[] args){
    Circle ob=new Circle();
    System.out.println("Area="+ob.area());
    System.out.println("Circumference="+ob.circum());
    
}
}