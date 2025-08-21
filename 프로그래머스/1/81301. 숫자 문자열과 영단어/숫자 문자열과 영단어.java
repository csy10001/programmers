class Solution {
    public int solution(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c);
            } else {
                word.append(c);
                String w = word.toString();
                switch (w) {
                    case "zero":
                        result.append("0");
                        word.setLength(0);
                        break;
                    case "one":
                        result.append("1");
                        word.setLength(0);
                        break;
                    case "two":
                        result.append("2");
                        word.setLength(0);
                        break;
                    case "three":
                        result.append("3");
                        word.setLength(0);
                        break;
                    case "four":
                        result.append("4");
                        word.setLength(0);
                        break;
                    case "five":
                        result.append("5");
                        word.setLength(0);
                        break;
                    case "six":
                        result.append("6");
                        word.setLength(0);
                        break;
                    case "seven":
                        result.append("7");
                        word.setLength(0);
                        break;
                    case "eight":
                        result.append("8");
                        word.setLength(0);
                        break;
                    case "nine":
                        result.append("9");
                        word.setLength(0);
                        break;
                }
            }
        }
        return Integer.parseInt(result.toString());
    }
}
