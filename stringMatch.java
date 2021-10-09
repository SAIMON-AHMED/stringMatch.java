/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
*/

public int stringMatch(String a, String b) {
  int count = 0;
  int shortString = 0;
  if (a.length() > b.length()) {
    shortString = b.length();
  } else {
    shortString = a.length();
  }
  for (int i = 0; i < shortString-1; i++) {
    for (int j = 0; j < shortString-1; j++) {
      if ((a.substring(i, i+2)).equals(b.substring(j, j+2))) {
        count++;
      }
        i++;
    }
  }
  return count;
}
