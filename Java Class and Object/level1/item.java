public class item
{
    int itemcode=2415;
    double price=25;
    String itemname="Lay's Magic Masala";
void itemDetails(){
    System.out.println("Itemcode="+itemcode);
    System.out.println("ItemName="+itemname);
    System.out.println("Price="+price);    
}
void amount(int quantity){
    System.out.println("Amount="+(quantity*price));
    
}
public static void main(String[] args){
    item ob=new item();
    ob.itemDetails();
    ob.amount(4);
}
}
