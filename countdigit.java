import java util.Scanner*;
public class Main {

  public static void main(String[] args) {

    int count = 0, num ;
    Scanner sc=new Scanner(System.in)
     System.out.print("Enter a number"):
    int num1=sc.nextInt();
    
      

    while (num1 != 0) {
      num1 /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}
