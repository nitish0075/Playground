#include<iostream>
using namespace std;
int main()
{
  float mil;
  int lit,dist;
  cin>>mil;
  cin>>lit;
  cin>>dist;
  if(mil*lit<dist)
  {
    cout<<"Cannot reach";
  }
  else
  {
    cout<<"Can reach";
  }
}