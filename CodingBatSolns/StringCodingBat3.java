public String doubleChar(String str)
{
  String doubleChar = "";
  for (int i = 0; i < str.length(); i++)
  {
    doubleChar += str.charAt(i);
    doubleChar += str.charAt(i);
  }
  return doubleChar;
}
