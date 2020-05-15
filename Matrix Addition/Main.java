#include<iostream>
using namespace std;
int main()
{
  int r,c;
  std::cin>>r>>c;
  int f[r][c],a[r][c],b[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>b[i][j];
    }
  }
  
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      f[i][j]=a[i][j]+b[i][j];
    }
  }
  
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cout<<f[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}