import java.util.Scanner;
public class P1 {

  public static void main(String[] args) {
    int r = 5, k = 0, count = 0, count1 = 0;

    for (int i = 1; i <= r; i++)
    {
      for (int s = 1; s <= r - i; s++)
      {
        System.out.print("  ");
        count++;
      }

      while (k != 2 * i - 1)
      {
        if (count <= r - 1)
        {
          System.out.print((i + k) + " ");
          count++;
        } else {
          count1++;
          System.out.print((i + k - 2 * count1) + " ");
        }

        k++;
      }
      count1 = count = k = 0;

      System.out.println();
    }
  }
}