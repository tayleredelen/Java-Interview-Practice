package SparseArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SparseArrays {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Create a list to store the results
        List<Integer> results = new ArrayList<>();

        // Create a hash map to store the counts of each string
        HashMap<String, Integer> map = new HashMap<>();

        // Loop through each string in the 'strings' list
        for (String string : strings) {
            // If the string is not in the map, add it with a count of 1
            // If the string is already in the map, increment its count by 1
            map.put(string, map.getOrDefault(string, 0) + 1);
        }

        // Loop through each query in the 'queries' list
        for (String query : queries) {
            // Get the count of the current query from the map
            // If the query is not in the map, its count will be 0
            int count = map.getOrDefault(query, 0);

            // Add the count of the current query to the results list
            results.add(count);
        }

        // Return the list containing the counts of the queries
        return results;
    }


} 
