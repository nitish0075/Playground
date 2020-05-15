#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b;
  cin>>a>>b;
  int x;
  int sum = 0;
  int m = 1, n = b - 2;
  for(int i = 0; i < a; i++) {
    for(int j = 0; j < b; j++) {
      cin>>x;
      if(i == 0 || i == a - 1)
        sum += x;
      else if(i == m && j == n) {
        sum += x;
        m++;
        n--;
      }
      else
        continue;
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum<<endl;
  return 0;
}