/**
Task 1:
*/
public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring(2);
}

/**
Task 2:
*/
public String extraEnd(String str) {
	String lastTwoLetters = str.substring(str.length() - 2);
  return lastTwoLetters + lastTwoLetters + lastTwoLetters;
}

/**
Task 3:
*/
public String firstTwo(String str) {
  return str.length() <= 2? str : str.substring(0,2);
}

/**
Task 4:
*/
public String withoutEnd(String str) {
  return str.substring(1, str.length() - 1);
}
