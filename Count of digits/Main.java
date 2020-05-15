#include<iostream>
using namespace std;
int main() 
{
  int i,n=0;
  do{
    std::cin>>i;
   i=i/10;
   n++;
  } 
  while(i!=0);
   { std::cout<<n;
   }
  return 0;
}