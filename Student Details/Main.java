#include<iostream>
using namespace std;
int main()
{
  int x,b;
  char c[10];
  cout<<"Enter name:\nEnter roll number:\nEnter total marks outof 500:\nStudent details:\n";
  cin>>c>>x>>b;
  cout<<"Name: "<<c<<"\nRoll Number: "<<x<<"\nTotal: "<<b<<"\nPercentage: "<<float(b)/5;
}