//按以下规律将电文变成密码：将字母A变成字母E，a变成e，即变成其后的第4个字母，W变成A，X变成B，Y变成C，Z变成D
//解密的程序：
#include<stdio.h>
			void main()
		{
			int i,n;
			char s[80];
			gets(s);
			n=strlen(s);
			for(i=0;i<n;i++)
				if(s[i]>='A'&&s[i]<='Z')
					s[i]=(s[i]-'A'+22)%26+'A';
				else if(s[i]>='a'&&s[i]<='z')
					s[i]=(s[i]-'a'+22)%26+'a';
				puts(s);
		}
