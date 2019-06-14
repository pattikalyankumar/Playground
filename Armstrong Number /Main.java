#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int temp,count=0, n,sum=0,rem;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
  	count+=1;
    n=n/10;
  }
 
  n=temp;
  while(temp!=0)
  {
  	rem=temp%10;
    sum+=pow(rem,count);
    temp=temp/10;
   
  }
 
  
  if(n==sum)
    printf("Armstrong Number");
  else
     printf("Not an Armstrong Number");
     
	return 0;
}