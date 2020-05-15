#include<iostream>
using namespace std;
int main()
{
  int n,l,v;
  std::cin>>n;
  int a[n],f[n+1];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  std::cin>>l>>v;
  int p=a[l-1];
  for(int i=0,j=0;i<n;i++,j++)
  {
    if(i==l-1)
    {
      //std::cout<<" "<<i<<" "<<l<<" ";
      //std::cout<<" "<<a[i];
     f[j]=v;
      j++;
      
    }
    else
     f[j]=a[i]; 
  }
  f[l]=p;
  if(l>n)
  {
    std::cout<<"Enter the number of elements in the array\nEnter the elements in the array";
    std::cout<<"\nEnter the location where you wish to insert an element";
    std::cout<<"\nInvalid Input";
  }
  else
  {
    std::cout<<"Enter the number of elements in the array\nEnter the elements in the array";
    std::cout<<"\nEnter the location where you wish to insert an element\nEnter the value to insert";
    std::cout<<"\nArray after insertion is";
    for(int j=0;j<n+1;j++)
    {
      std::cout<<"\n"<<f[j];
    }
  }
}