#include<iostream>
using namespace std;
int main()
{
  int wa = 75;
  int wc = 30;
  int wt,a,c;
  cin>>wt;
  cin>>a;
  cin>>c;
  int d;
  d = wa*a + wc*c;
  if(wt>d)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}