#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0,fact=1,rem,i,temp;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
  	rem=n%10;
    for(i=1;i<=rem;i++)
      fact=fact*i;
    sum+=fact;
    fact=1;
    n/=10;
  }
  if(sum==temp)
    printf("Yes");
  else
    printf("No");
	return 0;
}