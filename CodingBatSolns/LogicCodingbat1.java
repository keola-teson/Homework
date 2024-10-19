/**
Task 1:
*/
public boolean cigarParty(int cigars, boolean isWeekend)
{
  if (isWeekend == true)
  {
    return cigars >= 40? true: false;
  }
  if (cigars < 40 || cigars > 60)
  {
    return false;
  }
  return true;
}


/**
Task 2: 
*/
public int dateFashion(int you, int date)
{
  if (you <= 2 || date <= 2)
  {
    return 0;
  }
  else if (you >= 8 || date >= 8)
  {
    return 2;
  }
  return 1;
}

/**
Task 3:
*/
public boolean squirrelPlay(int temp, boolean isSummer)
{
  if (isSummer == true)
  {
    return temp < 60 || temp > 100? false: true;
  }
  return temp < 60 || temp > 90? false : true;
}

/**
Task 4:
*/
public int caughtSpeeding(int speed, boolean isBirthday)
{
  if (isBirthday == true && speed > 65)
  {
    return speed <= 85? 1 : 2;
  }
  if (isBirthday == false && speed > 60)
  {
    return speed <= 80? 1 : 2;
  }
  return 0;
}

/**
Task 5:
*/
public int sortaSum(int a, int b)
{
  int sum = a + b;
  if (sum >= 10 && sum <= 19)
  {
    return 20;
  }
  return sum;
}
