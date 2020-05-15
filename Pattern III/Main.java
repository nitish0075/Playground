#include<iostream>
int main()
{
  int i,j,n,z;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      z=j;
      
      if(z>=2)
      {
        std::cout<<"*";
        z--;
      }
      std::cout<<i;
    }
    std::cout<<"\n";
  }
  
  for(i=n;i>=1;i--)
  {
    for(j=i;j>=1;j--)
    {
      z=j;
      std::cout<<i;
      if(z>=2)
      {
        std::cout<<"*";
        z--;
      }
      
    }
    std::cout<<"\n";
  }
}