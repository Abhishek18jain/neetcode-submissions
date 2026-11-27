class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);

            sb.append(s.length())
              .append("#")
              .append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> result = new ArrayList<>();

        while (i < str.length()) {

            // Find delimiter
            int delimiter = str.indexOf("#", i);

            // Read length
            int length = Integer.parseInt(
                str.substring(i, delimiter)
            );

            // Extract string
            String word = str.substring(
                delimiter + 1,
                delimiter + 1 + length
            );

            // Add extracted string
            result.add(word);

            // Move to next encoded string
            i = delimiter + 1 + length;
        }

        return result;
    }
}