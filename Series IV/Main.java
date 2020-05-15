#include<iostream>
using namespace std;
int main()
{
  int n,i=2,x;
  std::cin>>n;
  std::cout<<"0"<<" ";
  while(n-1)
  {
    //std::cout<<"0"<<" ";
  if(i%2==0)
  {
  x=i*i;
    std::cout<<x-2<<" ";
  }
  else
  {
  x=i*i;
       std::cout<<x-1<<" ";
    
  }
    i++;
  n--;
  }
}