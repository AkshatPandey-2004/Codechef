#include <stdio.h>

int main(void) {
	int t,n1,n2;
	scanf("%d",&t);
	while(t>0){
	    scanf("%d %d",&n1,&n2);
	    if(n1>n2){
	        printf("\n>");
	    }
	    else if(n2>n1){
	        printf("\n<");
	    }
	    else{
	        printf("\n=");
	    }
	    t--;
	    
	}
	return 0;
}
