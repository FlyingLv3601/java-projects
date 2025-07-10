import java.util.Scanner;

public class main{

    static int numberGenerate(){
        int number;
        number = (int)(Math.random() * 101);
        return number;
    }
    public static void main(String[] args){

        int balance;
        int number = numberGenerate();


        Scanner input = new Scanner(System.in);

        balance = 0;
        numberGenerate();
        while(true){
            System.out.println("guess number between 1-100");
            //System.out.println(number);


            int userInput = input.nextInt();
            if(userInput < number){System.out.println("too low");}
            else if(userInput > number){System.out.println("too high");}
            else if(userInput == number){System.out.println("nice"); balance += 100; number = numberGenerate();System.out.println("your balance:" + balance);}
            else{System.out.println("Enter number!!");}
        }
    }
}