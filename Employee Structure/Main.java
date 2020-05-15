#include<iostream>
using namespace std;
struct emp
  {
    std::string name;
    int eid;
    int age;
    std::string designation;
    int sal;
  }s1;
int main()
{
  std::cout<<"Enter name:";
  std::cin>>s1.name;
  std::cout<<"\nEnter ID:";
  std::cin>>s1.eid;
  std::cout<<"\nEnter age:";
  std::cin>>s1.age;
  std::cout<<"\nEnter designation:";
  std::cin>>s1.designation;
  std::cout<<"\nEnter Salary:";
  std::cin>>s1.sal;
  std::cout<<"\nEmployee Details";
  std::cout<<"\nName of the Employee : "<<s1.name;
  std::cout<<"\nID of the Employee : "<<s1.eid;
  std::cout<<"\nAge of the Employee : "<<s1.age;
  std::cout<<"\nDesignation of the Employee : "<<s1.designation;
  std::cout<<"\nSalary of the Employee : "<<s1.sal;
}