public class Problem2
{
    public static void main(String[] args)
    {
      int value = 867;

      System.out.println("Here are the digits: ");
      System.out.println(value % 10);
      value /= 10;
      System.out.println(value % 10);
      value /= 10;
      System.out.println(value % 10);
    }
}

