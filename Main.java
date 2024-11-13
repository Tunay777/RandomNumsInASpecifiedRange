import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int num=(int)(Math.random()*10);
        if (num%2==0){
            int num1=(int)(Math.random()*8)+63;
            System.out.println(num1);
        }else {
            int num2=(int)(Math.random()*6)+73;
            System.out.println(num2);
        }
    }
}
