#include<iostream>  
#include<string>  
using namespace std;  
  
int main()  
{  
     string s;    
     while(cin>>s)  
     {  
       int n = s.size();  
       if(n<=1)   
       {  
          cout<<s<<endl;  
           return 0;  
       }  
       int lastUp = n-1;  
       for(int i=n-1;i>=0;i--)  
       {  
          if(isupper(s[i]))  
          {  
              int step = lastUp-i;  
              int temp = s[i];  
              for(int j=i+1;j<=lastUp;j++)//平移一位   
              {  
                 s[j-1] = s[j];  
              }  
              s[lastUp] = temp;  
              lastUp--;  
          }  
       }  
       cout<<s<<endl;  
     }  
      return 0;  
}  