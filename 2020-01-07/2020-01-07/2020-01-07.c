//��ͶƱ����5����ѡ�ˣ�ÿ��ѡ��ֻ��ͶƱѡһ�ˣ���Ҫ���һ��ͳ��ѡƱ�ĳ����Ⱥ����뱸ѡ�˵����֣����������˵�Ʊ�����
#include <string.h>
#include <stdio.h>
struct person 
{
	char name[20]; 
int count; 
}
leader[5]={"Wang",0,"Jia",0,"Li",0,"Zhang",0,"Fun",0}; 
int main()
{
	int i,j;
char leader_name[20]; 
for (i=1;i<=10;i++)
{
	scanf("%s",leader_name); 
for(j=0;j<5;j++)
{
if(strcmp(leader_name,leader[j].name)==0)
{
	leader[j].count++;
}
}
}
printf("\nResult:\n");
for(i=0;i<5;i++)
{
printf("%5s:%d\n",leader[i].name,leader[i].count);
}
return 0;
}



#include <string.h>
#include <stdio.h>
struct person 
{
	char name[20]; 
int count; 
}
leader[5]={"Wang",0,"Jia",0,"Li",0,"Zhang",0,"Fun",0}; 
int main()
{
	int i,j;
char leader_name[20]; 
for (i=1;i<=10;i++)
{
	scanf("%s",leader_name); 
for(j=0;j<5;j++)
{
if(strcmp(leader_name,leader[j].name)==0)
{
	leader[j].count++;
}
}
}
printf("\nResult:\n");
for(i=0;i<5;i++)
{
printf("%5s:%d\n",leader[i].name,leader[i].count);
}
return 0;
}
