#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int flag=1,n,sq,cnt=0;
  cin>>n;
  sq=n*n;
  while(sq)
  {
    cnt++;
    sq=sq/10;
  }
  sq=n*n;
  for(int rd=1;rd<cnt;rd++)
  {
    int eq=pow(10,rd);
    if(eq==n)
      continue;
    int s=sq/eq+sq%eq;
    if(s==n)
    {
      cout<<"Kaprekar Number";
      flag=0;
      break;
    }
  }
  if(flag==1)
  {
    cout<<"Not a Kaprekar Number";
  }
  
}