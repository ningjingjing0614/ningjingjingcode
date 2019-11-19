/*
#include<stdio.h>
int main()
{
	int i;//天数
	int n=1;//桃子数
	
	for (i =1; i <10; i++)
	{
		n = (n + 1)*2;
	}
	printf("%d  %d\n", i, n);
	return 0;
}
*/
/*int main()
{
	int i;//天数
	int n = 1;//桃子数

	for (i = 10; i >1; i--)
	{
		n = (n + 1) * 2;
	}
	printf("%d\t\t %d\n", i, n);
	return 0;
}
*/
/*
int main()
{
	
		printf("days\t\t peach\n");
		printf("==========\n");
	
	int count = 1;

	for (int days = 10; days > 0; days--)
	{
		printf("%d\t\t %d\n", days, count);
		count = (count + 1) * 2;
	}
	
	return 0;
}
*/

/*
int main()
{

	printf("days\t\t peach\n");
	printf("==========\n");

	int n = 1;//桃子数
	int m;//天数
	for ( m = 10; m > 0; m--)
	{
		printf("%d\t\t %d\n", m, n);
		n = (n + 1) * 2;
		
	}

	return 0;
}
*/

/*
int main()
{//100~200以内的素数
	for (int i = 2; i <= 100; i++)
	{

		int is_prime = 1;

		for (int j = 2; j < i; j++)
		{
			if (i%j == 0)
			{
				is_prime = 0;
				break;
			}
			if (j < i)//if(is_prime = 0)
				printf("%d不是素数\n", i);
		}
	}
	return 0;
}
*/
/*
#include<stdio.h>
int sum_for(int n)
{
	int tmp = 0;
	for (int i = 1; i <= n; i++)
	{
		tmp += i;
	}
	return tmp;
}
*/
/*
#include<stdio.h>
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
*/

#include<stdio.h>//判断n是否为素数
int main()
{
	int n;
	int m;
	scanf("%d", &n);
	for (m = 2; m < n; m++)
		break;
	{
		if (n%m == 0)

		{
			printf("%d不是素数\n", n);
		}
		else
		{
			printf("%d是素数\n", n);
		}
	}
	return 0;
}


