Single-Dimensional 
Arrays
Objectives
■
■To describe why arrays are necessary in programming (§7.1).
■
■To declare array reference variables and create arrays (§§7.2.1 and 7.2.2).
■
■To obtain array size using arrayRefVar.length and know default 
values in an array (§7.2.3).
■
■To access array elements using indexes (§7.2.4).
■
■To declare, create, and initialize an array using an array initializer 
(§7.2.5).
■
■To program common array operations (displaying arrays, summing 
all elements, finding the minimum and maximum elements, random 
shuffling, and shifting elements) (§7.2.6).
■
■To simplify programming using the foreach loops (§7.2.7).
■
■To apply arrays in application development (AnalyzeNumbers, and 
DeckOfCards) (§§7.3 and 7.4).
■
■To copy contents from one array to another (§7.5).
■
■To develop and invoke methods with array arguments and return values 
(§§7.6–7.8).
■
■To define a method with a variable-length argument list (§7.9).
■
■To search elements using the linear (§7.10.1) or binary (§7.10.2) search 
algorithm.
■
■To sort an array using the selection sort approach (§7.11).
■
■To use the methods in the java.util.Arrays class (§7.12).
■
■To pass arguments to the main method from the command line (§7.13).
CHAPTER
7
272  Chapter 7    Single-Dimensional Arrays
7.1  Introduction
A single array variable can reference a large collection of data.
Often you will have to store a large number of values during the execution of a program. 
Suppose, for instance, that you need to read 100 numbers, compute their average, and find 
out how many numbers are above the average. Your program first reads the numbers and 
computes their average, then compares each number with the average to determine whether 
it is above the average. In order to accomplish this task, the numbers must all be stored in 
variables. You have to declare 100 variables and repeatedly write almost identical code 100 
times. Writing a program this way would be impractical. So, how do you solve this 
problem?
An efficient, organized approach is needed. Java and most other high-level languages pro-
vide a data structure, the array, which stores a fixed-size sequential collection of elements of 
the same type. In the present case, you can store all 100 numbers into an array and access them 
through a single array variable.
This chapter introduces single-dimensional arrays. The next chapter will introduce two-­
dimensional and multidimensional arrays.
7.2  Array Basics
Once an array is created, its size is fixed. An array reference variable is used to 
access the elements in an array using an index.
An array is used to store a collection of data, but often we find it more useful to think of an 
array as a collection of variables of the same type. Instead of declaring individual variables, 
such as number0, number1, . . . , and number99, you declare one array variable such as 
numbers and use numbers[0], numbers[1], . . . , and numbers[99] to represent individual 
variables. This section introduces how to declare array variables, create arrays, and process 
arrays using indexes. 
7.2.1  Declaring Array Variables
To use an array in a program, you must declare a variable to reference the array and specify 
the array’s element type. Here is the syntax for declaring an array variable.
elementType[] arrayRefVar;
or
elementType arrayRefVar[]; // Allowed, but not preferred 
The elementType can be any data type, and all elements in the array will have the same 
data type. For example, the following code declares a variable myList that references an array 
of double elements.
double[] myList;
or
double myList[]; // Allowed, but not preferred
Note
You can use elementType arrayRefVar[] to declare an array variable. This style 
comes from the C/C+ + language and was adopted in Java to accommodate C/C+ + 
programmers. The style elementType[] arrayRefVar is preferred. 
Point
Key
problem
why array?
Point
Key
index
element type
preferred syntax
7.2  Array Basics  273
7.2.2  Creating Arrays
Unlike declarations for primitive data type variables, the declaration of an array variable does 
not allocate any space in memory for the array. It creates only a storage location for the refer-
ence to an array. If a variable does not contain a reference to an array, the value of the variable 
is null. You cannot assign elements to an array unless it has already been created. After an 
array variable is declared, you can create an array by using the new operator and assign its 
reference to the variable with the following syntax: 
arrayRefVar = new elementType[arraySize];
This statement does two things: (1) it creates an array using new elementType[arraySize]  
and (2) it assigns the reference of the newly created array to the variable arrayRefVar.
Declaring an array variable, creating an array, and assigning the reference of the array to 
the variable can be combined in one statement as
elementType[] arrayRefVar = new elementType[arraySize];
or
elementType arrayRefVar[] = new elementType[arraySize];
Here is an example of such a statement:
double[] myList = new double[10];
This statement declares an array variable, myList, creates an array of 10 elements of double 
type, and assigns its reference to myList. To assign values to the elements, use the syntax
arrayRefVar[index] = value;
For example, the following code initializes the array:
myList[0] = 5.6;
myList[1] = 4.5;
myList[2] = 3.3;
myList[3] = 13.2;
myList[4] = 4.0;
myList[5] = 34.33;
myList[6] = 34.0;
myList[7] = 45.45;
myList[8] = 99.993;
myList[9] = 11123;
This array is illustrated in Figure 7.1.
null
new operator
Figure 7.1  The array myList has 10 elements of double type and int indices from 0 to 9.
double[] myList = new double[10];
myList
myList[0]
myList[1]
myList[2]
myList[3]
myList[4]
myList[6]
myList[5]
myList[7]
myList[8]
myList[9]
Array reference
variable
Array element at
index 5
5.6
4.5
3.3
13.2
4.0
34.33
34.0
45.45
99.993
11123
Element value
reference
274  Chapter 7    Single-Dimensional Arrays
Note
An array variable that appears to hold an array actually contains a reference to that array. 
Strictly speaking, an array variable and an array are different, but most of the time the 
distinction can be ignored. Thus, it is all right to say, for simplicity, that myList is an 
array, instead of stating, at greater length, that myList is a variable that contains a 
reference to an array of double elements.
7.2.3  Array Size and Default Values
When space for an array is allocated, the array size must be given, specifying the number of ele-
ments that can be stored in it. The size of an array cannot be changed after the array is created. 
Size can be obtained using arrayRefVar.length. For example, myList.length is 10. 
When an array is created, its elements are assigned the default value of 0 for the numeric 
primitive data types, \u0000 for char types, and false for boolean types. 
7.2.4  Accessing Array Elements
The array elements are accessed through the index. Array indices are 0 based; that is, they 
range from 0 to arrayRefVar.length − 1. In the example in Figure 7.1, myList holds 10 
double values, and the indices are from 0 to 9.
Each element in the array is represented using the following syntax, known as an indexed 
variable:
arrayRefVar[index];
For example, myList[9] represents the last element in the array myList.
Caution
Some programming languages use parentheses to reference an array element, as in  
myList(9), but Java uses brackets, as in myList[9].
An indexed variable can be used in the same way as a regular variable. For example, the 
following code adds the values in myList[0] and myList[1] to myList[2]:
myList[2] = myList[0] + myList[1];
The following loop assigns 0 to myList[0], 1 to myList[1], . . . , and 9 to myList[9]:
for (int i = 0; i < myList.length; i++) {
  myList[i] = i;
}
7.2.5  Array Initializers
Java has a shorthand notation, known as the array initializer, which combines the declaration, 
creation, and initialization of an array in one statement using the following syntax:
elementType[] arrayRefVar = {value0, value1, ..., valuek};
For example, the statement
double[] myList = {1.9, 2.9, 3.4, 3.5};
declares, creates, and initializes the array myList with four elements, which is equivalent to 
the following statements:
double[] myList = new double[4];
myList[0] = 1.9;
myList[1] = 2.9;
array vs. array variable
array length
default values
0 based index
indexed variable
array initializer
7.2  Array Basics  275
myList[2] = 3.4;
myList[3] = 3.5;
Caution
The new operator is not used in the array-initializer syntax. Using an array initializer, 
you have to declare, create, and initialize the array all in one statement. Splitting it would 
cause a syntax error. Thus, the next statement is wrong:
double[] myList;
myList = {1.9, 2.9, 3.4, 3.5}; // Wrong
7.2.6  Processing Arrays
When processing array elements, you will often use a for loop for one of two reasons:
1.	 All of the elements in an array are of the same type. They are evenly processed in the 
same fashion repeatedly using a loop.
2.	 Since the size of the array is known, it is natural to use a for loop.
Assume that the array is created as follows:
double[] myList = new double[10];
The following are some examples of processing arrays:
1.	 Initializing arrays with input values: The following loop initializes the array myList 
with user input values:
java.util.Scanner input = new java.util.Scanner(System.in);
System.out.print("Enter " + myList.length + " values: ");
for (int i = 0; i < myList.length; i++)
  myList[i] = input.nextDouble();
2.	 Initializing arrays with random values: The following loop initializes the array myList 
with random values between 0.0 and 100.0, but less than 100.0:
for (int i = 0; i < myList.length; i++) {
  myList[i] = Math.random() * 100;
}
3.	 Displaying arrays: To print an array, you have to print each element in the array using 
a loop such as the following:
for (int i = 0; i < myList.length; i++) {
  System.out.print(myList[i] + " ");
}
Tip
For an array of the char[] type, it can be printed using one print statement. For 
­example, the following code displays Dallas:
char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
System.out.println(city);
4.	 Summing all elements: Use a variable named total to store the sum. Initially total is 
0. Add each element in the array to total using a loop such as the following:
double total = 0;
for (int i = 0; i < myList.length; i++) {
  total += myList[i];
}
print character array
276  Chapter 7    Single-Dimensional Arrays
5.	 Finding the largest element: Use a variable named max to store the largest 
­element. Initially max is myList[0]. To find the largest element in the array 
­myList, ­compare each element with max, and update max if the element is greater 
than max.
double max = myList[0];
for (int i = 1; i < myList.length; i++) {
  if (myList[i] > max) max = myList[i]; 
}
6.	 Finding the smallest index of the largest element: Often you need to locate the largest 
element in an array. If an array has multiple elements with the same largest value, find 
the smallest index of such an element. Suppose that the array myList is {1, 5, 3, 4, 5, 
5}. The largest element is 5, and the smallest index for 5 is 1. Use a variable named max 
to store the largest element, and a variable named indexOfMax to denote the index of 
the largest element. Initially max is myList[0] and indexOfMax is 0. Compare each 
element in myList with max and update max and indexOfMax if the element is greater 
than max.
double max = myList[0];
int indexOfMax = 0;
for (int i = 1; i < myList.length; i++) {
  if (myList[i] > max) {
    max = myList[i];
    indexOfMax = i;
  }
}
7.	 Random shuffling: In many applications, you need to randomly reorder the elements 
in an array. This is called shuffling. To accomplish this, for each element myList[i], 
randomly generate an index j and swap myList[i] with myList[j], as follows:
random shuffling
VideoNote
Random shuffling
swap
myList
i
[1]
[i]
for (int i = 0; i < myList.length – 1; i++) {
// Generate an index j randomly
int j = (int)(Math.random()
* myList.length);
// Swap myList[i] with myList[j]
double temp = myList[i];
myList[i] = myList[j];
myList[j] = temp;
}
.
.
[0]
A random index [j]
myList
8.	 Shifting elements: Sometimes you need to shift the ­elements left or right. Here is an example of 
shifting the elements one position to the left and filling the last element with the first element:
double temp = myList[0]; // Retain the first element
// Shift elements left
for (int i = 1; i < myList.length; i++) {
   myList[i - 1] = myList[i];
}
// Move the first element to fill in the last position
myList[myList.length - 1] = temp;
9.	 Simplifying coding: Arrays can be used to greatly simplify coding for certain tasks. For exam-
ple, suppose you wish to obtain the English name of a given month by its number. If the month 
names are stored in an array, the month name for a given month can be accessed simply via 
7.2  Array Basics  277
the index. The following code prompts the user to enter a month number and displays 
its month name:
String[] months = {"January", "February",..., "December"};
System.out.print("Enter a month number (1 to 12): ");
int monthNumber = input.nextInt();
System.out.println("The month is " + months[monthNumber − 1]);
	 If you didn’t use the months array, you would have to determine the month name using 
