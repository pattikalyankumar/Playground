#include<stdio.h>
int main()
{
  //Type youe code here
  int n,sum=0,c=0,i;
  scanf("%d",&n);
  while(n>0)
  {
    for(i=1;i<=n;i++)
    {
      if(n%i==0)
        c=c+1;
    }
    if(c==2)
      sum=sum+n;
    n=n-1;
    c=0;
  }
  printf("%d",sum);
  return 0;
}