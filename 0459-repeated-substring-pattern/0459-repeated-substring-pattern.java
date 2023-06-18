public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        for (int i = 0; i < str.length() / 2; i ++) {
            int count = i + 1;
            if (str.length() % count != 0) {
                continue;
            }
            boolean same = true;
            for (int k = count; k + count <= str.length() && same; k+=count) {
                for (int j = 0; j <= i && same; j ++) {
                    if (str.charAt(j) != str.charAt(j + k)) {
                        same = false;
                    }
                }
            }
            if (same == true) {
                return true;
            }
        }
        return false;
    }
}