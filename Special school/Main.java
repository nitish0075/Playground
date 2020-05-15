#include<iostream>
using namespace std;
int main()
{
  std::string s1;
  std::getline(std::cin,s1);
  std::string s2;
  std::getline(std::cin,s2);
  int n=s1.size();
  int m=0;
  for(int i=0,j=n-1;i<n,j>=0;i++,j--)
  {
    if(s1[i]==s2[j])
       m++;
    else
      m=0;
  }
  if(m==n)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}