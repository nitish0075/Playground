#include <cstring>
#include <iostream>
int main()
{
  std::string s;
  std::getline(std::cin,s);  
  int cnt=0;
  int n=s.size();
  for(int i=0;i<n;i++)
  {
    if(s[i]==' ')
    {
      cnt++;
    }
  }
  if(cnt<=9)
    std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
}