#include<stdio.h>
int main()
{
  //Type your code here
  int n,a,b,temp,i;
  scanf("%d",&n);
  a=1,b=2;
  for(i=2;i<=n;i++)
  {
    temp=a;
    a=b;
    b=temp+a;
  }
  printf("%d",a);
}