a lengthy multiway if−else statement as follows:
if (monthNumber == 1)
  System.out.println("The month is January");
else if (monthNumber == 2)
  System.out.println("The month is February");
...
else
  System.out.println("The month is December");
7.2.7  Foreach Loops
Java supports a convenient for loop, known as a foreach loop, which enables you to traverse 
the array sequentially without using an index variable. For example, the following code dis-
plays all the elements in the array myList:
for (double e: myList) {
  System.out.println(e);
}
You can read the code as “for each element e in myList, do the following.” Note that the 
variable, e, must be declared as the same type as the elements in myList.
In general, the syntax for a foreach loop is
for (elementType element: arrayRefVar) {
  // Process the element
}
You still have to use an index variable if you wish to traverse the array in a different order or 
change the elements in the array.
Caution
Accessing an array out of bounds is a common programming error that throws a runtime 
ArrayIndexOutOfBoundsException. To avoid it, make sure you do not use 
an index beyond arrayRefVar.length − 1 or simply using a foreach loop if 
possible.
Programmers often mistakenly reference the first element in an array with index 1, but 
it should be 0. This is called the off-by-one error. Another common off-by-one error in 
a loop is using <= where < should be used. For example, the following loop is wrong:
for (int i = 0; i <= list.length; i++)
  System.out.print(list[i] + " ");
The <= should be replaced by <. Using a foreach loop can avoid the off-by-one error in 
this case.   
	7.2.1	
How do you declare an array reference variable and how do you create an array?
	7.2.2	 When is the memory allocated for an array?
ArrayIndexOutOfBounds- 
Exception
off-by-one error
Point
Check
278  Chapter 7    Single-Dimensional Arrays
	7.2.3	 Indicate true or false for the following statements:
a.	 Every element in an array has the same type.
b.	 The array size is fixed after an array reference variable is declared.
c.	 The array size is fixed after it is created.
d.	 The elements in an array must be of a primitive data type.
	7.2.4	 What is the output of the following code?
int x = 30;
int[] numbers = new int[x];
x = 60;
System.out.println("x is " + x);
System.out.println("The size of numbers is " + numbers.length);
	7.2.5	 How do you access elements in an array?
	7.2.6	 What is the array index type? What is the lowest index? What is the representation 
of the third element in an array named a?
	7.2.7	 Which of the following statements are valid?
a.	 int i = new int(30);
b.	 double d[] = new double[30];
c.	 char[] r = new char(1..30);
d.	 int i[] = (3, 4, 3, 2);
e.	 float f[] = {2.3, 4.5, 6.6};
f.	 char[] c = new char();
	7.2.8	 Write statements to do the following:
a.	 Create an array to hold 10 double values.
b.	 Assign the value 5.5 to the last element in the array.
c.	 Display the sum of the first two elements.
d.	 Write a loop that computes the sum of all elements in the array.
e.	 Write a loop that finds the minimum element in the array.
f.	 Randomly generate an index and display the element of this index in the array.
g.	 Use an array initializer to create another array with the initial values 3.5, 5.5, 
4.52, and 5.6.
	7.2.9	 What happens when your program attempts to access an array element with an 
­invalid index?
	7.2.10	 Identify and fix the errors in the following code:
1  public class Test {
2    public static void main(String[] args) {
3      double[100] r;
4
5      for (int i = 0; i < r.length(); i++);
6        r(i) = Math.random * 100;
7    }
8  }
	7.2.11	 What is the output of the following code?
 1  public class Test {
 2    public static void main(String[] args) {
 3      int list[] = {1, 2, 3, 4, 5, 6};
7.3  Case Study: Analyzing Numbers  279
 4      for (int i = 1; i < list.length; i++)
 5        list[i] = list[i − 1];
 6
 7      for (int i = 0; i < list.length; i++)
 8        System.out.print(list[i] + " ");
 9    }
10  }
7.3  Case Study: Analyzing Numbers
The problem is to write a program that finds the number of items above the average of 
all items.
Now you can write a program using arrays to solve the problem proposed at the beginning of 
this chapter. The problem is to read 100 numbers, get the average of these numbers, and find 
the number of the items greater than the average. To be flexible for handling any ­number of 
inputs, we will let the user enter the number of inputs, rather than fixing it to 100. Listing 7.1 
gives a solution.
Point
Key
Enter the number of items: 10  
Enter the numbers: 3.4 5 6 1 6.5 7.8 3.5 8.5 6.3 9.5  
Average is 5.75
Number of elements above the average is 6
Listing 7.1 
AnalyzeNumbers.java
 1  public class AnalyzeNumbers {
 2    public static void main(String[] args) {                   
 3      java.util.Scanner input = new java.util.Scanner(System.in);
 4      System.out.print("Enter the number of items: ");         
 5      int n = input.nextInt();
 6      double[] numbers = new double[n];                        
 7      double sum = 0;                                           
 8                                                              
 9      System.out.print("Enter the numbers: ");
10      for (int i = 0; i < n; i++) {                           
11        numbers[i] = input.nextDouble();                       
12        sum += numbers[i];                                    
13      }
14
15      double average = sum / n;
16
17      int count = 0; // The number of elements above average 
18      for (int i = 0; i < n; i++)
19        if (numbers[i] > average)
20          count++;
21
22      System.out.println("Average is " + average);
23      System.out.println("Number of elements above the average is " 
24        + count);
25    }
26  }
get average
numbers[0]:
numbers[1]:
numbers[2]:
.
.
numbers[i]:
.
numbers[n-3]:
numbers[n-2]:
numbers[n-1]:
create array
store number in array
above average?
The program prompts the user to enter the array size (line 5) and creates an array with the 
­specified size (line 6). The program reads the input, stores numbers into the array (line 11), 
adds each number to sum in line 12, and obtains the average (line 15). It then compares 
280  Chapter 7    Single-Dimensional Arrays
each number in the array with the average to count the number of values above the average 
(lines 7–20).
7.4  Case Study: Deck of Cards
The problem is to create a program that will randomly select four cards from a deck 
of cards.
Say you want to write a program that will pick four cards at random from a deck of 52 cards. 
All the cards can be represented using an array named deck, filled with initial values 0–51, 
as follows:
int[] deck = new int[52];
// Initialize cards
for (int i = 0; i < deck.length; i++)
  deck[i] = i;
Card numbers 0–12, 13–25, 26–38, and 39–51 represent 13 Spades, 13 Hearts, 13 Diamonds, 
and 13 Clubs, respectively, as shown in Figure 7.2. cardNumber / 13 determines the suit 
of the card, and cardNumber % 13 determines the rank of the card, as shown in Figure 7.3. 
After shuffling the array deck, pick the first four cards from deck. The program displays the 
cards from these four card numbers.
Point
Key
VideoNote
Deck of cards
Figure 7.3 
cardNumber identifies a card’s suit and rank number.
cardNumber / 13 = 
0
3
2
1
Spades
Hearts
Diamonds
Clubs
cardNumber % 13 = 
0
11
10
.
Ace
1
2
.
12
Jack
Queen
King
Figure 7.2  52 cards are stored in an array named deck.
0
.
.
.
12
13
.
.
.
25
26
.
.
.
38
39
.
.
.
51
13 Diamonds (  )
13 Clubs (  )
0
.
.
.
12
13
.
.
.
25
26
.
.
.
38
39
.
.
.
51
deck
[0]
.
.
.
[12]
[13]
.
.
.
[25]
[26]
.
.
.
[38]
[39]
.
.
.
[51]
Random shuffle
6
48
11
24
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
deck
[0]
[1]
[2]
[3]
[4]
[5]
.
.
.
[25]
[26]
.
.
.
[38]
[39]
.
.
.
[51]
Card number 6 is the
7 (6 % 13 5 6) of
Spades (6 / 13 is 0)
Card number 48 is the
10 (48 % 13 5 9) of
Clubs (48 / 13 is 3)
Card number 11 is the
Queen (11 % 13 5 11) of
Spades (11 / 13 is 0)
Card number 24 is the
Queen (24 % 13 5 11) of
Hearts (24 / 13 is 1)
13 Hearts (  )
13 Spades (  )
7.4  Case Study: Deck of Cards  281
Listing 7.2 gives the solution to the problem.
Listing 7.2 
DeckOfCards.java
 1  public class DeckOfCards {
 2    public static void main(String[] args) {
 3      int[] deck = new int[52];
 4      String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
 5      String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
 6        "10", "Jack", "Queen", "King"};
 7
 8      // Initialize the cards
 9      for (int i = 0; i < deck.length; i++)
10        deck[i] = i;
11
12      // Shuffle the cards 
13      for (int i = 0; i < deck.length; i++) {
14        // Generate an index randomly 
15        int index = (int)(Math.random() * deck.length);
16        int temp = deck[i];
17        deck[i] = deck[index];
18        deck[index] = temp;
19      }
20
21      // Display the first four cards 
22      for (int i = 0; i < 4; i++) {
23        String suit = suits[deck[i] / 13];
24        String rank = ranks[deck[i] % 13];
25        System.out.println("Card number " + deck[i] + ": " 
26          + rank + " of " + suit);
27      }
28    }
29  }
create array deck
array of strings
initialize deck
shuffle deck
suit of a card
rank of a card
 Card number 6: 7 of Spades
 Card number 48: 10 of Clubs
 Card number 11: Queen of Spades
 Card number 24: Queen of Hearts
