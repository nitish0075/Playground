#include<iostream>
int main()
{
    // Type your code here
  int r,c;
  std::cin>>r>>c;
  int m1[r][c],m2[c][r];
  
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      std::cin>>m1[i][j];
  
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      m2[j][i]=m1[i][j];
  
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
      std::cout<<m2[i][j]<<" ";
    std::cout<<"\n";
  }
}