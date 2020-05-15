#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int month,n1=0,n2=1,fib=0;
  cin>>month;
  if(month==1)
    cout<<"0";
  else if(month==2)
    cout<<"1";
  else
  {
    while(month>2)
    {
      fib=n1+n2;
      n1=n2;
      n2=fib;
      month--;
    }
  }
  cout<<fib;
  
}