The program creates an array suits for four suits (line 4) and an array ranks for 13 cards in 
a suit (lines 5 and 6). Each element in these arrays is a string.
The program initializes deck with values 0–51 in lines 9 and 10. The deck value 0 rep-
resents the Ace of Spades, 1 represents the card 2 of Spades, 13 represents the Ace of Hearts, 
and 14 represents the 2 of Hearts.
Lines 13–19 randomly shuffle the deck. After a deck is shuffled, deck[i] contains an 
arbitrary value. deck[i] / 13 is 0, 1, 2, or 3, which determines the suit (line 23). deck[i] 
% 13 is a value between 0 and 12, which determines the rank (line 24). If the suits array is 
not defined, you would have to determine the suit using a lengthy multiway if−else state-
ment as follows:
if (deck[i] / 13 == 0)
  System.out.print("suit is Spades");
else if (deck[i] / 13 == 1)
  System.out.print("suit is Hearts");
else if (deck[i] / 13 == 2)
  System.out.print("suit is Diamonds");
else
  System.out.print("suit is Clubs");
282  Chapter 7    Single-Dimensional Arrays
With suits = {"Spades", "Hearts", "Diamonds", "Clubs"} created in an array, 
suits[deck[i] / 13] gives the suit for deck[i]. Using arrays greatly simplifies the 
solution for this program.
	7.4.1	
Will the program pick four random cards if you replace lines 22–27 in Listing 7.2, 
DeckOfCards.java, with the following code?
 for (int i = 0; i < 4; i++) {
   int cardNumber = (int)(Math.random() * deck.length);
   String suit = suits[cardNumber / 13];
   String rank = ranks[cardNumber % 13];
   System.out.println("Card number " + cardNumber + ": " 
     + rank + " of " + suit);
 }
7.5  Copying Arrays
To copy the contents of one array into another, you have to copy the array’s individ-
ual elements into the other array.
Often, in a program, you need to duplicate an array or a part of an array. In such cases you 
could attempt to use the assignment statement (=), as follows:
list2 = list1;
However, this statement does not copy the contents of the array referenced by list1 to list2, 
but instead merely copies the reference value from list1 to list2. After this statement, 
list1 and list2 reference the same array, as shown in Figure 7.4. The array previously 
referenced by list2 is no longer referenced; it becomes garbage, which will be automatically 
collected by the Java Virtual Machine. This process is called garbage collection.
Point
Check
Point
Key
copy reference
garbage collection
Figure 7.4  Before the assignment statement, list1 and list2 point to separate memory 
locations. After the assignment, the reference of the list1 array is passed to list2.
Contents
of list1
list1
list2
Before the assignment:
list2 = list1;
list1
list2
After the assignment:
list2 = list1;
Contents
of list2
Contents
of list1
Contents
of list2
In Java, you can use assignment statements to copy primitive data type variables, but not arrays. 
Assigning one array variable to another array variable actually copies one reference to another 
and makes both variables point to the same memory location.
There are three ways to copy arrays:
1.	 Use a loop to copy individual elements one by one.
2.	 Use the static arraycopy method in the System class.
3.	 Use the clone method to copy arrays; this will be introduced in Chapter 13, Abstract 
Classes and Interfaces.
7.6  Passing Arrays to Methods  283
You can write a loop to copy every element from the source array to the ­corresponding element 
in the target array. The following code, for instance, copies sourceArray to ­targetArray 
using a for loop:
int[] sourceArray = {2, 3, 1, 5, 10};
int[] targetArray = new int[sourceArray.length];
for (int i = 0; i < sourceArray.length; i++) {
  targetArray[i] = sourceArray[i];
}
Another approach is to use the arraycopy method in the java.lang.System class to copy 
arrays instead of using a loop. The syntax for arraycopy is:
arraycopy(sourceArray, srcPos, targetArray, tarPos, length);
The parameters srcPos and tarPos indicate the starting positions in sourceArray and 
­targetArray, respectively. The number of elements copied from sourceArray to 
­targetArray is indicated by length. For example, you can rewrite the loop using the 
­following statement:
System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
The arraycopy method does not allocate memory space for the target array. The target array 
must have already been created with its memory space allocated. After the copying takes place, 
targetArray and sourceArray have the same content but independent memory locations.
Note
The arraycopy method violates the Java naming convention. By convention, this 
method should be named arrayCopy (i.e., with an uppercase C).
	7.5.1	
Use the arraycopy method to copy the following array to a target array t:
int[] source = {3, 4, 5};
	7.5.2	 Once an array is created, its size cannot be changed. Does the following code resize 
the array?
int[] myList;
myList = new int[10];
// Sometime later you want to assign a new array to myList 
myList = new int[20];
7.6  Passing Arrays to Methods
When passing an array to a method, the reference of the array is passed to the method.
Just as you can pass primitive type values to methods, you can also pass arrays to methods. 
For example, the following method displays the elements in an int array:
public static void printArray(int[] array) {
  for (int i = 0; i < array.length; i++) {
    System.out.print(array[i] + " ");
  }	
}
You can invoke it by passing an array. For example, the following statement invokes the 
printArray method to display 3, 1, 2, 6, 4, and 2.
printArray(new int[]{3, 1, 2, 6, 4, 2});
arraycopy method
Point
Check
Point
Key
284  Chapter 7    Single-Dimensional Arrays
Note
The preceding statement creates an array using the following syntax:
new elementType[]{value0, value1, ..., valuek};
There is no explicit reference variable for the array. Such array is called an anonymous 
array.
Java uses pass-by-value to pass arguments to a method. There are important differences 
between passing the values of variables of primitive data types and passing arrays.
■
■For an argument of a primitive type, the argument’s value is passed.
■
■For an argument of an array type, the value of the argument is a reference to an array; 
this reference value is passed to the method. Semantically, it can be best described as 
pass-by-sharing, that is, the array in the method is the same as the array being passed. 
Thus, if you change the array in the method, you will see the change outside the method.
Take the following code, for example:
public class TestArrayArguments {
  public static void main(String[] args) {
    int x = 1; // x represents an int value 
    int[] y = new int[10]; // y represents an array of int values 
    m(x, y); // Invoke m with arguments x and y 
    System.out.println("x is " + x);
    System.out.println("y[0] is " + y[0]);
  }
  public static void m(int number, int[] numbers) {
    number = 1001; // Assign a new value to number 
    numbers[0] = 5555; // Assign a new value to numbers[0]
  }
}
anonymous array
pass-by-value
pass-by-sharing
x is 1
y[0] is 5555 
You may wonder why after m is invoked, x remains 1, but y[0] becomes 5555. This is 
because y and numbers, although they are independent variables, reference the same array, as 
illustrated in Figure 7.5. When m(x, y) is invoked, the values of x and y are passed to number 
and numbers. Since y contains the reference value to the array, numbers now contains the 
same reference value to the same array.
Figure 7.5  The primitive type value in x is passed to number, and the reference value in y 
is passed to numbers.
Activation record for
the main method
int[] y:
int x:
                      Stack
Activation record for
method m
int[] numbers:
int number: 
An array of
ten int values
is stored here
Arrays are
stored in a
heap
Heap
1
reference
1
reference
7.6  Passing Arrays to Methods  285
Note
Arrays are objects in Java (objects are introduced in Chapter 9). The JVM stores the 
objects in an area of memory called the heap, which is used for dynamic memory 
allocation.
Listing 7.3 gives another program that shows the difference between passing a primitive data 
type value and an array reference variable to a method.
The program contains two methods for swapping elements in an array. The first method, 
named swap, fails to swap two int arguments. The second method, named swapFirst­
TwoInArray, successfully swaps the first two elements in the array argument.
Listing 7.3 
TestPassArray.java
 1  public class TestPassArray {
 2    /** Main method */
 3    public static void main(String[] args) {
 4      int[] a = {1, 2};
 5
 6      // Swap elements using the swap method
 7      System.out.println("Before invoking swap");
 8      System.out.println("array is {" + a[0] + ", " + a[1] + "}");
 9      swap(a[0], a[1]);
10      System.out.println("After invoking swap");
11      System.out.println("array is {" + a[0] + ", " + a[1] + "}");
12
13      // Swap elements using the swapFirstTwoInArray method 
14      System.out.println("Before invoking swapFirstTwoInArray");
15      System.out.println("array is {" + a[0] + ", " + a[1] + "}");
16      swapFirstTwoInArray(a);
17      System.out.println("After invoking swapFirstTwoInArray");
18      System.out.println("array is {" + a[0] + ", " + a[1] + "}");
19    }
20
21    /** Swap two variables */ 
22    public static void swap(int n1, int n2) {
23      int temp = n1;
24      n1 = n2;
25      n2 = temp;
26    }
27 
28    /** Swap the first two elements in the array */ 
29    public static void swapFirstTwoInArray(int[] array) {
30      int temp = array[0];
31      array[0] = array[1];
32      array[1] = temp;
33    }
34  } 
heap
false swap
swap array elements
Before invoking swap
array is {1, 2}
After invoking swap
array is {1, 2}
Before invoking swapFirstTwoInArray
array is {1, 2}
After invoking swapFirstTwoInArray
array is {2, 1}
286  Chapter 7    Single-Dimensional Arrays
As shown in Figure 7.6, the two elements are not swapped using the swap method. However, 
they are swapped using the swapFirstTwoInArray method. Since the parameters in the 
swap method are primitive type, the values of a[0] and a[1] are passed to n1 and n2 inside 
the method when invoking swap(a[0], a[1]). The memory locations for n1 and n2 are 
independent of the ones for a[0] and a[1]. The contents of the array are not affected by 
this call.
The parameter in the swapFirstTwoInArray method is an array. As shown in Figure 7.6, 
the reference of the array is passed to the method. Thus, the variables a (outside the method) 
and array (inside the method) both refer to the same array in the same memory location. 
Therefore, swapping array[0] with array[1] inside the method swapFirstTwoInArray 
is the same as swapping a[0] with a[1] outside of the method.
	7.6.1	
