### Unicode System in Java

| **Concept**                             | **Description**                                              |
| --------------------------------------- | ------------------------------------------------------------ |
| **Unicode**                             | An international character set that encompasses a vast range of characters, symbols, and scripts from many languages across the globe. |
| **Support in Java**                     | Java has built-in support for Unicode characters, allowing applications to work seamlessly with diverse languages and scripts. |
| **Pre-Unicode Standards**               | Before Unicode, there were multiple standards like ASCII (for the United States), ISO 8859-1 (Western European languages), KOI-8 (Russian), GB18030 and BIG-5 (Chinese). |
| **Unicode Representation**              | Each character in the Unicode system is represented by 2 bytes. |
| **Range**                               | The lowest value is represented by `\u0000` and the highest value is represented by `\uFFFF`. |
| **Approaches to Using Unicode**         | - **Unicode Escape Sequences**: Uses escape sequences starting with '\\u' followed by four hexadecimal digits. Useful when characters cannot be directly typed. |
|                                         | - **Direct Storing**: Directly stores Unicode characters in variables. Convenient when characters can be directly typed or displayed. |
| **Example of Unicode Escape Sequences** | ```char unicodeChar = '\\u0041'; // Represents 'A'```        |
| **Example of Direct Storing**           | ```char unicodeChar = 'A'; // Directly stores the character 'A'``` |
| **Manipulating Unicode Characters**     | Demonstrates how to manipulate stored Unicode characters, such as calculating the difference between 'A' and 'a'. |
