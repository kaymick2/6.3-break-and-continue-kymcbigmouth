import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x = 0;
    int sum = 0;
    int count = 0;
    System.out.println("enter a POSITIVE NUMBER that is LESS THAN 10");
    do {
      x = in.nextInt();
      if (x == 3) {
        x = 0;
        System.out.println("Sum=" + sum);
        continue;
      } else if (x > 10) {
        System.out.println("lol nope");
        break;
      } else if (x < 0) {
        System.out.println("pls don't break my code thanks :)");
        break;
      }
      sum = x + sum;
      System.out.println("Sum=" + sum);
      count++;
    } while (x <= 10);
    System.out.println("count= "+count);
    double average=sum/count;
    System.out.println("The average of the inputted values (rounded to the closest integer) is " + average);

  }
}