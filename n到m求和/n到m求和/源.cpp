//输出ASCII码的前128位字符（%c）
#include<stdio.h>
int main()
{
	int i=1;
	for (i = 1; i <= 128; i++)
	{
		printf("%c\n", i);
	}
	return 0;
}