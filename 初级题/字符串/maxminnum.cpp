#include<iostream>  
#include<algorithm>  
using namespace std;  
int main()  
{  
  
    int n=0, i,count,x,y,min,countmin,temp,liandeng,lianxu;  
    while(cin>>n)  
    {  
        liandeng=0;  
        int *p=new int[n];  
        for(i=0;i<n;i++)  
            cin>>*(p+i);  
        sort(p,p+n);  
        if(n==1)  
        {  
            cout<<0<<" "<<0<<endl;  
            continue;  
        }  
        if(*p==*(p+n-1))  
        {  
            cout<<(n-1)*n/2<<" "<<(n-1)*n/2<<endl;    
            continue;  
        }  
        min=*(p+n-1)-*(p+n-2);  
        countmin=1;  
        for(i=n-2;i>0;i--)  
        {  
              
            temp=*(p+i)-*(p+i-1);  
            if(temp<min)  
            {         
                min=temp;  
                countmin=1;  
                liandeng=0;  
            }  
            else if(temp==min)  
            {  
                while(i>0&&*(p+i-1)==*(p+i+1))  
                {  
                liandeng=liandeng+1;  
                i=i-1;  
                }  
                if(liandeng!=0)  
                {  
                lianxu=(liandeng+2-1)*(liandeng+2)/2-1; //countmin在算法发现连等出现之前已经加了1了，此处要减去。。  
                countmin+=lianxu;  
                i=i+1;  
                }  
                if(liandeng==0)  
                    countmin++;  
                liandeng=0;  
            }  
  
        }  
        x=1;y=1;  
        for(i=1;i<n;i++)  
        {  
            if(*p==*(p+i))  
                x++;  
            else  
                break;  
        }  
        for(i=n-1;i>0;i--)  
        {  
            if(*(p+i)==*(p+i-1))  
                y++;  
            else  
                break;  
        }  
        cout<<countmin<<" "<<x*y<<endl;   
          
    }  
    return 0;  
}  