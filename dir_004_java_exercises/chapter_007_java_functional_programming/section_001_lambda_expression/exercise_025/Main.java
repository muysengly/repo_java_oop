import java.util.function.Function; // នាំចូល Function interface ពី java.util.function package

public class Main {
    public static void main(String[] args) {

        int n = 33; // បង្កើតអថេរ n ដែលមានតម្លៃ 33

        System.out.println("Number: " + n); // បង្ហាញតម្លៃនៃ n

        // បង្កើតអនុគមន៍ convertToBinary ដោយប្រើ Lambda Expression
        // ដើម្បីបំលែងលេខទាំងស្រុងទៅជាសំណុំលេខពីរ(Binary)
        Function<Integer, String> convertToBinary = num -> Integer.toBinaryString(num);

        // អនុវត្តអនុគមន៍ convertToBinary លើ n ហើយរក្សាទុកលទ្ធផលក្នុងអថេរ
        // binaryRepresentation
        String binaryRepresentation = convertToBinary.apply(n);

        // បង្ហាញសំណុំលេខពីររបស់ n
        System.out.println("Binary representation: " + binaryRepresentation);

        n = 747; // ផ្លាស់ប្តូរតម្លៃ n ទៅ 747
        System.out.println("\nNumber: " + n); // បង្ហាញតម្លៃនៃ n

        // បង្កើតអនុគមន៍ convertToBinary ដោយប្រើ Lambda Expression
        // ដើម្បីបំលែងលេខទាំងស្រុងទៅជាសំណុំលេខពីរ(Binary)
        convertToBinary = num -> Integer.toBinaryString(num);

        // អនុវត្តអនុគមន៍ convertToBinary លើ n ហើយរក្សាទុកលទ្ធផលក្នុងអថេរ
        // binaryRepresentation
        binaryRepresentation = convertToBinary.apply(n);

        // បង្ហាញសំណុំលេខពីររបស់ n
        System.out.println("Binary representation: " + binaryRepresentation);
    }
}
