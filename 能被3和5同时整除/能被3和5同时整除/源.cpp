#include<stdio.h>//�ܱ�3��5ͬʱ����
int main()
{
	int n;
	scanf("%d", &n);

	if (n % 3 == 0 && n % 5 == 0)
	{
		printf("%d�ܱ�3��5����\n", n);
	}
	else
	{
		printf("%d����ͬʱ��3��5����\n", n);
	}
	return 0;
}
