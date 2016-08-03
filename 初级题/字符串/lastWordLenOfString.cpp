#include <iostream>
using namespace std;

int main(int argc,char* argv[])
{
    char s[5000];
    //gets(s);
    cin.getline(s,5000);
    int startPosOfLastWord=0,endPosOfLastWord=0,i;
    for(i=0;s[i]!='\0';i++)
    {
        if(s[i] == ' ')
        {
           startPosOfLastWord = i+1; 
        }
        endPosOfLastWord++;
    }

    if(startPosOfLastWord<endPosOfLastWord)
    {
        cout<<endPosOfLastWord-startPosOfLastWord<<endl;        
    }else
	{
		while(s[endPosOfLastWord-1]==' ')
		{
			endPosOfLastWord--;
		}
		int endPos = endPosOfLastWord;
		while(s[endPosOfLastWord-1]!=' ')
		{
			endPosOfLastWord--;
		}
		int startPos = endPosOfLastWord;
		cout<<endPos-startPos<<endl;
	}


    return 0;
}