#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,o=0,e=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e=e+a[i];
    else
      o=o+a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<e<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<o;
}