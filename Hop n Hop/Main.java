#include<iostream>
#include<iomanip>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  int x,y;
  std::cin>>x;
  std::cin>>y;
  
  int a=3;
  int b=4;
  int d;
  d= sqrt(pow(x-a,2)+pow(y-b,2));
  std::cout<<d;
}