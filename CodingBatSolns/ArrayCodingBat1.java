public boolean firstLast6(int[] nums) {
    if (nums[0] == 6 || nums[nums.length - 1] == 6)
    {
      return true;
    }
    return false;
}


public boolean sameFirstLast(int[] nums) {
  if (nums.length > 0)
  {
    if (nums[0] == nums[nums.length - 1] && nums[nums.length - 1] == nums[0])
    {
      return true;
    }
  }
  return false;
}


public int[] makePi() {
  int[] pi = {3, 1, 4};
  
  return pi;
}


public boolean commonEnd(int[] a, int[] b) {
  if (a.length > 0 && b.length > 0)
  {
    if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
    {
      return true;
    }
  }
  return false;
}


public int sum3(int[] nums) {
  int sum = nums[0] + nums[1] + nums[2];
  
  return sum;
}
