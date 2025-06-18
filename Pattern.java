// 1.

/*public  class  Pattern1  
{
public static void main(String[] args)
{
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
output:
******
******
******
******
******
******
*/

//2

/*public class Pattern1
{
public static void main(String[] args)
{
for(int i=1;i<=5;i++)
{
for(int  j=1;j<=5;j++)
{
System.out.print(i );
}
System.out.println();
}
}
}
output:
11111
22222
33333
44444
55555
*/

//3

/*public class Pattern1
{
public static void main(String[] args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}
output:
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5 */

//4

/*public class Pattern1
{
public static void main(String[] args)
{
int count=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(count +" ");
count++;
}
System.out.println();
}
}
}
output:
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25*/

//5

/*public class Pattern1
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{ 
System.out.print(num +" ");
num++;
if(num>9)
{
num=1;
}
}
System.out.println();
}
}
}
output:
1 2 3 4 5
6 7 8 9 1
2 3 4 5 6
7 8 9 1 2
3 4 5 6 7*/

//6

/*public class Pattern1
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{ 
System.out.print(num +" ");
num+=2;
}
System.out.println();
}
}
}
output:
 1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49*/

//7

/*public class Pattern1
{
public static void main(String[] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{ 
if(j%2==1)
{
System.out.print(" 1 ");
}
else
{
System.out.print(" 0 ");
}
}
System.out.println();
}
}
}
output:
1  0  1  0  1
 1  0  1  0  1
 1  0  1  0  1
 1  0  1  0  1
 1  0  1  0  1*/

//8

/*public class Pattern1
{
public static void main(String[] args)
{
 int rows = 5;
for (int i = 0; i < rows; i++)
 {         
 for (int j = 0; j < rows - i - 1; j++)
{
System.out.print("  ");
 }   
for (int k = 0; k <= i; k++)
 {
System.out.print("*   ");
}
 System.out.println();
}
}
}
output:
        *   
      *   *   
    *   *   *   
  *   *   *   *   
*   *   *   *   * 
*/

//9

/*public class Pattern1
{
 public static void main(String[]args)
    {
      for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
output:
     2 
   2 4 
  2 4 6 
 2 4 6 8 
2 4 6 8 10 */

//10


*/
 public  class Patterns1
{
    public static void main(String[]args)
    {
    
    
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k*2+" ");
                
            }
            System.out.println();
        }
    }
}
output:
I 
I N 
I N D 
I N D I 
I N D I A  */




*/
public class Pattern {
    public static void main(String[] args) 
    {
        String word = "INDIA";
        for (int i = 1; i <=5; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}


/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

*/
class Patterns
{
    public static void main(String[]args)
    {
    
    
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}


/*
      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 
*/      


public class Pattern {
    public static void main(String[] args) 
    {
        int rows = 4; 
        for (int i = 1; i <= rows; i++) 
        {

            for (int j = 1; j <= rows - i; j++) 
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) 
            {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) 
        {
            for (int j = 1; j <= rows - i; j++) 
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}


/*
* * * * * 
*       * 
*       * 
*       * 
* * * * * 
*/



public class Pattern
{
    public static void main(String[] args) 
    {
        int size = 5; 

        for (int i = 1; i <= size; i++) 
        {
            for (int j = 1; j <= size; j++) 
            {
                if (i == 1 || i == size || j == 1 || j == size) 
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}


/*
    *     
    *     
* * * * * 
    *     
    *   
*/



public class Pattern 
{
    public static void main(String[] args) 
    {
        int n = 5; 

        int mid = n / 2 + 1; 

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
               
                if (i == mid || j == mid) 
                {
                    System.out.print("* ");
                } else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



/*
*       * 
  *   *   
    *     
  *   *   
*       * 

*/



public class Pattern {
    public static void main(String[] args) 
    {
        int n = 5; 

        for (int i = 1; i <= n; i++) 
        {         
            for (int j = 1; j <= n; j++) 
            {      
                
                if (i == j || i + j == n + 1) 
                {
                    System.out.print("* ");
                } else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
