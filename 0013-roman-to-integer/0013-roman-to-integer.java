class Solution {
    public int romanToInt(String s) {
        char c[] = s.toCharArray();
        int res = 0;
        for (int i = 0; i < c.length;i++) {
            if (i + 1 < c.length) {
                if (c[i + 1] == 'V' && c[i] == 'I') {
                    res += 4;
                    i++;
                    continue;
                } else if (c[i + 1] == 'X' && c[i] == 'I') {
                    res += 9;
                    i++;
                    continue;
                } else if (c[i + 1] == 'L' && c[i] == 'X') {
                    res += 40;
                    i++;
                    continue;
                } else if (c[i + 1] == 'C' && c[i] == 'X') {
                    res += 90;
                    i++;
                    continue;
                } else if (c[i + 1] == 'D' && c[i] == 'C') {
                    res += 400;
                    i++;
                    continue;
                } else if (c[i + 1] == 'M' && c[i] == 'C') {
                    res += 900;
                    i++;
                    continue;
                }
            }
            if (c[i] == 'I') {
                res += 1;
            } else if (c[i] == 'V') {
                res += 5;
            } else if (c[i] == 'X') {
                res += 10;
            } else if (c[i] == 'L') {
                res += 50;
            } else if (c[i] == 'C') {
                res += 100;
            } else if (c[i] == 'D') {
                res += 500;
            } else if (c[i] == 'M') {
                res += 1000;
            }
        }
        return res;
    }
}