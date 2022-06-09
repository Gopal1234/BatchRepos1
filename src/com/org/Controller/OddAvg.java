package com.org.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OddAvg {
    public static int generateAvg(HashMap<Integer, Integer> value)
    {
        //List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        int count =0;
        for(Map.Entry<Integer, Integer> me:value.entrySet())
        {
            if(me.getKey()%2 != 0) {
                count ++;
                int val = me.getValue();
                //list.add(me.getValue());
                sum+= val;
            }
           
            //sum+= list.size();
        }
        /*for(int i = 0; i<count;i++)
        {????????
            sum+=list.get(i);
        }????????*/
        return sum/count;
        //return (int)list.stream().mapToInt(a->a).average().orElse(0);
       
       
    }
    public static void main(String[] args)
    {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
    	for (int i = 0; i < n; i++)
    	hm1.put(s.nextInt(), s.nextInt());
    	System.out.println( OddAvg .generateAvg(hm1));

    }
}
 