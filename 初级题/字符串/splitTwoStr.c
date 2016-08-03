#include <stdio.h>

int main(int argc,char* argv[])
{
    char s1[100],s2[100];
    gets(s1);
    gets(s2);

    int i,leftNum;
    for(i=0;s1[i]!='\0';i++)
    {
        if( i%8 != 0 || i == 0)
        {
            putchar(s1[i]);
        }else{
            putchar('\n');
            putchar(s1[i]);
        }
    }
    leftNum = 8 - i%8;
    if(leftNum!=8)
    {
        for(i=0;i<leftNum;i++)
        {
            putchar('0');
        }
        putchar('\n');        
    }else
    {
        putchar('\n');
    }

    for(i=0;s2[i]!='\0';i++)
    {
        if( i%8 != 0  || i == 0)
        {
            putchar(s2[i]);
        }else{
            putchar('\n');
            putchar(s2[i]);
        }        
    }

    leftNum = 8 - i%8;
    if(leftNum!=8)
    {
        for(i=0;i<leftNum;i++)
        {
            putchar('0');
        }
        putchar('\n');        
    }else
    {
        putchar('\n');
    }


    return 0;
}