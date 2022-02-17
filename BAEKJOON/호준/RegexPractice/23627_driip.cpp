#include <iostream>
#include <regex>
#include <string>
#include <sstream>
#include <string_view>
#include <array>
#include <tuple>
#include <set>
#include <numeric>
#include <algorithm>
#include <numbers>
#include <map>

int main()
{
	using namespace std;
	regex re{ R"~([a-z]*(driip)$)~" };
	string input;
	getline(cin, input);
	if(regex_match(input,re))
	{
		cout << "cute";
	}
	else
	{
		cout << "not cute";
	}

	return 0;
};