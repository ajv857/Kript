package avtech.software.kript;

public class Kript {

	private Key privateKey;
	private Key publicKey;

	public Kript() {
		generateKeys();
	}

	private void generateKeys() {
		privateKey = new Key();
		publicKey = new Key(privateKey);
		privateKey.print();
		System.out.println();
		publicKey.print();
	}

	public String encrypt(String s) {

		return null;
	}

	public String decrypt(String s) {

		return null;
	}

	public static void main(String[] args) {
		new Kript();
		/**
		 * test 2
		 */
		// BigInteger multiply = new BigInteger(privateKey.toBinaryString(
		// privateKey.getKey(), false), 2).multiply(new BigInteger(
		// "01100011", 2));
		// System.out.println(multiply.toString(2));

		/**
		 * multiplication example
		 */
		// System.out.println(new BigInteger(privateKey.toBinaryString(
		// privateKey.getKey(), false), 2).multiply(
		// new BigInteger("01100011")).toString(2));

	}
}