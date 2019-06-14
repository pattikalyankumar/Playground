#include <stdio.h>
int main() {
	//Type your code
  int n,i,odd=1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
  	while(1)
    {
    	if(odd%2==1)
        {
        	printf("%d\n",odd);
          odd+=1;
          break;
        }
      odd+=1;
    }
  }
	return 0;
}