

/*
 * WAP to convert a binary to decimal.
 * (i wrote by taking the parameter as String, 
 * he asked me to do by taking as int)
 */
public class BinaryToDecimal {

	static void convert(int num) {

		int power = 0;
		int sum = 0;
		int r;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum += r * Math.pow(2, power);
			power++;
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		convert(1011);
	}

}
