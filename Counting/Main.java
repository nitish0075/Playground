#include<iostream>
using namespace std;
int main()
{
  std::string s;
  std::getline(std::cin,s);
  int n=s.size();
  int v=0,c=0,b=0,d=0,sy=0;
  for(int i=0;i<n;i++)
  {
    if(s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U' || s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
      v++;
    else if(s[i]==' ')
      b++;
    else if(s[i]>47 && s[i]<58)
      d++;
    else if((s[i]<65 || s[i]>90) && (s[i]<97 || s[i]>122))
      sy++;
    else
      c++;
  }
  std::cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<b<<"\nDigits:"<<d<<"\nSymbols:"<<sy;
}