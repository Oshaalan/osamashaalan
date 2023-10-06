public class Calculator2 {
	public static void main (String[]args){

		int w1 = Integer.parseInt(args[0]);
		int w2 = Integer.parseInt(args[1]);
		String op = args[2];
		int sum=0;
		int sum1=1;

		switch (op){
			case "+":
				sum = w1 + w2;
				System.out.println( "Das Ergebnis ist " + sum );
				break;
			case "-":
				sum = w1 - w2;
				System.out.println( "Das Ergebnis ist " + sum );
				break;
			case "*":
				sum1 = w1 * w2;
				System.out.println( "Das Ergebnis ist " + sum1 );
				break;
			case "/":
				sum1 = w1 / w2;
				System.out.println( "Das Ergebnis ist " + sum1 );
				break ;
		}
		
	}
}
