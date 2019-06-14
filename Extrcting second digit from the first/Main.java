#include <stdio.h>
int main() {
	//Type your code
  int n,rem;
  scanf("%d",&n);
  
  while(n>=10)
  {
  rem=n%10;
    n=n/10;
    
  }
  printf("%d",rem);
	return 0;
}