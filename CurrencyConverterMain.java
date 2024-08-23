// An Application in Java for Currency Conversion.
import java.util.Scanner;

interface Converter {
  double convert(double amount, String fromCurrency, String toCurrency);
}
class CurrencyConverter implements Converter {
  double[][] exchangeRates;
  String[] currencies;
  int numCurrencies;
  public CurrencyConverter() {
    exchangeRates = new double[10][10];
    currencies = new String[10];
    numCurrencies = 0;
    addCurrency("USD", 1.0);
    addCurrency("EUR", 0.8);
    addCurrency("GBP", 0.7);
    addCurrency("INR", 80);
  }
  public int getCurrencyIndex(String currency) {
    for (int i = 0; i < numCurrencies; i++) {
      if (currencies[i].equals(currency)) {
        return i;
      }
    }
    return -1;
  }
  public void addCurrency(String currency, double exchangeRate) {
    int index = getCurrencyIndex(currency);
    if (index == -1) {
      currencies[numCurrencies] = currency;
      exchangeRates[numCurrencies][numCurrencies] = 1.0;
      index = numCurrencies;
      numCurrencies++;
    }
    for (int i = 0; i < numCurrencies; i++) {
      exchangeRates[index][i] = exchangeRates[0][i] / exchangeRate;
      exchangeRates[i][index] = exchangeRate / exchangeRates[0][i];
    }
  }
  public void removeCurrency(String currency) {
    int index = getCurrencyIndex(currency);
    if (index == -1) {
      return;
    }
    for (int i = index; i < numCurrencies - 1; i++) {
      currencies[i] = currencies[i + 1];
      for (int j = 0; j < numCurrencies; j++) {
        exchangeRates[i][j] = exchangeRates[i + 1][j];
        exchangeRates[j][i] = exchangeRates[j][i + 1];
      }
    }
    numCurrencies--;
  }
  public double convert(double amount, String fromCurrency, String toCurrency) {
    int fromIndex = getCurrencyIndex(fromCurrency);
    int toIndex = getCurrencyIndex(toCurrency);
    if (fromIndex == -1) {
      System.out.println("Unsupported currency: " + fromCurrency);
      return 0.0;
    }
    if (toIndex == -1) {
      System.out.println("Unsupported currency: " + toCurrency);
      return 0.0;
    }
    return amount * exchangeRates[fromIndex][toIndex];
  }
  public void currencyDisplay(){
    System.out.println("** Current Options of Currency **");
    for(int i=0;i<numCurrencies;i++){
      System.out.println("\t"+currencies[i]);
    }
  }
}
public class CurrencyConverterMain {
  public static void main(String[] args) {
    System.out.println("\n**** Welcome to EduWe Currency Converter ****");
    Scanner sc = new Scanner(System.in);
    CurrencyConverter con = new CurrencyConverter();
    int choice;
    loop: do{
        System.out.println("\n\n Enter 1. Display Currency\n Enter 2. Add New Currency");
        System.out.println(" Enter 3. Remove Currency\n Enter 4. Currency Conversion");
        System.out.println(" Enter 5. Exit");
        System.out.print("  Choose Any One from the Given Options:: ");
        choice = sc.nextInt();
        switch(choice){
          case 1-> con.currencyDisplay();
          case 2-> {System.out.print("Enter to Currency Name you want to add: ");
                   String cur = sc.next();
                   System.out.print("Enter to exchange rate as per USD: ");
                   double er = sc.nextDouble();
                   con.addCurrency(cur,er);}
          case 3-> {System.out.print("Enter to Currency Name you want to remove: ");
                   String cur = sc.next();
                   con.removeCurrency(cur);}
          case 4-> {System.out.print("Enter amount: ");
                   double amount = sc.nextDouble();
                   System.out.print("Enter from currency: ");
                   String fromCurrency = sc.next();
                   System.out.print("Enter to currency: ");
                   String toCurrency = sc.next();
                   double result = con.convert(amount, fromCurrency, toCurrency);
                   System.out.println(amount + " " + fromCurrency + " is equal to " + result + " " + toCurrency);
                    }
          case 5-> System.out.println("**** Thank you for Using EduWe Currency Converter ****");
          default-> System.out.println("Wrong Option XXXX");
        }
    } while(choice!=5);
  }
}
