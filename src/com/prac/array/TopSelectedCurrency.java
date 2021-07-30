package com.prac.array;

import java.util.*;

public class TopSelectedCurrency {

/*Trade volume per exchange and currency pair:
[""Binance, XRP/USDT,100000",
"Binance,XRP/BTC,30000",
"Binance,XRP/ETH,7000",
"Huobi,XRP/USDT,200000",
"Huobi,XRP/BTC,18000",
"Upbit,XRP/KRW,25000",
"Upbit,XRP/BTC,1500",
"Upbit,XRP/ETH,100",
"Bittrue,XRP/USD,20000",
"Bittrue,XRP/BCH,5000",
"Bittrue,XRP/BCH,6000",
"Bittrue,XRP/ETH,15000",
"Bittrue,XRP/LTC,9000"]

Write a function that takes the trade volume of different exchanges as input along with a parameter ‘k’ to find the top k currency pairs per exchange.
Output
Top 1 currency pair for each exchange:
Binance XRP/USDT
Huobi XRP/USDT
Upbit XRP/KRW
Bittrue XRP/USD

Top 2 currency pairs for each exchange:
Binance XRP/USDT
Binance XRP/BTC
Huobi XRP/USDT
Huobi XRP/BTC
Upbit XRP/KRW
Upbit XRP/BTC
Bittrue XRP/USD
Bittrue XRP/ETH
*/
public static void main(String[] args) {
    String[] inputarr = {"Binance, XRP/USDT,100000", "Binance,XRP/BTC,30000", "Binance,XRP/ETH,7000", "Huobi,XRP/USDT,200000", "Huobi,XRP/BTC,18000", "Upbit,XRP/KRW,25000",
            "Upbit,XRP/BTC,1500", "Upbit,XRP/ETH,100", "Bittrue,XRP/USD,20000", "Bittrue,XRP/BCH,5000", "Bittrue,XRP/BCH,6000", "Bittrue,XRP/ETH,15000", "Bittrue,XRP/LTC,9000"};
    int k = 2;
    String[] outputarr = findTopCurrencyPair(inputarr, k);
}
public static String[] findTopCurrencyPair(String[] inputarr, int k){
    String[] resultarr = new String[inputarr.length];
    String[] arr1={"w"};
    Map<String, List<String[]>> currencyPairMap = new HashMap<>();
    Integer[] arr = new Integer[inputarr.length];
    for(int i = 0; i<inputarr.length; i++){
        String[] newArr = inputarr[i].split(",");
        if(currencyPairMap.containsKey(newArr[0])) {
            String[] e = new String[2];
            e[0] = newArr[1];
            e[1] = newArr[2];
            List temp = currencyPairMap.get(newArr[0]);
            temp.add(e);
            currencyPairMap.put(newArr[0], temp);
        }
        else{
            List<String[]> newlist = new ArrayList();
            String[] e = new String[2];
            e[0] = newArr[1];
            e[1] = newArr[2];
            newlist.add(e);
            currencyPairMap.put(newArr[0], newlist);
        }
    }

    for (Map.Entry entry : currencyPairMap.entrySet())
    {
        System.out.println("key: " + entry.getKey());
        List printl = currencyPairMap.get(entry.getKey());
        for(int i=0; i<printl.size(); i++){
            String[] s = (String[]) printl.get(i);
            for(String st: s)
                System.out.println(st);
        }
    }
    return resultarr;
}

}
