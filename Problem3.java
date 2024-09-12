public class Problem3
{
    public static void main(String[] args)
    {
      int value = 5678;

      System.out.println("Four digit number: ");
      System.out.println(value);

      System.out.println("Here are the digits: ");
      System.out.println(value % 10);
      value /= 10;
      System.out.println(value % 10);
      value /= 10;
      System.out.println(value % 10);
      value /= 10;
      System.out.println(value % 10);
    }
}

