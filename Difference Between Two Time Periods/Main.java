#include<iostream>
using namespace std;
struct times
{
  int hr,min,sec;
}t1,t2,t3;
int main()
{
  std::cin>>t1.hr>>t1.min>>t1.sec;
  std::cin>>t2.hr>>t2.min>>t2.sec;
  if(t1.sec>t2.sec)
    t3.sec=t1.sec-t2.sec;
  
  if(t2.sec>t1.sec)
  {
    t3.sec=(t1.sec+60-t2.sec);
    t2.min++;
  }
  
  if(t1.min>t2.min)
    t3.min=t1.min-t2.min;
  
  if(t2.min>t1.min)
  {
    t3.min=(t1.min+60-t2.min);
    t2.hr++;
  }
  
  t3.hr=t1.hr-t2.hr;
  std::cout<<t3.hr<<":"<<t3.min<<":"<<t3.sec;
}