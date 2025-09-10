public class MobilePhone
{
    String brand,model;
    int price;

    void details(String brand,String model,int price){
        System.out.println("Brand="+brand);
        System.out.println("Model="+model);
        System.out.println("Price="+price);
    }
  public static void main(String[] args){
    MobilePhone ob1=new MobilePhone();
    MobilePhone ob2=new MobilePhone();
    ob1.details("oppo","k12",15000);
    ob2.details("Samsung","A35",27000);
}}