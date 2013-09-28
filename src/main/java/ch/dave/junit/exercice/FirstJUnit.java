package ch.dave.junit.exercice;

public class FirstJUnit implements IMdpJunitDemo {

	public boolean isEmpty(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		return false;
	}

	public String capitalize(String str) {
		String begin = str.substring(0, 1);
		String end = str.substring(1);
		return begin.toUpperCase() + end.toLowerCase();
	}

	public String reverse(String str) throws NullPointerException {
		if (str == null){
			throw new NullPointerException("parameter is null");
		}
		return new StringBuilder(str).reverse().toString();
	}

	public String join(String... strings) {
		String str = strings[0];
		for(int i = 1; i < strings.length; i++){
			str = str + " " + strings[i];
		}
		return str;
	}

}
