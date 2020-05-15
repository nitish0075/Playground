#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m;
  cin>>n;
  cin>>req;
  int a = pow(m,n);
  if(a<req)
    cout<<"Sorry Doctor! You need more bacteria.";
  else
    cout<<"Doctor, you can proceed with your experiment.";
  
  return 0;
}