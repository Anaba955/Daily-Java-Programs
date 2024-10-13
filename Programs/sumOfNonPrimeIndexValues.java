class UserMainCode
{
	public int sumOfNonPrimeIndexValues(int input1, input2) {
		int sum = 0;
		for(int i = 0; i < input1.length; i++) {
		    if(!isPrime(i))     sum += input1[i];
		}
		return sum;
	}
	public boolean isPrime(int i) {
	    if(i < 2)   return false;
	    for(int j = 2; j <= i / 2; j++)
	        if(i % j == 0)  return false;
	    return true;
	}
}