True or false? When an array is passed to a method, a new array is created and 
passed to the method.
7.7  Returning an Array from a Method
When a method returns an array, the reference of the array is returned.
You can pass arrays when invoking a method. A method may also return an array. For example, 
the following method returns an array that is the reversal of another array.
Point
Check
Point
Key
create array
return array
l public static int[] reverse(int[] list) {
2   int[] result = new int[list.length];
3
4   for (int i = 0, j = result.length - 1;
5        i < list.length; i++, j--) {
6     result[j] = list[i];
7   }
8
9   return result;
10 }
list
i
j
result
Line 2 creates a new array result. Lines 4–7 copy elements from array list to array 
result. Line 9 returns the array. For example, the following statement returns a new array 
list2 with elements 6, 5, 4, 3, 2, 1:
int[] list1 = {1, 2, 3, 4, 5, 6};
int[] list2 = reverse(list1);
Figure 7.6  When passing an array to a method, the reference of the array is passed to the 
method.
Invoke swap(int n1, int n2).
The primitive type values in
a[0] and a[1] are passed to the
swap method.
Invoke swapFirstTwoInArray(int[]
array). The reference value in a is passed
to the swapFirstTwoInArray method.
The arrays are
stored in a
heap.
Stack
Heap
Activation record for
the swap method
Activation record for
the main method
n2: 2
n1: 1
int[] a
reference
reference
reference
Stack
Activation record for the
swapFirstTwoInArray
method
Activation record for the
main method
int[] a
int[] array
a[0]: 1
a[1]: 2
7.8  Case Study: Counting the Occurrences of Each Letter  287
	7.7.1	
Suppose the following code is written to reverse the contents in an array, explain 
why it is wrong. How do you fix it?
int[] list = {1, 2, 3, 5, 4};
for (int i = 0, j = list.length − 1; i < list.length; i++, j−−) {
  // Swap list[i] with list[j]
  int temp = list[i];
  list[i] = list[j];
  list[j] = temp;
}
7.8  Case Study: Counting the Occurrences 
of Each Letter
This section presents a program to count the occurrences of each letter in an array of 
characters.
The program given in Listing 7.4 does the following:
1.	 Generates 100 lowercase letters randomly and assigns them to an array of characters, as 
shown in Figure 7.7a. You can obtain a random letter by using the getRandomLower- 
CaseLetter() method in the RandomCharacter class in Listing 6.10.
2.	 Count the occurrences of each letter in the array. To do so, create an array, say counts, of 
26 int values, each of which counts the occurrences of a letter, as shown in ­Figure 7.7b. 
That is, counts[0] counts the number of a’s, counts[1] counts the number of b’s, 
and so on.
Point
Check
Point
Key
Figure 7.7  The chars array stores 100 characters, and the counts array stores 26 counts, 
each of which counts the occurrences of a letter.
…
…
chars[0]
chars[1]
…
…
chars[98]
chars[99]
…
…
counts[0]
counts[1]
…
…
counts[24]
counts[25]
(a)
(b)
Listing 7.4 
CountLettersInArray.java
 1  public class CountLettersInArray {
 2    /** Main method */
 3    public static void main(String[] args) {
 4      // Declare and create an array
 5      char[] chars = createArray();
 6
 7      // Display the array
 8      System.out.println("The lowercase letters are:");
 9      displayArray(chars);
10
create array
pass array
288  Chapter 7    Single-Dimensional Arrays
11       // Count the occurrences of each letter 
12      int[] counts = countLetters(chars);
13
14       // Display counts 
15      System.out.println();
16      System.out.println("The occurrences of each letter are:");
17      displayCounts(counts);
18    }
19
20     /** Create an array of characters */ 
21    public static char[] createArray() {
22      // Declare an array of characters and create it 
23      char[] chars = new char[100];
24
25      // Create lowercase letters randomly and assign 
26      // them to the array 
27      for (int i = 0; i < chars.length; i++)
28        chars[i] = RandomCharacter.getRandomLowerCaseLetter();
29
30      // Return the array 
31      return chars;
32    }
33
34     /** Display the array of characters */
35    public static void displayArray(char[] chars) {
36      // Display the characters in the array 20 on each line 
37      for (int i = 0; i < chars.length; i++) {
38        if ((i + 1) % 20 == 0)
39          System.out.println(chars[i]);
40        else 
41          System.out.print(chars[i] + " ");
42      }
43    }
44
45    /** Count the occurrences of each letter */ 
46    public static int[] countLetters(char[] chars) {
47      // Declare and create an array of 26 int 
48      int[] counts = new int[26];
49
50      // For each lowercase letter in the array, count it 
51      for (int i = 0; i < chars.length; i++)
52        counts[chars[i] - 'a']++;
53
54      return counts;
55    }
56
57    /** Display counts */
58    public static void displayCounts(int[] counts) {
59      for (int i = 0; i < counts.length; i++) {
60        if ((i + 1) % 10 == 0)
61          System.out.println(counts[i] + " " + (char)(i + 'a'));
62        else
63          System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
64      }
65    }
66  } 
return array
pass array
increase count
7.8  Case Study: Counting the Occurrences of Each Letter  289
The createArray method (lines 21–32) generates an array of 100 random lowercase ­letters. 
Line 5 invokes the method and assigns the array to chars. What would be wrong if you 
rewrote the code as follows?
char[] chars = new char[100];
chars = createArray();
You would be creating two arrays. The first line would create an array by using new 
char[100]. The second line would create an array by invoking createArray() and assign 
the reference of the array to chars. The array created in the first line would be garbage because 
it is no ­longer referenced, and as mentioned earlier, Java automatically collects ­garbage behind 
the scenes. Your program would compile and run correctly, but it would create an array 
unnecessarily.
Invoking getRandomLowerCaseLetter() (line 28) returns a random lowercase 
­letter. This method is defined in the RandomCharacter class in Listing 6.10.
The countLetters method (lines 46–55) returns an array of 26 int values, each of 
which stores the number of occurrences of a letter. The method processes each letter in the 
array and increases its count by one. A brute-force approach to count the occurrences of each 
letter might be as follows:
for (int i = 0; i < chars.length; i++)
  if (chars[i] == 'a')
    counts[0]++;
  else if (chars[i] == 'b')
    counts[1]++;
  ...
However, a better solution is given in lines 51 and 52.
for (int i = 0; i < chars.length; i++)
  counts[chars[i] − 'a']++;
If the letter (chars[i]) is a, the corresponding count is counts['a' − 'a'] (i.e., 
counts[0]). If the letter is b, the corresponding count is counts['b' − 'a'] (i.e., 
counts[1]), since the Unicode of b is one more than that of a. If the letter is z, the 
­corresponding count is counts['z' − 'a'] (i.e., counts[25]), since the Unicode of z is 
25 more than that of a.
Figure 7.8 shows the call stack and heap during and after executing createArray. See 
CheckPoint Question 7.8.3 to show the call stack and heap for other methods in the program.
The lowercase letters are:
e y l s r i b k j v j h a b z n w b t v
s c c k r d w a m p w v u n q a m p l o
a z g d e g f i n d x m z o u l o z j v
h w i w n t g x w c d o t x h y v z y z
q e a m f w p g u q t r e n n w f c r f
The occurrences of each letter are:
5 a 3 b 4 c 4 d 4 e 4 f 4 g 3 h 3 i 3 j
2 k 3 l 4 m 6 n 4 o 3 p 3 q 4 r 2 s 4 t
3 u 5 v 8 w 3 x 3 y 6 z
290  Chapter 7    Single-Dimensional Arrays
Figure 7.8  (a) An array of 100 characters is created when executing createArray. 
(b) This array is returned and assigned to the variable chars in the main method.
Array of 100
characters
Stack
(a) Executing
createArray in line 5
(b) After exiting
createArray in line 5
Heap
Activation record for the
createArray method
Activation record for the
main method
Array of 100
characters
Stack
Heap
Activation record for the
main method
char[] chars: ref
char[] chars: ref
char[] chars: ref
	7.8.1	
Show the output of the following two programs:
Point
Check
	7.8.2	 Where are the arrays stored during execution? Show the contents of the stack and 
