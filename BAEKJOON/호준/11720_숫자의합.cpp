#include <iostream>
using namespace std;
#include <vector>
#include <string>

int main()
{
	int sum = 0; 
	int n;
	cin >> n;
	std::string str;
	cin >> str;
	for (const auto& Element : str)
	{
		sum += Element - 48; 
	};
	cout << sum;
};