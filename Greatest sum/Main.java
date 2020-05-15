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
  
  int r1=0,r2=0,r3=0,c1=0,c2=0,c3=0,max=0;
  if(r==3)
  {
    for(int i=0;i<c;i++)
    {
       c1=c1+a[i][0];
        c2=c2+a[i][1];
        c3=c3+a[i][2];
    }
      for(int j=0;j<r;j++)
      {
        r1=r1+a[0][j];
        r2=r2+a[1][j];
        r3=r3+a[2][j];
      }
    std::cout<<"Sum of rows is "<<r1<<" "<<r2<<" "<<r3<<"\n";
    if(r1>r2 && r1>r3)
      std::cout<<"Row 1 has maximum sum";
    else if(r2>r1 && r2>r3)
      std::cout<<"Row 2 has maximum sum";
    else
      std::cout<<"Row 3 has maximum sum";
    std::cout<<"\nSum of columns is "<<c1<<" "<<c2<<" "<<c3<<"\n";
    if(c1>c2 && c1>c3)
      std::cout<<"Column 1 has maximum sum";
    else if(c2>c1 && c2>c3)
      std::cout<<"Column 2 has maximum sum";
    else
      std::cout<<"Column 3 has maximum sum";
  }
  
  if(r==2)
  {
    for(int i=0;i<c;i++)
    {
       c1=c1+a[i][0];
        c2=c2+a[i][1];
    }
      for(int j=0;j<r;j++)
      {
        r1=r1+a[0][j];
        r2=r2+a[1][j];
      }
    std::cout<<"Sum of rows is "<<r1<<" "<<r2<<"\n";
    if(r1>r2)
      std::cout<<"Row 1 has maximum sum";
    else if(r2>r1)
      std::cout<<"Row 2 has maximum sum";
    std::cout<<"\nSum of columns is "<<c1<<" "<<c2<<"\n";
    if(c1>=c2)
      std::cout<<"Column 1 has maximum sum";
    else if(c2>c1)
      std::cout<<"Column 2 has maximum sum";
  }
}