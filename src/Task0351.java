import java.util.Scanner;

/* 
Три числа
*/

public class Task0351 {
    public static void main(String[] args) {
        //напишите тут ваш код
    Scanner keyboard = new Scanner(System.in);   
    
    int a = keyboard.nextInt();
    int b = keyboard.nextInt();    
    int c = keyboard.nextInt();
    
    boolean eq12 = (a == b); 
    boolean eq23 = (b == c); 
    boolean eq13 = (a == c);
    
    if (eq12 && eq23) 
       System.out.println(a + " " + b + " " + c);        
    else if (eq12)
       System.out.println(a + " " + b);
    else if (eq23)
       System.out.println(b + " " + c);
    else if (eq13)
       System.out.println(a + " " + c);   
        
    keyboard.close();    
    }
}
