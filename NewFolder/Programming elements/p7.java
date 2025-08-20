
public class p7 {
    public static void main(String[] args) {
        double vkm,vmi,r=6378;
        vkm=(4/3)*Math.PI*Math.pow(r,3);
        vmi=(4/3)*Math.PI*Math.pow((r*1.6),3);
        System.out.println("The volume of earth in cubic kilometers is" +vkm+" and cubic miles is"+vmi);

    }    
}
