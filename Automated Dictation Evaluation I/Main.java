#include<iostream>
using namespace std;
int main()
{
  std::string s;
  std::getline(std::cin,s);
  std::string s1;
  std::getline(std::cin,s1);
  if(s.compare(s1)==0)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}