heap during and after executing displayArray, countLetters, and display­
Counts in Listing 7.4.
7.9  Variable-Length Argument Lists
A variable number of arguments of the same type can be passed to a method and 
treated as an array.
You can pass a variable number of arguments of the same type to a method. The parameter in 
the method is declared as follows:
typeName... parameterName
In the method declaration, you specify the type followed by an ellipsis (...). Only one 
­variable-length parameter may be specified in a method, and this parameter must be the last 
parameter. Any regular parameters must precede it.
Point
Key
public class Test {
public static void main(String[] args) {
int number = 0;
int[] numbers = new int[1];
    m(number, numbers);
    System.out.println("number is " + number
      + " and numbers[0] is " + numbers[0]);
  }
public static void m(int x, int[] y) {
    x = 3;
    y[0] = 3;
  }
}
(a)
public class Test {
public static void main(String[] args) {
int[] list = {1, 2, 3, 4, 5};
    reverse(list);
for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
public static void reverse(int[] list) {
int[] newList = new int[list.length];
for (int i = 0; i < list.length; i++)
      newList[i] = list[list.length − 1 − i];
    list = newList;
  }
}
(b)
7.10  Searching Arrays  291
Java treats a variable-length parameter as an array. You can pass an array or a variable 
number of arguments to a variable-length parameter. When invoking a method with a ­variable 
number of arguments, Java creates an array and passes the arguments to it. Listing 7.5 pres-
ents a method that prints the maximum value in a list of an unspecified number of values.
Listing 7.5 
VarArgsDemo.java
 1  public class VarArgsDemo {
 2    public static void main(String[] args) {
 3      printMax(34, 3, 3, 2, 56.5);
 4      printMax(new double[]{1, 2, 3});
 5    }
 6
 7    public static void printMax(double... numbers) {
 8      if (numbers.length == 0) {
 9        System.out.println("No argument passed");
10        return;
11      }
12
13      double result = numbers[0];
14
15      for (int i = 1; i < numbers.length; i++)
16        if (numbers[i] > result)
17          result = numbers[i];
18
19      System.out.println("The max value is " + result);
20    }
21  } 
Line 3 invokes the printMax method with a variable-length argument list passed to the array 
numbers. If no arguments are passed, the length of the array is 0 (line 8).
Line 4 invokes the printMax method with an array.
	7.9.1	
What is wrong with each of the following method headers?
a.	public static void print(String... strings, double... numbers)
b.	public static void print(double... numbers, String name)
c.	public static double... print(double d1, double d2)
	7.9.2	 Can you invoke the printMax method in Listing 7.5 using the following statements?
a.	printMax(1, 2, 2, 1, 4);
b.	printMax(new double[]{1, 2, 3});
c.	printMax(new int[]{1, 2, 3});
7.10  Searching Arrays
If an array is sorted, binary search is more efficient than linear search for finding an 
element in the array.
Searching is the process of looking for a specific element in an array—for example, ­discovering 
whether a certain score is included in a list of scores. Searching is a common task in computer 
programming. Many algorithms and data structures are devoted to searching. This section 
discusses two commonly used approaches, linear search and binary search. 
7.10.1  The Linear Search Approach
The linear search approach compares the key element key sequentially with each element in 
the array. It continues to do so until the key matches an element in the array, or the array is 
exhausted without a match being found. If a match is made, the linear search returns the index 
pass variable-length arg list
pass an array arg
a variable-length arg 
parameter
Point
Check
Point
Key
linear search
binary search
292  Chapter 7    Single-Dimensional Arrays
of the element in the array that matches the key. If no match is found, the search returns −1. 
The linearSearch method in Listing 7.6 gives the solution.
Listing 7.6 
LinearSearch.java
linear search animation on 
Companion Website
list
key Compare key with list[i] for i = 0, 1, …
[0] [1] [2]  …
1 public class LinearSearch {
2   /** The method for finding a key in the list */
3   public static int linearSearch(int[] list, int key) {
4     for (int i = 0; i < list.length; i++) {
5       if (key == list[i])
6         return i;
7     }  
8     return 21;
9   }
10 }
To better understand this method, trace it with the following statements:
1  int[] list = {1, 4, 4, 2, 5, −3, 6, 2};
2  int i = linearSearch(list, 4);  // Returns 1
3  int j = linearSearch(list, −4); // Returns −1
4  int k = linearSearch(list, −3); // Returns 5 
The linear search method compares the key with each element in the array. The elements 
can be in any order. On average, the algorithm will have to examine half of the elements 
in an array before finding the key, if it exists. Since the execution time of a linear search 
increases linearly as the number of array elements increases, linear search is inefficient for 
a large array.
7.10.2  The Binary Search Approach
Binary search is the other common search approach for a list of values. For binary search to 
work, the elements in the array must already be ordered. Assume that the array is in ascending 
order. The binary search first compares the key with the element in the middle of the array. 
Consider the following three cases:
1.	 If the key is less than the middle element, you need to continue to search for the key 
only in the first half of the array.
2.	 If the key is equal to the middle element, the search ends with a match.
3.	 If the key is greater than the middle element, you need to continue to search for the 
key only in the second half of the array.
Clearly, the binary search method eliminates at least half of the array after each comparison. 
Suppose the array has n elements. For convenience, let n be a power of 2. After the first com-
parison, n/2 elements are left for further search; after the second comparison, (n/2)/2 ele-
ments are left. After the kth comparison, n/2k elements are left for further search. When k = 
log2n, only one element is left in the array, and you need only one more comparison. There-
fore, in the worst case when using the binary search approach, you need log2n+1 ­comparisons 
to find an element in the sorted array. In the worst case for a list of 1024 (210) elements, binary 
search requires only 11 comparisons, whereas a linear search requires 1024 comparisons in 
the worst case.
The portion of the array being searched shrinks by half after each comparison. Let low and 
high denote, respectively, the first index and last index of the array that is currently being 
searched. Initially, low is 0 and high is list.length − 1. Let mid denote the index of the 
middle element, so mid is (low + high)/2. Figure 7.9 shows how to find key 11 in the list 
{2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79} using binary search.
binary search animation on 
Companion Website
7.10  Searching Arrays  293
Figure 7.9  Binary search eliminates half of the list from further consideration after each 
comparison.
key is 11
low
key , 50
key . 7
[0]
[1]
[2]
[3]
[4]
[5]
[7]
[8]
[9] [10] [11]
2
list
4
7
10
11
45
50
59
60
66
69
70
79
mid
[6]
high
[12]
low
[0]
[1]
[2]
[3]
[4]
[5]
2
list
4
7
10
11
45
mid
high
key 55 11
[3]
[4]
[5]
list
10
11
45
low
mid high
You now know how the binary search works. The next task is to implement it in Java. Don’t 
rush to give a complete implementation. Implement it incrementally, one step at a time. You 
may start with the first iteration of the search, as shown in Figure 7.10a. It compares the key 
with the middle element in the list whose low index is 0 and high index is list.length − 
1. If key < list[mid], set the high index to mid − 1; if key == list[mid], a match is 
found and return mid; if key > list[mid], set the low index to mid + 1.
Next, consider implementing the method to perform the search repeatedly by adding a loop, 
as shown in Figure 7.10b. The search ends if the key is found, or if the key is not found when 
low > high.
why not -1?
Figure 7.10  Binary search is implemented incrementally.
(a) Version 1
public static int binarySearch(
int[] list, int key) {
int low = 0;
int high = list.length − 1;
int mid = (low + high) / 2;
if (key < list[mid])
      high = mid − 1;
else if (key == list[mid])
return mid;
else
      low = mid + 1;
}
public static int binarySearch(
int[] list, int key) {
int low = 0;
int high = list.length − 1;
while (high >= low) {
int mid = (low + high) / 2;
if (key < list[mid])
      high = mid - 1;
else if (key == list[mid])
return mid;
else
      low = mid + 1;
}
return -1; // Not found
}
(b) Version 2
When the key is not found, low is the insertion point where a key would be inserted to 
maintain the order of the list. It is more useful to return the insertion point than −1. The method 
must return a negative value to indicate that the key is not in the list. Can it simply return 
−low? No. If the key is less than list[0], low would be 0. −0 is 0. This would indicate the 
key matches list[0]. A good choice is to let the method return −low − 1 if the key is not 
in the list. Returning −low − 1 indicates not only that the key is not in the list, but also where 
the key would be inserted.
294  Chapter 7    Single-Dimensional Arrays
The complete program is given in Listing 7.7.
Listing 7.7 
BinarySearch.java
 1  public class BinarySearch {
 2    /** Use binary search to find the key in the list */
 3    public static int binarySearch(int[] list, int key) {
 4      int low = 0;
 5      int high = list.length − 1;
 6
 7      while (high >= low) {
 8        int mid = (low + high) / 2;
 9        if (key < list[mid])
10          high = mid − 1;
11        else if (key == list[mid])
12          return mid;
13        else
14          low = mid + 1;
15      }
16
17      return –low - 1; // Now high < low, key not found
18    }
19  }
The binary search returns the index of the search key if it is contained in the list (line 12). 
Otherwise, it returns −low − 1 (line 17).
What would happen if we replaced (high >= low) in line 7 with (high > low)? The 
search would miss a possible matching element. Consider a list with just one element. The 
search would miss the element.
Does the method still work if there are duplicate elements in the list? Yes, as long as the 
elements are sorted in increasing order. The method returns the index of one of the matching 
elements if the element is in the list.
The precondition for the binary search method is that the list must be sorted in increasing 
order. The postcondition is that the method returns the index of the element that matches the 
key if the key is in the list or a negative integer k such that −k - 1 is the position for inserting 
the key. Precondition and postcondition are the terms often used to describe the properties of 
a method. Preconditions are the things that are true before the method is invoked, and 
­postconditions are the things that are true after the method is returned: 
To better understand this method, trace it with the following statements and identify low 
and high when the method returns.
int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
int i = BinarySearch.binarySearch(list, 2); // Returns 0
int j = BinarySearch.binarySearch(list, 11); // Returns 4
int k = BinarySearch.binarySearch(list, 12); // Returns –6
int l = BinarySearch.binarySearch(list, 1); // Returns –1
int m = BinarySearch.binarySearch(list, 3); // Returns –2
Here is the table that lists the low and high values when the method exits, and the value 
returned from invoking the method.
Method
Low
High
Value Returned
binarySearch(list, 2)
0
1
0 (mid)
binarySearch(list, 11)
3
5
4 (mid)
binarySearch(list, 12)
5
4
−6
binarySearch(list, 1)
0
−1
−1
binarySearch(list, 3)
1
0
−2
first half
second half
precondition
postcondition
7.11  Sorting Arrays  295
Note
Linear search is useful for finding an element in a small array or an unsorted array, but it 
is inefficient for large arrays. Binary search is more efficient, but it requires that the array 
be presorted.
	7.10.1	 If high is a very large integer such as the maximum int value 2147483647, 
(low + high) / 2 may cause overflow. How do you fix it to avoid overflow?
	7.10.2	
Use Figure 7.9 as an example to show how to apply the binary search approach to a 
search for key 10 and key 12 in list {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79}.
	7.10.3	 If the binary search method returns −4, is the key in the list? Where should the key 
be inserted if you wish to insert the key into the list?
7.11  Sorting Arrays
Sorting, like searching, is a common task in computer programming. Many different 
algorithms have been developed for sorting. This section introduces an intuitive sort-
ing algorithm: selection sort.
Suppose you want to sort a list in ascending order. Selection sort finds the smallest number in 
the list and swaps it with the first element. It then finds the smallest number remaining and 
swaps it with the second element, and so on, until only a single number remains. Figure 7.11 
shows how to sort the list {2, 9, 5, 4, 8, 1, 6} using selection sort. 
binary search benefits
Point
Check
Point
Key
VideoNote
Selection sort
selection sort animation on 
Companion Website
Figure 7.11  Selection sort repeatedly selects the smallest number and swaps it with the first number in the list.
Select 1 (the smallest) and swap it
with 2 (the first) in the list.
The number 1 is now in the
correct position, and thus no
longer needs to be considered.
The number 2 is now in the
correct position, and thus no
longer needs to be considered. 
The number 4 is now in the
correct position, and thus no
longer needs to be considered.
The number 5 is now in the
correct position, and thus no
longer needs to be considered.
The number 6 is now in the
correct position, and thus no
longer needs to be considered.
2
1
1
1
1
1
1
9
9
2
2
2
2
2
5
swap
5
5
4
4
4
4
4
4
4
5
5
5
5
8
8
8
8
8
6
6
1
2
9
9
9
9
8
6
6
6
6
6
8
9
The number 8 is now in the
correct position, and thus no
longer needs to be considered.
Select 2 (the smallest) and swap it
with 9 (the first) in the remaining
with 5 (the first) in the remaining
with 8 (the first) in the remaining
with 9 (the first) in the remaining
list.
Select 4 (the smallest) and swap it
list.
5 is the smallest and in the right
position. No swap is necessary.
Select 6 (the smallest) and swap it
list.
Select 8 (the smallest) and swap it
list.
Since there is only one element
remaining in the list, the sort is
completed.
swap
swap
swap
swap
You know how the selection-sort approach works. The task now is to implement it in Java. 
Beginners find it difficult to develop a complete solution on the first attempt. Start by writing 
the code for the first iteration to find the smallest element in the list and swap it with the first 
element, then observe what would be different for the second iteration, the third, and so on. 
The insight this gives will enable you to write a loop that generalizes all the iterations.
296  Chapter 7    Single-Dimensional Arrays
The solution can be described as follows:
for (int i = 0; i < list.length − 1; i++) {
  select the smallest element in list[i..list.length−1];
  swap the smallest with list[i], if necessary;
  // list[i] is in its correct position.
  // The next iteration applies on list[i+1..list.length−1]
}
Listing 7.8 implements the solution.
Listing 7.8 
SelectionSort.java
 1  public class SelectionSort {
 2    /** The method for sorting the numbers */
 3    public static void selectionSort(double[] list) {
 4      for (int i = 0; i < list.length - 1; i++) {
 5        // Find the minimum in the list[i..list.length−1]
 6        double currentMin = list[i];
 7        int currentMinIndex = i;
 8
 9        for (int j = i + 1; j < list.length; j++) {
10          if (currentMin > list[j]) {
11            currentMin = list[j];
12            currentMinIndex = j;
13          }
14        }
15
16        // Swap list[i] with list[currentMinIndex] if necessary
17        if (currentMinIndex != i) {
18          list[currentMinIndex] = list[i];
19          list[i] = currentMin;
20        }
21      }
22    }
23  }  
The selectionSort(double[] list) method sorts any array of double elements. The 
method is implemented with a nested for loop. The outer loop (with the loop control variable i 
in line 4) is iterated in order to find the smallest element in the list, which ranges from list[i] 
to list[list.length−1], and exchanges it with list[i].
The variable i is initially 0. After each iteration of the outer loop, list[i] is in the right 
place. Eventually, all the elements are put in the right place; therefore, the whole list is sorted.
To understand this method better, trace it with the following statements:
double[] list = {1, 9, 4.5, 6.6, 5.7, −4.5};
SelectionSort.selectionSort(list);
	7.11.1	
Use Figure 7.11 as an example to show how to apply the selection-sort approach to 
sort {3.4, 5, 3, 3.5, 2.2, 1.9, 2}.
	7.11.2	 How do you modify the selectionSort method in Listing 7.8 to sort numbers in 
decreasing order?
7.12  The Arrays Class
The java.util.Arrays class contains useful methods for common array operations 
such as sorting and searching.
select
swap
Point
Check
Point
Key
The java.util.Arrays class contains various static methods for sorting and searching 
arrays, comparing arrays, filling array elements, and returning a string representation of the 
array. These methods are overloaded for all primitive types.
You can use the sort or parallelSort method to sort a whole array or a partial array. 
For example, the following code sorts an array of numbers and an array of characters:
double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
java.util.Arrays.sort(numbers); // Sort the whole array
java.util.Arrays.parallelSort(numbers); // Sort the whole array
char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
java.util.Arrays.sort(chars, 1, 3); // Sort part of the array
java.util.Arrays.parallelSort(chars, 1, 3); // Sort part of the array
Invoking sort(numbers) sorts the whole array numbers. Invoking sort(chars, 1, 3) 
sorts a partial array from chars[1] to chars[3−1]. parallelSort is more efficient if your 
computer has multiple processors. 
You can use the binarySearch method to search for a key in an array. The array must be pre-
sorted in increasing order. If the key is not in the array, the method returns −(insertionIndex 
 + 1). For example, the following code searches the keys in an array of integers and an array 
of characters:
int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
System.out.println("1. Index is " +
  java.util.Arrays.binarySearch(list, 11));
System.out.println("2. Index is " +
  java.util.Arrays.binarySearch(list, 12));
char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
System.out.println("3. Index is " +
  java.util.Arrays.binarySearch(chars, 'a'));
System.out.println("4. Index is " +
  java.util.Arrays.binarySearch(chars, 't'));
The output of the preceding code is as follows:
Index is 4
Index is –6
Index is 0
Index is –4
You can use the equals method to check whether two arrays are strictly equal. Two arrays 
are strictly equal if their corresponding elements are the same. In the following code, list1 
and list2 are equal, but list2 and list3 are not.
int[] list1 = {2, 4, 7, 10};
int[] list2 = {2, 4, 7, 10};
int[] list3 = {4, 2, 7, 10};
System.out.println(java.util.Arrays.equals(list1, list2)); // true 
System.out.println(java.util.Arrays.equals(list2, list3)); // false
You can use the fill method to fill in all or part of the array. For example, the following code 
fills list1 with 5 and fills 8 into elements list2[1] through list2[5−1].
int[] list1 = {2, 4, 7, 10};
int[] list2 = {2, 4, 7, 7, 7, 10};
java.util.Arrays.fill(list1, 5); // Fill 5 to the whole array
java.util.Arrays.fill(list2, 1, 5, 8); // Fill 8 to a partial array 
sort
parallelSort
binarySearch
equals
fill
toString
7.12  The Arrays Class  297
298  Chapter 7    Single-Dimensional Arrays
You can also use the toString method to return a string that represents all elements in the array. 
This is a quick and simple way to display all elements in the array. For example, the following code:
int[] list = {2, 4, 7, 10};
System.out.println(java.util.Arrays.toString(list));
displays [2, 4, 7, 10].
	7.12.1	 What types of array can be sorted using the java.util.Arrays.sort method? 
Does this sort method create a new array?
	7.12.2	 To apply java.util.Arrays.binarySearch(array, key), should the array 
be sorted in increasing order, in decreasing order, or neither?
	7.12.3	 Show the output of the following code:
int[] list1 = {2, 4, 7, 10};
java.util.Arrays.fill(list1, 7);
System.out.println(java.util.Arrays.toString(list1));
int[] list2 = {2, 4, 7, 10};
System.out.println(java.util.Arrays.toString(list2));
System.out.print(java.util.Arrays.equals(list1, list2));
7.13  Command-Line Arguments
The main method can receive string arguments from the command line.
Perhaps you have already noticed the unusual header for the main method, which has the 
parameter args of the String[] type. It is clear that args is an array of strings. The main 
method is just like a regular method with a parameter. You can call a regular method by passing 
actual parameters. Can you pass arguments to main? Yes, of course you can. In the following 
examples, the main method in class TestMain is invoked by a method in A:
Point
Check
Point
Key
public class A {
  public static void main(String[] args) {
    String[] strings = {"New York",
      "Boston", "Atlanta"};
    TestMain.main(strings); 
  }
}
public class TestMain {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++)
      System.out.println(args[i]);
  }
}
A main method is just like a regular method. Furthermore, you can pass arguments to a 
main method from the command line.
7.13.1  Passing Strings to the main Method
You can pass strings to a main method from the command line when you run the program. 
The following command line, for example, starts the program TestMain with three strings: 
arg0, arg1, and arg2:
java TestMain arg0 arg1 arg2
arg0, arg1, and arg2 are strings, but they don’t have to appear in double quotes on the com-
mand line. The strings are separated by a space. A string that contains a space must be enclosed 
in double quotes. Consider the following command line:
java TestMain "First num" alpha 53
It starts the program with three strings: First num, alpha, and 53. Since First num is a 
string, it is enclosed in double quotes. Note 53 is actually treated as a string. You can use "53" 
instead of 53 in the command line.
7.13  Command-Line Arguments  299
When the main method is invoked, the Java interpreter creates an array to hold 
the ­command-line arguments and pass the array reference to args. For example, if you invoke 
a program with n arguments, the Java interpreter creates an array such as the one that follows:
args = new String[n];
The Java interpreter then passes args to invoke the main method.
Note
If you run the program with no strings passed, the array is created with new 
String[0]. In this case, the array is empty with length 0. args references to this 
empty array. Therefore, args is not null, but args.length is 0.
7.13.2  Case Study: Calculator
Suppose you are to develop a program that performs arithmetic operations on integers. The 
program receives an expression. The expression consists of an integer followed by an operator 
and another integer. For example, to add two integers, use this command:
java Calculator 2 + 3
The program will display the following output:
2 + 3 = 5
Figure 7.12 shows sample runs of the program.
The strings passed to the main program are stored in args, which is an array of strings. The 
first string is stored in args[0], and args.length is the number of strings passed.
Here are the steps in the program:
1.	 Use args.length to determine whether the expression has been provided as three 
arguments in the command line. If not, terminate the program using System.exit(1).
2.	 Perform a binary arithmetic operation on the operands args[0] and args[2] using the 
operator in args[1].
VideoNote
Command-line arguments
Figure 7.12  The program takes three arguments (operand1 operator operand2) from 
the command line and displays the expression and the result of the arithmetic operation.
Add
Subtract
Multiply
Divide
300  Chapter 7    Single-Dimensional Arrays
The program is given in Listing 7.9.
Listing 7.9 
Calculator.java
 1  public class Calculator {
 2    /** Main method */
 3    public static void main(String[] args) {
 4      // Check number of strings passed 
 5      if (args.length != 3) {
 6        System.out.println(
 7          "Usage: java Calculator operand1 operator operand2");
 8        System.exit(1);
 9      }
10
11      // The result of the operation 
12      int result = 0;
13
14      // Determine the operator 
15      switch (args[1].charAt(0)) {
16        case '+': result = Integer.parseInt(args[0]) +
17                           Integer.parseInt(args[2]);
18                  break;
19        case '−': result = Integer.parseInt(args[0]) −
20                           Integer.parseInt(args[2]);
21                  break;
22        case '.': result = Integer.parseInt(args[0]) *
23                           Integer.parseInt(args[2]);
24                  break;
25        case '/': result = Integer.parseInt(args[0]) /
26                           Integer.parseInt(args[2]);
27      }
28
29      // Display result 
30      System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
31        + " = " + result);
32    }
33  }
Integer.parseInt(args[0]) (line 16) converts a digital string into an integer. The string 
must consist of digits. If not, the program will terminate abnormally.
We used the . symbol for multiplication, not the common * symbol. The reason for this is 
the * symbol refers to all the files in the current directory when it is used on a command line. 
The following program displays all the files in the current directory when issuing the command 
java Test *:
public class Test {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++)
       System.out.println(args[i]);
  }
}
To circumvent this problem, we will have to use a different symbol for the multiplication operator.
	7.13.1	 This book declares the main method as
