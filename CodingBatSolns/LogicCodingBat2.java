/**
Task 1:
*/
public String alarmClock(int day, boolean vacation) {
  if (vacation == true)
  {
      if (day == 0 || day == 6)
      {
        return "off";
      }
      else
      {
        return "10:00";
      }
  }
  else if (day == 0 || day == 6)
  {
    return "10:00";
  }
  return "7:00";
}

/**
Task 2:
*/
public boolean in1To10(int n, boolean outsideMode) {
  if (outsideMode == true)
  {
    if (n <= 1 || n >= 10)
    {
      return true;
    }
    return false;
  }
  else if (n < 1 || n > 10)
  {
    return false;
  }
  return true;
}

/**
Task 3:
*/
public boolean old35(int n) {
  if (n % 3 == 0 && n % 5 == 0)
  {
    return false;
  }
  if (n % 3 == 0 || n % 5 == 0)
  {
    return true;
  }
  return false;
}
