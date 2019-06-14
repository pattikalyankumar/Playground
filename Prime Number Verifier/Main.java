// INCLUDE HEADER FILES NEEDED BY YOUR PROGRA
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int c=0,n;
  scanf("%d",&n);
  if(n==0)
  {
    printf("neither");
    return 0;
  }
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      c++;
  }
  if(c==2)
    printf("prime");
  else
    printf("composite");
   return 0;
}