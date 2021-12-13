package AssignmentOne;

import java.util.Scanner;
        public class ansOne{
            public static void main(String[] args) {

                int num;
                int a;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number :");
                num=sc.nextInt();
                for(int i=2;i<num;i++)
                {
                    a=0;
                    for(int j=2;j<i;j++)
                    {
                        if(i%j == 0)
                            a=1;
                    }
                    if(a == 0)
                        System.out.println(i);
                }
            }
        }

