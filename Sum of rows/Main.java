#include<iostream>
using namespace std;
int main()
{
  int r,c;
  std::cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      std::cin>>a[i][j];
  int f[r];
  for(int i=0;i<r;i++)
    f[i]=0;
  
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      f[i]=f[i]+a[i][j];
    std::cout<<f[i]<<"\n";
  }
}