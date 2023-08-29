package FlippingBits;

public class FlippingBits {

    public static long flippingBits(long n) {
        // Convert the number to its binary representation
        String binaryNum = Long.toBinaryString(n);

        // Pad zeros to the left to make it 32 bits long
        while (binaryNum.length() < 32) {
            binaryNum = "0" + binaryNum;
        }

        // Create a StringBuilder to store the flipped binary representation
        StringBuilder flippedBinary = new StringBuilder();

        // Iterate through each bit and flip it using XOR (^) with 1
        for (char bit : binaryNum.toCharArray()) {
            flippedBinary.append((bit == '0') ? '1' : '0');
        }

        // Convert the flipped binary representation back to a long integer
        long flippedInteger = Long.parseLong(flippedBinary.toString(), 2);

        return flippedInteger;
    }


} 
