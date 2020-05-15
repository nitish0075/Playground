#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  int x[a][a];
  int sumf = 0, sumb = 0;
  int r = 0, c = a - 1;
  for(int i = 0; i < a; i++) {
    for(int j = 0; j < a; j++) {
      cin>>x[i][j];
      if(i == j)
        sumf += x[i][j];
      if(i == r && j == c) {
        sumb += x[i][j];
        r++;
        c--;
      }
    }
  }
  if(sumf == sumb)
    cout<<"Yes";
  else
    cout<<"No";
  
}