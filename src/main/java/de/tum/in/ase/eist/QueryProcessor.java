package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if(query.contains("which of the following numbers is the largest:")){
            query = query.substring(query.lastIndexOf(":"));
            query = query.replaceAll("[^0-9]", " ");
            query = query.replaceAll("\\s+", " ");
            query = query.trim();
            String[] bitches = query.split(" ");
            int max = Integer.MIN_VALUE;
            for(int i=0;i< bitches.length;i++){
                if(max<Integer.parseInt(bitches[i])){
                    max = Integer.parseInt(bitches[i]);
                }
            }
            return "" + max;


        } else if (query.contains("what is")) {
            query = query.substring(query.lastIndexOf(":"));
            query = query.replaceAll("[^0-9]", " ");
            query = query.replaceAll("\\s+", " ");
            query = query.trim();
            String[] bitches = query.split(" ");
            int sum=0;
            for (int i=0;i< bitches.length;i++){
                sum += Integer.parseInt(bitches[i]);
            }
            return ""+sum;

        } else if (query.contains("name")) {
            return "MyTeam";
        } else { // TODO extend the programm here
            return "";
        }
    }
}