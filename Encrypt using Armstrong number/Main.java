#include<iostream>
#include<math.h>

int arm(int n)
{
    int temp=n,temp1=n;
  int sum=0,r,count=0;
  do
  {
    count++;
    temp1/=10;
  }while(temp1!=0);
  
  while(n>0)
  {
    r = n%10;
    sum+=(pow(r,count));
    n=n/10;
  }
  if(temp==sum)
    return 1;
  else
    return 2;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}