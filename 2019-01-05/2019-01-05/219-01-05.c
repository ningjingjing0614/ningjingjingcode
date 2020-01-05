//【数组指针】将数组a中n个整数按相反顺序存放

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


//【长宽高】输入正方体的长宽高l,w,h。求体积及三个面x*y,x*z,y*z的面积。

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
