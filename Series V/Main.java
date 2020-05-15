#include<iostream>
using namespace std;
int main()
{
  int n,i=11,x;
  std::cin>>n;
  while(n)
  {
 x=i*i;
    std::cout<<x<<" ";
    
    i=i+4;
    n--;
  }
}