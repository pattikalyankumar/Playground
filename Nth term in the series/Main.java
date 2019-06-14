#include<stdio.h>

int main()
{
  // Type your code here
  int n,a;
  scanf("%d",&n);
  if(n%2==0)
   a=n/2-1; 
  else
    a=(n-1);
  printf("%d",a);
}