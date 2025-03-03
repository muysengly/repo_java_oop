### Primitive Data Types
| **Data Type** | **Description**                                    | **Size** | **Default Value** | **Range**                                                    |
| ------------- | -------------------------------------------------- | -------- | ----------------- | ------------------------------------------------------------ |
| `byte`        | 8-bit signed two's complement integer.             | 1 byte   | 0                 | -128 to 127                                                  |
| `short`       | 16-bit signed two's complement integer.            | 2 bytes  | 0                 | -32,768 to 32,767                                            |
| `int`         | 32-bit signed two's complement integer.            | 4 bytes  | 0                 | -2^31^ to 2^31^-1                                            |
| `long`        | 64-bit signed two's complement integer.            | 8 bytes  | 0L                | -2^63^ to 2^63^-1                                            |
| `float`       | Single-precision 32-bit IEEE 754 floating point.   | 4 bytes  | 0.0f              | Approximately ±3.40282347E+38F (6-7 significant decimal digits) |
| `double`      | Double-precision 64-bit IEEE 754 floating point.   | 8 bytes  | 0.0d              | Approximately ±1.79769313486231570E+308 (15 significant decimal digits) |
| `boolean`     | Represents one bit of information (true or false). | 1 bit    | false             | true or false                                                |
| `char`        | Single 16-bit Unicode character.                   | 2 bytes  | '\u0000'          | '\u0000' (0) to '\uFFFF' (65,535)                            |

### Reference/Object Data Types
| **Data Type** | **Description**                                              | **Default Value** |
| ------------- | ------------------------------------------------------------ | ----------------- |
| `String`      | Represents sequences of characters.                          | null              |
| `Array`       | Containers that hold a fixed number of values of a single type. | null              |
| `Class`       | User-defined data types that contain variables and methods.  | null              |
| `Interface`   | Abstract types used to specify a set of methods that implementing classes must provide. | null              |
