#include<iostream>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int eyear;
  float per;
}s[10];

int main()
{
  int n;
  std::cout<<"Enter the number of colleges";
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    std::cout<<"\nEnter the details of college "<<i+1;
    std::cout<<"\nEnter name";
    std::cin>>s[i].name;
    std::cout<<"\nEnter city";
    std::cin>>s[i].city;
    std::cout<<"\nEnter year of establishment";
    std::cin>>s[i].eyear;
    std::cout<<"\nEnter pass percentage";
    std::cin>>s[i].per;
  }
  std::cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
    std::cout<<"\nCollege:"<<i+1;
    std::cout<<"\nName:"<<s[i].name;
    std::cout<<"\nCity:"<<s[i].city;
    std::cout<<"\nYear of establishment:"<<s[i].eyear;
    std::cout<<"\nPass percentage:"<<s[i].per;
  }
}