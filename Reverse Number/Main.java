#include <iostream>
int main() 
{
	// Type your code here
  int n,x=0,y;
  std::cin>>n;
  while(n>0)
  {
    x=x*10;
    x=x+(n%10);
    n=n/10;
  }
  std::cout<<x;
	return 0;
}