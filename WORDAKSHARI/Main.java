#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char a[30][30];
  int i,n=0;
  for(i=0;i<5;i++)
  {
    cin.getline(a[i],30);
    n++;
    if(!strcmp(a[i],"####"))
      break;
  }
  for(i=0;i<n-1;i++)
  	std::cout<<a[i]<<"\n";
}