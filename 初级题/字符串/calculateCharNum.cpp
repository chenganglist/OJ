#include <iostream>

#include <string.h>
using namespace std;
//C++���������cin.getline����  cin.get���ַ�  cin>>�ո�ֽ�   cout<<
//memset( s, 0x00, 80 );
//#include <stdio.h> scanf printf
//#include <stdlib.h> malloc free

int main(int argc,char* argv[])
{
	char s[1000],c;
	memset(s,0,1000);  //string.h
	cin.getline(s,1000);
	cin>>c;
	int i,num=0;
	for(i=0;s[i]!='\0';i++)
	{
		if(c == s[i] || c + 'a' - 'A' == s[i])
		{
			num++;
		}
	}
	cout<<num<<endl;
	return 0;
}