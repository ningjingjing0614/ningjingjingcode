//1. 将数组A中的内容和数组B中的内容进行交换。（数组一样大） 
//2. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。 
//3. 编写程序数一下 1到 100 的所有整数中出现多少次数字9。 
/*1.在屏幕上输出以下图案： 
* 
*** 
***** 
******* 
********* 
*********** 
************* 
*********** 
********* 
******* 
***** 
*** 
* 

2.求出0～999之间的所有“水仙花数”并输出。 
“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋5＋3?，则153是一个“水仙花数”。 
在数论中，水仙花数（Narcissistic number）也称为自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong number），是指一N位数，其各个数之N次方和等于该数。 
例如153、370、371及407就是三位数的水仙花数，其各个数之立方和等于该数： 
153 = 1^3 + 5^3 + 3^3。 
370 = 3^3 + 7^3 + 0^3。 
371 = 3^3 + 7^3 + 1^3。 
407 = 4^3 + 0^3 + 7^3。 
3.求Sn=a+aa+aaa+aaaa+aaaaa的前5项之和，其中a是一个数字， 
例如：2+22+222+2222+22222 
1.完成猜数字游戏。 

2.写代码可以在整型有序数组中查找想要的数字， 
找到了返回下标，找不到返回-1.（折半查找） 

3.编写代码模拟三次密码输入的场景。 
最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 
可以重新输入，最多输入三次。三次均错，则提示退出程序。 

4.编写一个程序，可以一直接收键盘字符， 
如果是小写字符就输出对应的大写字符， 
如果接收的是大写字符，就输出对应的小写字符， 
如果是数字不输出。 */

//1. 将数组A中的内容和数组B中的内容进行交换。（数组一样大） 
//#include<stdio.h>
//void swap_arr(int arri[5],int arrj[5])
//	int a;
//{
//	a=arr1[];
//	arr1[]=arr2[];
//	arr2[]=a;
//}
//int main()
//{
//	swap_arr(int arri[5],int arrj[5]);
//	int arr1[5]={1,2,3,4,5};
//	int arr2[5]={0,9,8,7,6};
//	{
//		swap_arr(int arr1[5],int arr2[5]);
//		printf("%d,%d",arr1[5],arr2[5]);
//	}
//	return 0;
//}
//2. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
//#include<stdio.h>
//int main()
//{
//	int i;
//	double a=0;
//	for (i=1 ;i<=100 ;i++)
//	{
//		if(i % 2==1)
//		{
//			a+= 1.0/i;
//		}
//		else if(i % 2==0)
//		{
//			a-= 1.0/i;
//		}
//	}
//	printf("sum = %lf\n",a);
//	return 0;
//}
//3. 编写程序数一下 1到 100 的所有整数中出现多少次数字9。
//#include<stdio.h>
//int main()
//{
//	int a;
//	int i=0;
//	for (a=1 ;a<=100 ;a++)
//	{
//	if (a % 10==0)
//		i++;
//	}
//	printf("number of times = %d\n",i);
//return 0;
//}
//*1.在屏幕上输出以下图案： 
//#include<stdio.h>
//int main()
//{
//	int i,j;
//	for (i=0 ;i<8 ;i++)
//	{
//	for (j=0 ;j<i ;j++)
//		{
//			printf("*");
//	}
//	printf("\n");
//	}
//	for (i=8; i>0 ;i--)
//	{
//		for (j=i ;j>0; j--)
//			printf ("*");
//
//	printf("\n");
//	}
//return 0;
//}
//2.求出0～999之间的所有“水仙花数”并输出。
//#include <stdio.h>
//int main()
//{
//int i,a,b,c,w;
//for (i=100 ;i<1000 ;i++)
//{
//	a = i/100;
//	b = (i-a*100)/10;
//	c = i%10;
//	if (i== a*a*a + b*b*b + c*c*c)
//		printf("%d\n",i);
//}
//	return 0;
//}
//3.求Sn=a+aa+aaa+aaaa+aaaaa的前5项之和，其中a是一个数字， 
////例如：2+22+222+2222+22222 
//#include<stdio.h>
//int main()
//{
//	int a,i;
//	printf("请输入一个一位数：");
//	scanf("%d",&a);
//	{
//		i=a*11111 +a*1111 +a*111 +a*11 +a;
//	}
//	printf("和为 %d\n",i);
//	return 0;
//}
