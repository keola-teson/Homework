public int factorial(int n) {
  if (n > 1)
    return n * factorial(n - 1);
  return 1;
}

public int bunnyEars(int bunnies) {
  if (bunnies > 0)
    return 2 + bunnyEars(bunnies - 1);
  return 0;
}

public int fibonacci(int n) {
  if (n == 0 || n == 1)
    return n;
  return fibonacci(n - 1) + fibonacci(n - 2);
}