public static void main(String[] args)
Can it be replaced by one of the following lines?
a.	public static void main(String args[])
b.	public static void main(String[] x)
check argument
check operator
Point
Check
Chapter Summary  301
c.	public static void main(String x[])
d.	static void main(String x[])
	7.13.2	 Show the output of the following program when invoked using
1.	 java Test I have a dream
2.	 java Test “1 2 3”
3.	 java Test
public class Test {
  public static void main(String[] args) {
    System.out.println("Number of strings is " + args.length);
    for (int i = 0; i < args.length; i++)
      System.out.println(args[i]);
  }
}
Key Terms
anonymous array 284
array 272
array initializer 274
binary search 291
garbage collection 282
index 272
indexed variable 274
linear search 291
off-by-one error 277
postcondition 294
precondition 294
selection sort 295
Chapter Summary
1.	 A variable is declared as an array type using the syntax elementType[] arrayRefVar 
or elementType arrayRefVar[]. The style elementType[] arrayRefVar is 
preferred, although elementType arrayRefVar[] is legal.
2.	 Unlike declarations for primitive data type variables, the declaration of an array variable 
does not allocate any space in memory for the array. An array variable is not a primitive 
data type variable. An array variable contains a reference to an array.
3.	 You cannot assign elements to an array unless it has already been created. You 
can create an array by using the new operator with the following syntax: new 
elementType[arraySize].
4.	 Each element in the array is represented using the syntax arrayRefVar[index]. An 
index must be an integer or an integer expression.
5.	 After an array is created, its size becomes permanent and can be obtained using 
arrayRefVar.length. Since the index of an array always begins with 0, the last 
index is always arrayRefVar.length − 1. An out-of-bounds error will occur if you 
attempt to reference elements beyond the bounds of an array.
6.	 Programmers often mistakenly reference the first element in an array with index 1, but 
it should be 0. This is called the index off-by-one error.
302  Chapter 7    Single-Dimensional Arrays
7.	 When an array is created, its elements are assigned the default value of 0 for the numeric 
primitive data types, \u0000 for char types, and false for boolean types.
8.	 Java has a shorthand notation, known as the array initializer, which combines declaring 
an array, creating an array, and initializing an array in one statement, using the syntax 
elementType[] arrayRefVar = {value0, value1, . . . , valuek}.
9.	 When you pass an array argument to a method, you are actually passing the reference of 
the array; that is, the called method can modify the elements in the caller’s original array.
10.	 If an array is sorted, binary search is more efficient than linear search for finding an 
element in the array.
11.	 Selection sort finds the smallest number in the list and swaps it with the first element. 
It then finds the smallest number remaining and swaps it with the first element in the 
remaining list, and so on, until only a single number remains.
Quiz
Answer the quiz for this chapter online at the Companion Website.
Programming Exercises 
Sections 7.2–7.5
	
