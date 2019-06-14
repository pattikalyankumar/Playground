#include<stdio.h>
int main()
{
  //Type your code here
  int n,m;
  scanf("%d%d",&n,&m);
  if(n>m)
    printf("num1 is the greatest");
  else if(m>n)
    printf("num2 is the greatest");
  else
    printf("Both number Equal");
  return 0;
}