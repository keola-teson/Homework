/**
Task 1:
*/
public boolean cigarParty(int cigars, boolean isWeekend)
{
	if (isWeekend == true)
	{
	  return (cigars >= 40? true: false);
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
  //if statement to check is you or date is less than 2 (inclusive)
  if (you <= 2 || date <= 2)
  {
    //returns 0
    return 0;
  }
  //else if statement to check if you or date is greater than 8 (inclusive)
  else if (you >= 8 || date >= 8)
  {
    //returns 2
    return 2;
  }
  //returns 1 if every check is false
  return 1;
}

/**
Task 3:
*/
public boolean squirrelPlay(int temp, boolean isSummer) {
  if (isSummer == true)
  {
    return temp < 60 || temp > 100? false: true;
  }
  return temp < 60 || temp > 90? false : true;
}

/**
Task 4:
*/
public int caughtSpeeding(int speed, boolean isBirthday) {
  //if statement to check if isBirthday true
  if (isBirthday == true)
  {
    //if statement to check if speed is less than 65 (inclusive)
    if (speed <= 65)
    {
      //returns 0
      return 0;
    }
    //if statment to check if speed is greater than 85
    else if (speed > 85)
    {
      //returns 2
      return 2;
    }
    //else statement for if every other check was false
    else
    {
      //returns 1
      return 1;
    }
  }
  //if statement to check if speed is less than 60 (inclusive)
  if (speed <= 60)
  {
    //returns 0
    return 0;
  }
  //else if statement to check if speed is greater than 80
  else if (speed > 80)
  {
    //returns 2
    return 2;
  }
  //returns 1 if every other check was false
  return 1;
}

/**
Task 5:
*/
public int sortaSum(int a, int b)
{
  //int to calculate a + b
  int sum = a + b;
  //if statement to check if sum is between 10 and 19 (inclusive)
  if (sum >= 10 && sum <= 19)
  {
    //returns 20
    return 20;
  }
  //returns the calculated sum if check was false
  return sum;
}
