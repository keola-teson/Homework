public int[] rotateLeft3(int[] nums) {
  int[] copy = new int[nums.length];
  
  copy[0] = nums[1];
  copy[1] = nums[2];
  copy[2] = nums[0];
  
  return copy;
}
public int[] rotateLeft3(int[] nums) {
  int[] copy = new int[nums.length];
  
  for (int i = 0; i < nums.length; i++)
  {
    if (i + 1 == nums.length)
    {
      copy[i] = nums[0];
    }
    else
    {
      copy[i] = nums[i + 1];
    }
  }
  
  return copy;
}


public int[] reverse3(int[] nums) {
  int[] copy = new int[nums.length];
  
  copy[0] = nums[2];
  copy[1] = nums[1];
  copy[2] = nums[0];
  
  return copy;
}
public int[] reverse3(int[] nums) {
  int[] copy = new int[nums.length];
  
  for (int i = nums.length - 1; i >= 0; i--)
  {
    copy[(nums.length - 1) - i] = nums[i];
  }
  
  return copy;
}


public int[] maxEnd3(int[] nums) {
  int[] copy = new int[nums.length];
  
  if (nums[0] > nums[2])
  {
    copy[0] = nums[0];
    copy[1] = nums[0];
    copy[2] = nums[0];
  }
  else
  {
    copy[0] = nums[2];
    copy[1] = nums[2];
    copy[2] = nums[2];
  }
  
  return copy;
}
public int[] maxEnd3(int[] nums) {
  int[] copy = new int[nums.length];
  
  if (nums[0] > nums[2])
  {
    for (int i = 0; i < nums.length; i++)
    {
      copy[i] = nums[0];
    }
  }
  else
  {
    for (int i = 0; i < nums.length; i++)
    {
      copy[i] = nums[2];
    }
  }
  
  return copy;
}


public int sum2(int[] nums) {
  if (nums.length == 0)
  {
    return 0;
  }
  
  if (nums.length < 2)
  {
    return nums[0];
  }
  
  return nums[0] + nums[1];
}


public int[] middleWay(int[] a, int[] b) {
  int[] middle = {a[1], b[1]};
  
  return middle;
}

public int[] makeEnds(int[] nums) {
  int[] ends = {nums[0], nums[nums.length - 1]};
  
  return ends;
}
