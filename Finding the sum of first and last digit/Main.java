#include <stdio.h>
int main() {
	//Type your code
  int n, temp,count=1;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
  count*=10;
    n=n/10;
  }
 count/=10;
  
  printf("%d",(temp/count)+(temp%10));
	return 0;
}