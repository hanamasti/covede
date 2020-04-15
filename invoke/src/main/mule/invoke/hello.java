package invoke;

public class hello {
	public class StockQuoteService {
		public static String sayHello(String name, String city) {
			return "Hello " + name + " from " + city;
		}

		public String getStockPrice(String StockSymbol) {
			if (StockSymbol.equals("mule")) {
				return "100";
			} else if (StockSymbol.equals("ibm")) {
				return "200";
			} else {
				return "Stock doesn't exist";
			}
		}
	}


}

