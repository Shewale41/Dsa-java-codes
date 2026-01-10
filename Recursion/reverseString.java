class Solution {
    public static void rev(int first, int last, char[] s) {
        if (first >= last) return;
        char temp = s[first];
        s[first] = s[last];
        s[last] = temp;
        rev(first + 1, last - 1, s);
    }

    public static void main(String[] args) {
        String str = "gopal";
        char[] s = str.toCharArray();
        rev(0, s.length - 1, s);
        String reversedStr = new String(s);
        System.out.println(reversedStr);
    }
}
