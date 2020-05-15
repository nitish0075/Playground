#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b, c, sum = 0;
  cin>>a>>b;
  while(a--)
  {
  	cin>>c;
    sum += c;
  }
  cout<<((sum <= b)? "YES": "NO");
    
}