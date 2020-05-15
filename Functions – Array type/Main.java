#include<iostream>
using namespace std;
int main()
{
  int n,e=0,o=0,m=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e++;
    else
      o++;
  }
  std::cout<<"Enter the number of elements in the array";
  std::cout<<"\nEnter the elements in the array\n";
  if(e==n)
    std::cout<<"The array is Even";
  else if(o==n)
    std::cout<<"The array is Odd";
  else
    std::cout<<"The array is Mixed";
}