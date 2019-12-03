#include<stdio.h>
int main()
{
	int i;
	int n;
	scanf("%d", &n);
	for (i = 0; i <= n; i++)
	{
		if (i % 2 == 0)

		{
			printf("~~~~~~~~~~\n");
		}
		else{
			printf("==========\n");
		}
	}
	return 0;
}