#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int a,b,c,d,dol,cent,count;
  cin>>a>>b>>c>>d;
  dol=a+c;
  cent=b+d;
  count=cent/100;
  if(count!=0)
  {
    dol=dol+count;
    cent=cent-100;
  }
   cout<<dol;
  cout<<"\n"<<cent;
}