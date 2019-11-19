#include<stdio.h>//能被3和5同时整除
int main()
{
	int n;
	scanf("%d", &n);

	if (n % 3 == 0 && n % 5 == 0)
	{
		printf("%d能被3和5整除\n", n);
	}
	else
	{
		printf("%d不能同时被3和5整除\n", n);
	}
	return 0;
}
