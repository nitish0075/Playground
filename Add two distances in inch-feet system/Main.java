#include<iostream>
using namespace std;
struct dist
{
  int ft;
  float inch;
}d1,d2,d3;
int main()
{
  std::cin>>d1.ft;
  std::cin>>d1.inch;
  std::cin>>d2.ft;
  std::cin>>d2.inch;
  d3.inch=d1.inch+d2.inch;
  d3.ft=d1.ft+d2.ft;
  if(d3.inch>=12)
  {
    d3.inch=d3.inch-12.0;
    d3.ft++;
  }
  std::cout<<d3.ft<<"'-"<<d3.inch<<'"';
}