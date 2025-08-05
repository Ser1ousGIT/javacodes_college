//Program to learn to implement classes and their objects as well as use methods other than the main method. 
import java.util.Scanner;
class Animal{
  public void Eat(){
    System.out.println("Eating now.");
  }
  public void Run(){
    System.out.println("Running now.");
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to make the animal do a function: ");
    int n = sc.nextInt();

    Animal obj = new Animal();
    if(n==1){
      obj.Eat();
    }
    else if(n==2){
      obj.Run();
    }
    else{
      System.out.println("No function mapped for that key.");
    }
  }
}
