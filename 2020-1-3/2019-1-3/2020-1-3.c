//【大小指针】输入三个整数a,b,c,要求按由大到小的顺序将它们输出。用函数实现。
# include <stdio.h>
int main()
{
	void exchange(int*q1,int*q2,int*q3);
	int a,b,c,*p1,*p2,*p3;
	printf("Please enter three numbers:");
	scanf("%d,%d,%d",&a,&b,&c);
	p1=&a,p2=&b,p3=&c;
	exchange(p1,p2,p3);
	printf("The order is:%d,%d,%d\n",a,b,c);
	return 0;
}
void exchange(int*q1,int*q2,int*q3)
{
	void swap(int*pt1,int*pt2);
	if(*q1<*q2)swap(q1,q2);
	if(*q1<*q3)swap(q1,q3);
	if(*q2<*q3)swap(q2,q3);
}
void swap(int*pt1,int*pt2)
{
	int temp;
	temp=*pt1;
	*pt1=*pt2;
	*pt2=temp;
}
//有五个候选人，30个选民每人只能投票选一人，要求编一个统计选票的程序，先后输入被选人的名字，最后输出各人得票结果。

#include<string.h>
#include<stdio.h>
struct person
{
	char name[20];
	int count;
}leader[5] = {"aa",0,"bb",0, "cc",0, "dd",0, "ee",0};
int main()
{
	int i,j;
	char vote_name[20];
	for (i = 0; i < 30; i++)
	{
		scanf("%s",vote_name);
		for(j = 0; j < 5; j++)
		{
			if (strcmp(vote_name, leader[j].name) == 0)
			{
				leader[j].count ++;
			}
		}
	}
	printf("\n result is:\n");
	for(i=0;i<5;i++)
	{
		printf("%5s:%d\n",leader[i].name,leader[i].count);
	}
	return 0;
}
