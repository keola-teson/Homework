public boolean has23(int[] nums) {
  for (int i : nums)
  {
    if (i == 2 || i == 3)
    {
      return true;
    }
  }
  return false; 
}

public boolean no23(int[] nums) {
  boolean has23 = false;
  for (int i : nums)
  {
    if (i == 2 || i == 3)
    {
      has23 = true;
    }
  }
  if (has23)
  {
    return false;
  }
  return true;
}

public int[] makeLast(int[] nums) {
  int[] copy = new int[nums.length * 2];
  
  copy[copy.length - 1] = nums[nums.length - 1];
  
  return copy;
}

public boolean double23(int[] nums) {
  if (nums.length < 2)
  {
    return false;
  }
  
  if (nums[0] == 2 && nums[1] == nums[0])
  {
    return true;
  }
  else if (nums[0] == 3 && nums[1] == nums[0])
  {
    return true;
  }
  
  return false;
}

public int[] fix23(int[] nums) {
  int[] copy = new int[nums.length];
  
  for (int i = 0; i < nums.length; i++)
  {
    copy[i] = nums[i];
    
    if (i > 0)
    {
      if (copy[i] == 3 && copy[i - 1] == 2)
      {
        copy[i] = 0;
      }
    }
  }
  
  return copy;
}

public int start1(int[] a, int[] b) {
  int count = 0;
  
  for (int i = 0; i < a.length; i++)
  {
    if (a[i] == 1)
    {
      count++;
      break;
    }
  }
  
  for (int i = 0; i < b.length; i++)
  {
    if (b[i] == 1)
    {
      count++;
      break;
    }
  }
  
  return count;
}

public int[] biggerTwo(int[] a, int[] b) {
  int aSum = a[0] + a[1];
  int bSum = b[0] + b[1];
  
  if (aSum >= bSum)
  {
    return a;
  }
  return b;
}

public int[] makeMiddle(int[] nums) {
  int[] middle = new int[2];
  
  if (nums.length == 2)
  {
    return nums;
  }
  
  middle[0] = nums[nums.length / 2 - 1];
  middle[1] = nums[nums.length / 2];
  
  return middle;
}

public int[] plusTwo(int[] a, int[] b) {
  int[] both = new int[a.length + b.length];
  
  for (int i = 0; i < a.length; i++)
  {
    both[i] = a[i];
  }
  
  for (int i = 0; i < b.length; i++)
  {
    both[i + a.length] = b[i];
  }
  
  return both;
}

public int[] swapEnds(int[] nums) {
  int[] copy = new int[nums.length];
  
  if (nums.length == 1)
  {
    return nums;
  }
  
  for (int i = 0; i < nums.length - 1; i++)
  {
    if (i == 0)
    {
      copy[i] = nums[nums.length - 1];
      copy[copy.length - 1] = nums[i];
    }
    else
    {
      copy[i] = nums[i];
    }
  }
  
  return copy;
}

public int[] midThree(int[] nums) {
  int[] middle = new int[3];
  
  middle[0] = nums[nums.length / 2 - 1];
  middle[1] = nums[nums.length / 2];
  middle[2] = nums[nums.length / 2 + 1];
  
  return middle;
}

public int maxTriple(int[] nums) {
  int biggest = nums[0];
  
  if (biggest < nums[nums.length / 2])
  {
    biggest = nums[nums.length / 2];
  }
  
  if (biggest < nums[nums.length - 1])
  {
    biggest = nums[nums.length - 1];
  }
  
  return biggest;
}

public int[] frontPiece(int[] nums) {
  
  if (nums.length >= 2)
  {
    int[] copy = new int[2];
    
    copy[0] = nums[0];
    copy[1] = nums[1];
    
    return copy;
  }
  return nums;
}

public boolean unlucky1(int[] nums) {
  boolean isUnlucky = false;
  
  if (nums.length >= 2)
  {
    if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3))
    {
      isUnlucky = true;
    }
    
    if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)
    {
      isUnlucky = true;
    }
  }
  
  return isUnlucky;
}

public int[] make2(int[] a, int[] b) {
  int[] make2 = new int[2];
  
  int i;
  for (i = 0; i < a.length; i++)
  {
    if (i < 2)
    {
      make2[i] = a[i];
    }
  }
  
  if (i < 2)
  {
    if (i == 0)
    {
      make2[0] = b[0];
      make2[1] = b[1];
    }
    
    if (i == 1)
    {
      make2[1] = b[0];
    }
  }
  return make2;
}

public int[] front11(int[] a, int[] b) {
  if (a.length == 0 && b.length == 0)
    return new int[]{};
  
  if (a.length == 0)
    return new int[]{b[0]};
  
  if (b.length == 0)
    return new int[]{a[0]};
  
  return new int[]{a[0], b[0]};
}
