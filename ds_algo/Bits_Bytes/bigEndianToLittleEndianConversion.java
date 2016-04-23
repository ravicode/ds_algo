package Bits_Bytes;

/*Big Endian to Little Endian Conversion

This required concepts of masking and bit-wise operators. 
After I came up with a code to do the same, 
I was asked to reduce the space complexity to O(1).
 2 minutes of thinking and I managed to do crack it !
*/


/*
 * Little and big endian are two ways of storing multibyte data-types ( int, float, etc). 
 * In little endian machines, last byte of binary representation of the multibyte data-type 
 * is stored first. 
 * On the other hand, in big endian machines, first byte of binary representation 
 * of the multibyte data-type is stored first.
 
 a variable x with value 0�01234567 will be stored as following.
 big-endina-    01 23 45 67     these are 4 bytes
 
 little endian- 67 45 23 01
 */

public class bigEndianToLittleEndianConversion {

}
