### Java Loop Control

| **Loop Type**         | **Description**                                              | **Syntax/Example**                                           |
| --------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| **while loop**        | Repeats a statement or group of statements while a given condition is true. | **Syntax:**<br>`while(condition) {`<br>`   // code to be executed`<br>`}`<br>**Example:**<br>`int i = 0;`<br>`while(i < 5) {`<br>`   System.out.println(i);`<br>`   i++;`<br>`}` |
| **for loop**          | Executes a sequence of statements multiple times and abbreviates the code that manages the loop variable. | **Syntax:**<br>`for(initialization; condition; increment/decrement) {`<br>`   // code to be executed`<br>`}`<br>**Example:**<br>`for(int i = 0; i < 5; i++) {`<br>`   System.out.println(i);`<br>`}` |
| **do...while loop**   | Like a while statement, except that it tests the condition at the end of the loop body. | **Syntax:**<br>`do {`<br>`   // code to be executed`<br>`} while(condition);`<br>**Example:**<br>`int i = 0;`<br>`do {`<br>`   System.out.println(i);`<br>`   i++;`<br>`} while(i < 5);` |
| **Enhanced for loop** | Introduced in Java 5, mainly used to traverse collections of elements including arrays. | **Syntax:**<br>`for(data_type variable : array) {`<br>`   // code to be executed`<br>`}`<br>**Example:**<br>`int[] numbers = {1, 2, 3, 4, 5};`<br>`for(int num : numbers) {`<br>`   System.out.println(num);`<br>`}` |

### Loop Control Statements

| **Control Statement**  | **Description**                                              | **Example**                                                  |
| ---------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| **break statement**    | Terminates the loop or switch statement and transfers execution to the statement immediately following the loop or switch. | **Example:**<br>`for(int i = 0; i < 10; i++) {`<br>`   if(i == 5) break;`<br>`   System.out.println(i);`<br>`}` |
| **continue statement** | Causes the loop to skip the remainder of its body and immediately retest its condition prior to reiterating. | **Example:**<br>`for(int i = 0; i < 10; i++) {`<br>`   if(i % 2 == 0) continue;`<br>`   System.out.println(i);`<br>`}` |

