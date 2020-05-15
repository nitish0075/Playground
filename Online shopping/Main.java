#include<iostream>
using namespace std;
int main()
{
  int famt,fdis,fsc,samt,sdis,ssc,aamt,adis,asc;
  cin>>famt;
  cin>>fdis;
  cin>>fsc;
  cin>>samt;
  cin>>sdis;
  cin>>ssc;
  cin>>aamt;
  cin>>adis;
  cin>>asc;
  int ff = famt-(famt*fdis)/100 + fsc;
  int fs = samt-(samt*sdis)/100 + ssc;
  int fa = aamt-(aamt*adis)/100 + asc;
  
  cout<<"In Flipkart Rs."<<ff<<"\n";
  cout<<"In Snapdeal Rs."<<fs<<"\n";
  cout<<"In Amazon Rs."<<fa<<"\n";
  
  if(ff==fs && ff<fa && fs<fa)
  {
    cout<<"He will prefer Flipkart";
  }
  else if (ff==fs && ff>fa && fs>fa)
  {
    cout<<"He will prefer Amazon";
  }
  else if (ff<fs && ff<fa)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(fs<ff && fs<fa)
  {
    cout<<"He will prefer Snapdeal";
  }
  else
  {
    cout<<"He will prefer Amazon";
  }
}