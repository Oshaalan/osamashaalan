
public class Calculator {
	public static void main (String [] args){

		int ersteZahl = Integer.parseInt(args[0]);

		int zweiteZahl = Integer.parseInt(args[1]);

		String operation = (args[2]);

		int Ergebnis = 0;

		if (operation.equals ("-"))
		{
			Ergebnis = ersteZahl - zweiteZahl ;

		}
		else if ( operation.equals ("+"))
		{
			Ergebnis = ersteZahl + zweiteZahl ;
		}

		System.out.println(Ergebnis);

	}
}



