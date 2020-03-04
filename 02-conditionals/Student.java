public class Student {
    // Je wil t-shirts laten drukken.
    // Per t-shirt betaal je €10.
    // Als je 10 of meer t-shirts laat drukken, krijg je €5 korting.
    // Schrijf een functie tShirts(n) die, gegeven een aantal t-shirts n, teruggeeft hoeveel je moet betalen.

public int tShirts(int n){
	if (n < 10){
		return n * 10;
	}else{
		return n*10 - 5;
	}
}

}
