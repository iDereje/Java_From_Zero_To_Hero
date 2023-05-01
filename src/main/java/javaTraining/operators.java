package javaTraining;

public class operators {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        int num3 = 7;
        int num4 = 20;
        
        // Arithmetic Operators
        int sum = num1 + num2; // Addition: 10 + 5 = 15
        int difference = num1 - num2; // Subtraction: 10 - 5 = 5
        int product = num1 * num2; // Multiplication: 10 * 5 = 50
        int quotient = num1 / num2; // Division: 10 / 5 = 2
        int remainder = num1 % num2; // Modulo: 10 % 5 = 0
        int negativeNum = -num1; // Unary minus: -10
        int positiveNum = +num2; // Unary plus: 5
        
        // Compound Assignment Operators
        num1 += 2; // Add 2 to num1: 12
        num2 -= 3; // Subtract 3 from num2: 2
        num3 *= 2; // Multiply num3 by 2: 14
        num4 /= 4; // Divide num4 by 4: 5
        num4 %= 3; // Take num4 modulo 3: 2
        
        // Increment and Decrement Operators
        int count = 0;
        count++; // Increment: count = 1
        ++count; // Increment: count = 2
        count--; // Decrement: count = 1
        --count; // Decrement: count = 0
        
        int a = 5;
        int b = a++; // Postfix increment: a = 6, b = 5
        int c = ++a; // Prefix increment: a = 7, c = 7
        int d = b--; // Postfix decrement: b = 4, d = 5
        int e = --b; // Prefix decrement: b = 3, e = 3
        
        // Bitwise Operators
        int bitwiseAnd = num1 & num2; // Bitwise AND: 10 & 5 = 0
        int bitwiseOr = num1 | num2; // Bitwise OR: 10 | 5 = 15
        int bitwiseXor = num1 ^ num2; // Bitwise XOR: 10 ^ 5 = 15
        int bitwiseNot = ~num1; // Bitwise complement: ~10 = -11
        int leftShift = num1 << 2; // Left shift: 10 << 2 = 40
        int rightShift = num1 >> 2; // Right shift: 10 >> 2 = 2
        int zeroFillRightShift = num1 >>> 2; // Zero-fill right shift: 10 >>> 2 = 2
        
        // Relational Operators
        boolean isGreaterThan = num1 > num2; // true
        boolean isLessThan = num1 < num2; // false
        boolean isGreaterThanOrEqualTo = num1 >= num2; // true
        boolean isLessThanOrEqualTo = num1 <= num2; // false
        
        // Equality Operators
        boolean isEqualTo = num1 == num2; // false
        boolean isNotEqualTo = num1 != num2; // true
        
        // Logical Operators
        boolean isTrue = true;
        boolean isFalse = false;
        boolean andResult = is
