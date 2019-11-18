#include<stdio.h>
int main()
{
	int a = 1;
	int b = 1;
	int c;
	printf("%d,%d\n", a, b);
	while (1)
	{
		int c = a + b;
		if (c > 1000)
		{
			break;
		}
	}
	printf("%d", c);
	a = b;
	b = c;
	return 0;
}