*7.1	
(Assign grades) Write a program that reads student scores, gets the best score, and 
then assigns grades based on the following scheme:
Grade is A if score is Ú  best -5;
Grade is B if score is Ú  best -10;
Grade is C if score is Ú  best -15;
Grade is D if score is Ú  best -20;
Grade is F otherwise.
	
	
The program prompts the user to enter the total number of students, and then 
prompts the user to enter all of the scores, and concludes by displaying the grades. 
Here is a sample run:
Enter the number of students: 4 
  
Enter 4 scores: 40 55 70 58 
  
Student 0 score is 40 and grade is F
Student 1 score is 55 and grade is C
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is C
	
7.2	
(Reverse the numbers entered) Write a program that reads 10 integers then dis-
plays them in the reverse of the order in which they were read.
Programming Exercises  303
	 **7.3	
(Count occurrence of numbers) Write a program that reads the integers between 1 
and 50 and counts the occurrences of each. Assume the input ends with 0. Here is 
a sample run of the program.
Enter the integers between 1 and 50: 2 5 6 5 4 3 23 43 2 0 
  
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
Note if a number occurs more than one time, the plural word “times” is used in the output.
	
7.4	
(Analyze scores) Write a program that reads an unspecified number of scores and 
determines how many scores are above or equal to the average, and how many 
scores are below the average. Enter a negative number to signify the end of the 
input. Assume the maximum number of scores is 100.
	
**7.5	
(The number of even numbers and odd numbers) Write a program that reads ten inte-
gers, and then display the number of even numbers and odd numbers. Assume that 
the input ends with 0. Here is the sample run of the program:
Enter numbers: 1 2 3 2 1 6 3 4 5 2 3 6 8 9 9 0 
  
The number of odd numbers: 8
The number of even numbers: 7
	
*7.6	
(Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a num-
ber n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor 
is found, n is not prime. A more efficient approach is to check whether any of the 
prime numbers less than or equal to 2n can divide n evenly. If not, n is prime. 
Rewrite Listing 5.15 to display the first 50 prime numbers using this approach. 
You need to use an array to store the prime numbers, and later use them to check 
whether they are possible divisors for n. 
	
*7.7	
(Count single digits) Write a program that generates 200 random integers between 
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers, 
say counts, to store the counts, for the number of 0s, 1s, . . . , 9s.)
Sections 7.6–7.8
	
7.8	
(Average an array) Write two overloaded methods that return the average of an 
array with the following headers:
public static double average(int[] array)
public static double average(double[] array)
	
	
Write a test program that prompts the user to enter 10 integers, invokes the first 
method, then displays the average value; prompts the user to enter 10 double 
values, invokes the second method, then displays the average value.
304  Chapter 7    Single-Dimensional Arrays
	
7.9	
(Find the largest element) Write a method that finds the largest element in an array 
of double values using the following header:
public static double max(double[] array)
	
	
Write a test program that prompts the user to enter ten numbers, invokes this 
method to return the maximum value, and displays the maximum value. Here is 
a sample run of the program:
Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2 
  
The minimum number is: 6
	
7.10	
(Find the index of the largest element) Write a method that returns the index of the 
largest element in an array of integers. If there is more than one element, return 
the largest index. Use the following header:
public static int indexOfLargestElement(double[] array)
	
	
Write a test program that prompts the user to enter 10 numbers, invokes this 
method to return the index of the largest element, and displays the index and the 
element itself.
	 *7.11	
(Statistics: compute deviation) Programming Exercise 5.45 computes the standard 
deviation of numbers. This exercise uses a different but equivalent formula to 
compute the standard deviation of n numbers.
mean =
a
n
i=1
xi
n
= x1 + x2 + g + xn
n
 deviation = H
a
n
i=1
(xi - mean)2
n - 1
	
	
To compute the standard deviation with this formula, you have to store the indi-
vidual numbers using an array, so they can be used after the mean is obtained.
	
	
Your program should contain the following methods:
/** Compute the deviation of double values */ 
public static double deviation(double[] x)
/** Compute the mean of an array of double values */
public static double mean(double[] x)
	
	
Write a test program that prompts the user to enter 10 numbers and displays the 
mean and standard deviation, as presented in the following sample run:
Enter 10 numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2 
  
The mean is 3.11
The standard deviation is 1.55738
	 *7.12	
(Reverse an array) The reverse method in Section 7.7 reverses an array by 
­copying it to a new array. Rewrite the method that reverses the array passed in 
the argument and returns this array. Write a test program that prompts the user to 
enter 10 numbers, invokes the method to reverse the numbers, and displays the 
numbers.
Programming Exercises  305
Section 7.9
	 *7.13	
(Random number selector) Write a method that returns a random number from a 
list of numbers passed in the argument. The method header is specified as follows: 
public static int getRandom(int... numbers)
	
7.14	
(Computing lcm) Write a method that returns the lcm (least common multiple) of 
an unspecified number of integers. The method header is specified as follows:
public static int lcm(int... numbers)
	
	
Write a test program that prompts the user to enter five numbers, invokes the 
method to find the lcm of these numbers, and displays the lcm. 
Sections 7.10–7.12
	
7.15	
(Eliminate duplicates) Write a method that returns a new array by eliminating the 
duplicate values in the array using the following method header:
public static int[] eliminateDuplicates(int[] list)
	
	
Write a test program that reads in 10 integers, invokes the method, and displays 
the distinct numbers separated by exactly one space. Here is a sample run of the 
program:
Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2 
  
The distinct numbers are: 1 2 3 6 4 5
	
7.16	
(Execution time) Write a program that creates an array of numbers from 1 to 
100,000,000 in ascending order. Display the execution time of invoking the 
­linear Search method and the binary Search method in Listings 7.6 and 
7.7 respectively. Display the execution time of invoking both searches for the 
following numbers: 1; 25,000,000; 50,000,000; 75,000,000; 100,000,000. You 
can use the following code template to obtain the execution time:
long startTime = System.nanoTime();
perform the task;
long endTime = System.NanoTime();
long executionTime = endTime − startTime;
	 **7.17	
(Sort students) Write a program that prompts the user to enter the number of stu-
dents, the students’ names, and their scores and prints student names in decreasing 
order of their scores. Assume the name is a string without spaces, use the Scan­
ner’s next() method to read a name.
	 **7.18	
(Bubble sort) Write a sort method that uses the bubble-sort algorithm. The 
­bubble-sort algorithm makes several passes through the array. On each pass, suc-
cessive neighboring pairs are compared. If a pair is not in order, its values are 
swapped; otherwise, the values remain unchanged. The technique is called a bub-
ble sort or sinking sort because the smaller values gradually “bubble” their way to 
the top, and the larger values “sink” to the bottom. Write a test program that reads 
in 10 double numbers, invokes the method, and displays the sorted numbers.
306  Chapter 7    Single-Dimensional Arrays
	 **7.19	
