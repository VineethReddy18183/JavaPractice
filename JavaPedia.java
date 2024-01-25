/*
 * **﻿**﻿**﻿**﻿**Javapedia**﻿**﻿**﻿**﻿**
How many historical figures will you register?﻿2


        Figure: 1
         - Name: Marco Polo
         - Date of birth: 08﻿/﻿01﻿/﻿1324
         - Occupation: Merchant


        Figure: 2
         - Name: Shakespeare
         - Date of birth: 26﻿/﻿03﻿/﻿1564
         - Occupation: Playwright


These are the values you stored:
        Marco Polo 08﻿/﻿01﻿/﻿1324 Merchant
        Shakespeare 26﻿/﻿03﻿/﻿1564 Playwright


Wh﻿o ﻿do﻿ y﻿ou want infor﻿ma﻿ti﻿on﻿ on? Marco Polo


        Name: Marco Polo
       ﻿ Date of birth: 08/01/1324
        Occupation: Merchant

 */
import java.util.*;
import java.util.Arrays;

public class JavaPedia {
    public static void main(String args[])

    {
        
        System.out.println("***********JAVA PEDIA**************");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many historical figures you want to register: ");
        int num = sc.nextInt();

        sc.nextLine(); 
        String info[][] = new String[num][3];     
        
        for(int i = 0;i<num;i++)
        {
            
            String Name = sc.nextLine();
            
            
            String DOB = sc.next();
            
            String Occupation = sc.next();
            System.out.println("Figure: " + (i+1));
            
            System.out.println("    .Name: "+Name);
            System.out.println("    .Date of birth: " + DOB);
            System.out.println("    .Occupation: "+Occupation);
            sc.nextLine();
            
            info[i][0] = Name;
            info[i][1] = DOB;
            info[i][2] = Occupation; 

        }
        System.out.println("You stored the following data: ");
        for(int i = 0;i<num;i++)
        {
            for(int j = 0;j<3;j++)
            {
                System.out.print(info[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Who do you want information on?");
        String wantName = sc.next();
        for(int i = 0;i<num;i++)
        {
            if(info[i][0].equals(wantName))
            {
                System.out.println("Name: "+info[i][0]);
                System.out.println("Date of Birth: "+info[i][1]);
                System.out.println("Occupation: "+info[i][2]);
            }
        }
    }
    
}
