#include<iostream>
using namespace std;
int main()
{
  std::string s;
  std::getline(std::cin,s);
  std::cout<<"The number of letters in the name is "<<s.size();
}