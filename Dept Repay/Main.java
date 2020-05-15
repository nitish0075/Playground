#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  std::cin>>x;
  std::cin>>y;
  std::cin>>z;
  int i;
  i= x*y*z/100;
  int a;
  a = x + i;
  double d;
  int e=100;
  d = (i*2)/float(100);
  double s;
  s = a - d;
  std::cout<<i<<"\n";
  std::cout<<a<<"\n";
  std::cout<<d<<"\n";
  std::cout<<s<<"\n";  
}