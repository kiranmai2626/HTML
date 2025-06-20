//1.addarray
/*import java.util.Scanner;
public class Array
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of an array:");
int n=s.nextInt();
 int arr[]=new int[n];
System.out.println("Enter"  + n  + "numbers:");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+arr[i];
}
System.out.println("Total sum is "+sum);
}
}
output:
Enter the size of an array:
2
Enter2numbers:
2
1
Total sum is 3
*/

//2 average value of an array
/*public class Array
 {
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) 
{
throw new IllegalArgumentException("Array must not be null or empty.");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        double average = calculateAverage(data);
        System.out.println("Average value: " + average);
    }
}
output:
Average value: 30.0
*/

// 3 index of an array
/*public class Array
 {
 public static void main(String[] args)
    {
int[] numbers = {10, 20, 30, 40, 50};
 int target = 30;
int index = -1;
 for (int i = 0; i < numbers.length; i++) {
if (numbers[i] == target) {
 index = i;
break;    
  }
    }
if (index != -1) {
System.out.println("Element found at index: " + index);
  } else {
System.out.println("Element not found in the array.");
}
 }
}
output:
Element found at index: 2
*/

//4 array contains specific value
/*public class  Array
{
    public static void main(String[] args)
    {
        int[] numbers = {5, 10, 15, 20, 25};
        int target = 15;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == target)
            {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Array contains the value " + target);
        } else {
            System.out.println("Array does not contain the value " + target);
        }
    }
}
output:
Array contains the value 15*/

// 5 remove specific element
/*public class Array {
    public static void main(String[] args)
    {
        int[] numbers = {100, 200, 300, 400, 500};
        int removeElement = 300;
        int count = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] != removeElement)
            {
                count++;
            }
        }     
        int[] newArray = new int[count];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != removeElement)
            {
                newArray[j] = numbers[i];
                j++;
            }
        } 
        System.out.println(removeElement );
        for (int i = 0; i < newArray.length; i++)
        {
            System.out.print(newArray[i] + " ");
        }
    }
}
output:
300
100 200 400 500 */

// 6 copy an array to another
/*public class Array {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};  
        int[] copy = new int[original.length];  
        for (int i = 0; i < original.length; i++)
        {
            copy[i] = original[i];
        }
        System.out.println("Copied array elements:");
        for (int i = 0; i < copy.length; i++)
        {
            System.out.print(copy[i] + " ");
        }
    }
}
output:
Copied array elements:
10 20 30 40 50*/

// 8 min and max value 
/*public class Array
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 45, 32, 67, 29};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println( "max="+max);
        System.out.println( "min="+min);
    }
}
output:
max=67
min=10 */

//  9 reverse an array of integer values
/*public class Array {
    public static void main(String[] args)
    {
        int[] numbers = {120, 110, 200, 460, 520};
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
output:
Reversed array:
520 460 200 110 120*/

// 10 duplicate values of an array
/*public class Array
{
public static void Array(int[] arr)
{
System.out.println("Duplicate elements are:");
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.println(arr[i]);
break;
}
}
}
}
public static void main(String[] args)
{
int[] array={1,4,5,2,4,1,6,7,5};
Array(array);
}
}
output:
Duplicate elements are:
1
4
5 */

// 11 common values between two values
/*public class Array 
{
 public static void main(String[] args) {
  int[] array1 = {10, 20, 30, 40, 50};
 int[] array2 = {15, 20, 35, 40, 60};
 System.out.println("Common elements between two values:");
for (int i = 0; i < array1.length; i++) {
 for (int j = 0; j < array2.length; j++) {
 if (array1[i] == array2[j]) {
 System.out.print(array1[i] + " ");
  break;
                }
            }
        }
    }
}
output:
Common elements between two values:
20 40       */
 
// 12 remove duplicate elements
/*public class Array {
public static void main(String[] args) {
  int[] arr = {10, 20, 10, 30, 20, 40, 50, 30};
  int n = arr.length;
  int[] temp = new int[n];
 int newIndex = 0;
for (int i = 0; i < n; i++) {
   boolean isDuplicate = false;
  for (int j = 0; j < newIndex; j++) {
 if (arr[i] == temp[j]) {
   isDuplicate = true;
 break;
 }
  }
 if (!isDuplicate) {
  temp[newIndex] = arr[i];
 newIndex++;
}
}
 System.out.println("Array after removing duplicates:");
   for (int i = 0; i < newIndex; i++) {
 System.out.print(temp[i] + " ");
        }
    }
}
output:
Array after removing duplicates:
10 20 30 40 50  */

// 13 second largest number of array
/*public class  Array
{
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 20, 40};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println("Second largest element: " + second);
    }
}
output:
Second largest element: 40  */
