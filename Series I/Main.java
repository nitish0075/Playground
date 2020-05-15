#include<iostream>
int main()
{
int n;
  float i=0.5;
  std::cin>>n;
  while(n)
  {
  std::cout<<i<<" ";
    
    i=i*3;
    n--;
  }
}