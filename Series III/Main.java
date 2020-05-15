#include<iostream>
int main()
{
int n,i=6,x=1;
  std::cin>>n;
  while(n)
  {
  std::cout<<i<<" ";
    i=i+(x*5);
    x++;
   n--;
  }
  return 0;
}