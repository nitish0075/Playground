#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int t,a,b=0,cnt=0;
  cin>>t;
  while(1)
  {
    cin>>a;
    cnt++;
    b+=a;
    if(b>=t)
      break;
  }
  cout<<"The number of turns is "<<cnt;
  return 0;
}