(Sorted?) Write the following method that returns true if the list is already sorted 
in decreasing order:
public static boolean isSorted(int[] list)
	
	
Write a test program that prompts the user to enter a list and displays whether the 
list is sorted or not. Here is a sample run. Note that the first number in the input 
indicates the number of the elements in the list. This number is not part of the list.
Enter list: 8 10 1 5 16 61 9 11 1 
 
The list is not sorted
Enter list: 10 21 11 9 7 5 4 4 3 1 1 
 
The list is already sorted
	 *7.20	
(Descending Bubble Sort) Modify the bubble sort method of Programming Exer-
cise 7.18, and sort the elements in the array in descending order instead of ascend-
ing order. Write a test program that reads 10 double numbers, invokes the method, 
and displays the sorted numbers in descending order.
Section 7.13
	 *7.21	
(Normalizing integers) Write a program that prompts the user to enter 10 integers, 
and normalizes the integers to be in the range of 0 to 1 by dividing every integer 
with the largest integer. Display the 10 normalized real-valued numbers.
	
*7.22	
(Count the number of vowels in a string) Write a program that prompts the user to enter 
a string, and counts and displays the number of both lowercase and uppercase vowels 
in the string.
Comprehensive
	 **7.23	
(Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are 
closed on the first day of school. As the students enter, the first student, denoted 
as S1, opens every locker. Then the second student, S2, begins with the second 
locker, denoted as L2, and closes every other locker. Student S3 begins with the 
third locker and changes every third locker (closes it if it was open and opens it if 
it was closed). Student S4 begins with locker L4 and changes every fourth locker. 
Student S5 starts with L5 and changes every fifth locker, and so on, until student 
S100 changes L100.
	
	
After all the students have passed through the building and changed the lockers, 
which lockers are open? Write a program to find your answer and display all open 
locker numbers separated by exactly one space.
	
	
(Hint: Use an array of 100 Boolean elements, each of which indicates whether a 
locker is open (true) or closed (false). Initially, all lockers are closed.)
	 **7.24	
(Simulation: coupon collector’s problem) Coupon collector is a classic ­statistics 
problem with many practical applications. The problem is to repeatedly pick 
objects from a set of objects and find out how many picks are needed for all the 
objects to be picked at least once. A variation of the problem is to pick cards from 
a shuffled deck of 52 cards repeatedly, and find out how many picks are needed 
before you see one of each suit. Assume a picked card is placed back in the deck 
VideoNote
Coupon collector's problem
Programming Exercises  307
before picking another. Write a program to simulate the number of picks needed 
to get four cards from each suit and display the four cards picked (it is possible a 
card may be picked twice). Here is a sample run of the program:
Queen of Spades
5 of Clubs
Queen of Hearts
4 of Diamonds
Number of picks: 12
	
7.25	
(Algebra: solve quadratic equations) Write a method for solving a quadratic equa-
tion using the following header:
public static int solveQuadratic(double[] eqn, double[] roots)
	
	
The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the array 
eqn and the real roots are stored in roots. The method returns the number of real 
roots. See Programming Exercise 3.1 on how to solve a quadratic equation.
	
	
Write a program that prompts the user to enter values for a, b, and c and displays 
the number of real roots and all real roots.
	
7.26	
(Check whether array is sorted) An array list is required to be sorted in ascend-
ing order. Write a method that returns true if list is sorted, using the following 
header:
public static boolean isSorted(int[] list)
	
	
Write a test program that prompts the user to enter a list of integers. Note the first 
number in the input indicates the number of elements in the list. This number is not 
part of the list.
Enter list: 5 2 5 6 9 10 
  
The list is sorted
Enter list: 5 2 5 6 1 6 
 
The list is not sorted
	
7.27	
(Check whether the array is sorted with constant interval) An array list is sorted 
with a constant interval if its elements are arranged in an ascending order and there 
is a constant difference between adjacent elements. Write a method that returns 
true if list is sorted with a constant interval, using the following header:
public static boolean isSortedConstantInterval(int[] list)
	
	
Write a test program that prompts the user to enter a list of integers. Note the first 
number in the input indicates the number of elements in the list. This number is 
not part of the list.
308  Chapter 7    Single-Dimensional Arrays
	 **7.28	
(Math: permutations) Write a program that prompts the user to enter four integers 
and then displays all possible ways of arranging the four integers.
	 **7.29	
(Game: dice) Suppose three dice are thrown at random. Write a program that 
shows all possible permutations or configurations of the three dice that yield the 
sum of nine.
	 *7.30	
(Pattern recognition: consecutive four equal numbers) Write the following method 
that tests whether the array has four consecutive numbers with the same value:
public static boolean isConsecutiveFour(int[] values)
	
	
Write a test program that prompts the user to enter a series of integers and dis-
plays it if the series contains four consecutive numbers with the same value. Your 
program should first prompt the user to enter the input size—i.e., the number of 
values in the series. Here are sample runs:
VideoNote
Consecutive four
Enter list: 5 2 5 6 9 10 
 
The list is not sorted with a constant interval
Enter list: 5 2 4 6 8 10 
 
The list is sorted with a constant interval
Enter the number of values: 8 
  
Enter the values: 3 4 5 5 5 5 4 5 
  
The list has consecutive fours
Enter the number of values: 9 
  
Enter the values: 3 4 5 5 6 5 5 4 5 
  
The list has no consecutive fours
	 **7.31	
(Merge two sorted lists) Write the following method that merges two sorted lists 
into a new sorted list:
public static int[] merge(int[] list1, int[] list2)
	
	
Implement the method in a way that takes at most list1.length + list2.
length comparisons. See liveexample.pearsoncmg.com/dsanimation/­
MergeSortNeweBook.html for an animation of the implementation. Write a test 
program that prompts the user to enter two sorted lists and displays the merged 
list. Here is a sample run. Note the first number in the input indicates the number 
of the elements in the list. This number is not part of the list.
Enter list1 size and contents: 5 1 5 16 61 111 
  
Enter list2 size and contents: 4 2 4 5 6 
  
list1 is 1 5 16 61 111
list2 is 2 4 5 6
The merged list is 1 2 4 5 5 6 16 61 111
Programming Exercises  309
	 **7.32	
(Partition of a list) Write the following method that partitions the list using the 
first element, called a pivot:
public static int partition(int[] list)
	
	
After the partition, the elements in the list are rearranged so all the elements before 
the pivot are less than or equal to the pivot, and the elements after the pivot are 
greater than the pivot. The method returns the index where the pivot is located in 
the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition, 
the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at 
most list.length comparisons. See liveexample.pearsoncmg.com/dsanima-
tion/QuickSortNeweBook.html for an animation of the implementation. Write a 
test program that prompts the user to enter the size of the list and the contents of 
the list and displays the list after the partition. Here is a sample run. 
Enter list size: 8 
  
Enter list content: 10 1 5 16 61 9 11 1 
   
After the partition, the list is 9 1 5 1 10 61 11 16
	 *7.33	 (Month name) Write a program that prompts the user to enter an integer between 1 and 
12 and then displays the name of the month that corresponds to the integer entered by 
the user. For example, if the user enters three, the program should display March. 
	 **7.34	
(Sort characters in a string) Write a method that returns a sorted string using the 
following header:
public static String sort(String s)
For example, sort("acb") returns abc.
	
	
Write a test program that prompts the user to enter a string and displays the sorted 
string.
***7.35	 (Game: hangman) Write a hangman game that randomly generates a word and 
prompts the user to guess one letter at a time, as presented in the sample run. 
Each letter in the word is displayed as an asterisk. When the user makes a correct 
guess, the actual letter is then displayed. When the user finishes a word, display 
the number of misses and ask the user whether to continue to play with another 
word. Declare an array to store words, as follows:
// Add any words you wish in this array
String[] words = {"write", "that",...};
(Guess) Enter a letter in word ******* > p 
 
(Guess) Enter a letter in word p****** > r 
 
(Guess) Enter a letter in word pr**r** > p 
 
     p is already in the word
(Guess) Enter a letter in word pr**r** > o 
 
(Guess) Enter a letter in word pro*r** > g 
 
(Guess) Enter a letter in word progr** > n 
 
     n is not in the word
(Guess) Enter a letter in word progr** > m 
 
(Guess) Enter a letter in word progr*m > a 
 
The word is program. You missed 1 time
Do you want to guess another word? Enter y or n>
310  Chapter 7    Single-Dimensional Arrays
***7.36		
(Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens on a 
chessboard such that no two queens can attack each other (i.e., no two queens are on 
the same row, same column, or same diagonal). There are many possible solutions. 
Write a program that displays one such solution. A sample output is shown below:
	
	
Balls are dropped from the opening of the board. Every time a ball hits a nail, it 
has a 50% chance of falling to the left or to the right. The piles of balls are accu-
mulated in the slots at the bottom of the board.
	
	
Write a program that simulates the bean machine. Your program should prompt the 
user to enter the number of the balls and the number of the slots in the machine. 
Simulate the falling of each ball by printing its path. For example, the path for 
the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is 
RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here 
is a sample run of the program:
	
	
(Hint: Create an array named slots. Each element in slots stores the number of 
balls in a slot. Each ball falls into a slot via a path. The number of Rs in a path is the 
position of the slot where the ball falls. For example, for the path LRLRLRR, the ball 
falls into slots[4], and for the path RRLLLLL, the ball falls into slots[2].)
***	7.37	 (Game: bean machine) The bean machine, also known as a quincunx or the Gal-
ton box, is a device for statistics experiments named after English scientist Sir 
Francis Galton. It consists of an upright board with evenly spaced nails (or pegs) 
in a triangular form, as shown in Figure 7.13.
(a)
(b)
(c)
|Q| | | | | | | |
| | | | |Q| | | |
| | | | | | | |Q|
| | | | | |Q| | |
| | |Q| | | | | |
| | | | | | |Q| |
| |Q| | | | | | |
| | | |Q| | | | |
Enter the number of balls to drop: 5 
 
Enter the number of slots in the bean machine: 8 
 
LRLRLRR
RRLLLRR
LLRLLRR
RRLLLLL
LRLRRLR
    O
    O
  OOO 
