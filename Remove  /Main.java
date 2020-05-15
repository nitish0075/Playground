#include<iostream>
using namespace std;
int main()
{
  std::string s;
  std::getline(std::cin,s);
  std::string s1="the";
  int found=-1;
  do
  {
    found=s.find(s1,found+1);
    if(found!=-1)
    {
      s=s.substr(0,found-1)+s.substr(found+s1.length());
    }
  }while(found!=-1);
  std::cout<<s;
}