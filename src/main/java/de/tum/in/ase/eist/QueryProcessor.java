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
        } else if (query.contains("name")) {
            return "MyTeam";
        } else if (query.contains("what is 10 plus 15")) {
            int summand1 = Integer.parseInt(query.substring(9,10));
            int summand2 = Integer.parseInt(query.substring(17,18));
            int summe = summand1 + summand2;
            return String.valueOf(summe);
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
