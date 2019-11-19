/*
#include<stdio.h>
void show(int a)
{
	a = a / 10;
	switch (a)
	{
	case 10:
			printf("优秀\n");
			break;
	case 9:
			printf("优秀\n");
			break;
	case 8:
			printf("良好\n");
			break;
	case 7:
			printf("中等\n");
			break;
	case 6:
			printf("及格\n");
			break;
	default:
			printf("不及格\n");
			break;
	}
}
int main()
{
	show(98);
	return 0;
}
*/
#include<stdio.h>
int main()
{
	int i = 1;
	while (i < 1000)
	{
		if (i % 3 == 0 && i % 5 == 0)
		
			printf("%d能被3和5整除\n", i);
		
		return 0;
	}
}


