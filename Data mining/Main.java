#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,nn,o,e,even=0,odd=0,cnt,i;
  cin>>n;
  nn=n;
  cnt=3;
  for(i=1;i<=cnt;i++)
  {
    if(i%2==0)
    {
      e=n%10;
      n=n/10;
      even=even+e;
    }
    else
    {
      o=n%10;
      n=n/10;
      odd=odd+o;
    }
  }
  if(even==odd)
    cout<<"Yes";
  else
    cout<<"No";

}