#include <stdio.h>

int main(void) {
	int t,a,b,c;
	scanf("%d \n",&t);
	while(t--)
	{
	    scanf("%d %d %d \n",&a,&b,&c);
	    printf("%d \n",(b-a)/c);
	}
	return 0;
}
