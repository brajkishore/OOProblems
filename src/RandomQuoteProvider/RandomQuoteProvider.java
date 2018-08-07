package RandomQuoteProvider;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomQuoteProvider {

  class Quote{

  }
  private Map<Integer,Quote> quoteMap=new HashMap<>();
  private Random random=new Random();

  public static void main(String[] args) {

    RandomQuoteProvider quoteProvider=new RandomQuoteProvider();
    quoteProvider.loadInitData();

    for (int i = 0; i < 5; i++) {
      System.out.println(quoteProvider.getRandomQuote());
    }



  }

  public Quote getRandomQuote(){
    int randomQuoteNo=random.nextInt(quoteMap.size());
    return quoteMap.get(randomQuoteNo);
  }

  private void loadInitData(){
      //Generating a random key for hashMap
    int maxSize=10;
    for(int i=0;i<maxSize;i++) {
      quoteMap.put(i,new Quote());
    }
  }
}
