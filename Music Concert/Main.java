#include<iostream>
#include<cstdlib>
int main(){
  // Type your code here
  int n,e=0,o=0;
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
  std::cout<<o;
  std::cout<<"\n"<<e;
  return 0;
}