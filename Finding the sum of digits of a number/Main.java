#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0,rem;
  scanf("%d",&n);
  while(n!=0)
  {
  rem=n%10;
    n=n/10;
    sum+=rem;
  }
  printf("%d",sum);
	return 0;
}