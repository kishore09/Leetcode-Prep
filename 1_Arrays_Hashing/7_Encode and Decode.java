public class Solution {
    // Input: dummy_input = ["Hello","World"]
    // Output: ["Hello","World"]
    
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        // loop till end 
        while (i < str.length()) {
            int j = i;
            // put j at index of # 
            while (str.charAt(j) != '#') j++;
            
            // get the count number
            int length = Integer.valueOf(str.substring(i, j));
            
            // increment to count + 1
            i = j + 1 + length;

            // extract substring 
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
}


// ***** REREAD THE TC AND SC *****

// - - - - - - - - -
// -   TC: O(n + m)    -
// -   SC: O(n + m)    -
// - - - - - - - - -

// Time complexity:
// The encode() function processes each string in the list exactly once, so its time complexity is O(n), where n is the total length of all the strings in the list.

// The decode() function processes each character in the input encoded string s exactly once, so its time complexity is O(m), where m is the length of the input encoded string.

// Therefore, the overall time complexity of the entire code is O(n + m)

// Space complexity:
// The encode() function creates a new StringBuilder object to store the encoded string, which has a space complexity of O(m), where m is the total length of all the strings in the input list.

// The decode() function creates a new ArrayList object to store the decoded strings, which has a space complexity of O(n), where n is the total length of all the strings in the input list.

// Therefore, the overall space complexity of the entire code is O(n + m)