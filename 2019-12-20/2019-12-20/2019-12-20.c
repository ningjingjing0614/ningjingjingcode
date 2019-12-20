#include <stdio.h>
int main()
{
	float average(float array[],int n);
	float score1[35]={87,88,89,67,78,90,79,78,67,89,70,89,90,98,87,67,56,78,59,60,79,50,78,90,95,92,93,83,92,78,36,48,50,27,49};
	float score2[30]={75,78,67,90,87,93,83,72,82,91,87,76,58,92,94,59,78,58,69,87,76,72,73,84,56,78,90,27,46,78};
	printf("The average of class A is %5.2f\n",average(score1,35));
    printf("The average of class B is %5.2f\n",average(score2,30));
	return 0;
}
float average(float array[],int n)
{
	int i;
	float aver,sum=array[0];
	for(i=1;i<n;i++)
		sum=sum+array[i];
	aver=sum/n;
	return(aver);
}
# include <stdio.h>
int test(int a,int b,int c);
int s1,s2,s3;
void main(){
    int v,l,w,h;
    printf("please input long,width,height: ");
    scanf("%d,%d,%d",&l,&w,&h);
    v=test(l,w,h);
    printf("v=%d,s1=%d,s2=%d,s3=%d\n",v,s1,s2,s3);
}
int test(int a,int b,int c){
    int v;
    v=a*b*c;
    s1=a*b;
    s2=b*c;
    s3=a*c;
    return v;
}
# include <stdio.h>
int main()
{
	void inv(int x[],int n);
	int i,a[10]={5,6,2,8,4,9,5,3,7,1};
	printf("The original arrray:\n");
	for(i=0;i<10;i++)
		printf("%d",a[i]);
	printf("\n");
	inv(a,10);
	printf("The array has been inverted:\n");
	for(i=0;i<10;i++)
		printf("%d",a[i]);
	printf("\n");
	return 0;
	}
	void inv(int x[],int n)
	{
		int temp,i,j,m=(n-1)/2;
		for(i=0;i<=m;i++)
		{
			j=n-1-i;
			temp=x[i];x[i]=x[j];x[j]=temp;
		}
		return;
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
