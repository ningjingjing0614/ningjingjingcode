#include<stdio.h>
int main()
{
	int n;
	int sum = 0;
	int i = 1;
	scanf("%d", &n);//1+2+3+……+n
	for(i = 1; i <= n; i++)//此处不能用分号
	{
		sum = sum+i;
	}
	printf("%d\n", sum);
	return 0;
}