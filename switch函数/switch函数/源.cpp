/*
#include<stdio.h>
void show(int a)
{
	a = a / 10;
	switch (a)
	{
	case 10:
			printf("����\n");
			break;
	case 9:
			printf("����\n");
			break;
	case 8:
			printf("����\n");
			break;
	case 7:
			printf("�е�\n");
			break;
	case 6:
			printf("����\n");
			break;
	default:
			printf("������\n");
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
		
			printf("%d�ܱ�3��5����\n", i);
		
		return 0;
	}
}


