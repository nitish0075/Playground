#include<iostream>
int main()
{
  int n,i=1;
  int z=i;
  std::cin>>n;
  for(int j=n;j<=n+3;j++)
  {
    while(i)
    {
      std::cout<<j;
      i--;
    }
    std::cout<<"\n";
    i=z+1;
    z=i;
  }

  for(int j=n+3;j>=n;j--)
  {
    i--;
    while(i)
    {
      std::cout<<j;
      i--;
    }
    std::cout<<"\n";
    i=z-1;
    z=i;
  }
}