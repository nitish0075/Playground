#include<iostream>
using namespace std;
int main()
{
  std::string s;
  std::getline(std::cin,s);
  for(int i=0;i<s.size();i++)
  {
    if((s[i]>64 && s[i]<91) || (s[i]>96 && s[i]<123))
      std::cout<<s[i];
    else
      continue;
  }
}