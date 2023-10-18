package random;
public class random
{
    public static void main(String[] args) {
        
float r = (float)(Math.random() * 101f);
int c = (int)r;
float d = r - c;
char a = (char)c;

    System.out.println("From 0 to 100, the generator picked... " + r);
    System.out.println("The integer part of this number is... " + c);   
    System.out.println("The decimal part of this number is... " + d);
    System.out.println("The ASCII code for this number is... " + a);

    }
}
