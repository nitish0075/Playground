#include <iostream>
using namespace std;
int main()
{
int x,y,z,a;
int d,i;
cin>>x;
cin>>y;
cin>>z;
cin>>a;
  d=1;
i=1;
while(i<=x&&i<=y&&i<=z){
if(x%i==0&&y%i==0&&x%i==0)
d=i;
i++;
}
if(d==a)
  cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";

return 0;
}
