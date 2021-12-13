package AssignmentOne;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ansFour{
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with a coma(,) :");
        String s =sc.nextLine();
        StringTokenizer st = new StringTokenizer(s,",");
        while (st.hasMoreTokens()){
            String temp = st.nextToken();
            num = Integer.parseInt(temp);
            System.out.println(num);
            sum = sum+num;
        }
        System.out.println("sum of the integers is :"+ sum);
    }
}
