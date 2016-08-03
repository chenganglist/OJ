#include <stdio.h>

//c语言输入输出整行：gets、puts
//格式化输入输出： printf(), scanf()
//大小写转换： ms+'a'-'A'
int main(int argc,char* argv[])
{
    char s[1000],ms;
    gets(s);
    scanf("%c",&ms);
    int i,num=0;
    for(i=0;s[i]!='\0';i++)
    {
        if(ms == s[i] || ms+'a'-'A' == s[i] )
        {
            num++;
        }
    }
    printf("%d\n",num);
    return 0;
}