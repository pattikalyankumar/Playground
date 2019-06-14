#include<stdio.h>

int main()
{
  int a,sum=0,temp;
  scanf("%d",&a);
  temp=a;
  while(temp!=0)
  {
    sum+=temp%10;
    temp/=10;
  }
  while(sum>=10)
  {
    temp=sum;
    sum=0;
   while(temp!=0)
  {
    sum+=temp%10;
     temp/=10;
  }
  }
  printf("%d",sum);
  return 0;
}