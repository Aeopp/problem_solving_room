#include <iostream>
#include <regex>
#include <string>
#include <string_view>
#include <array>
#include <sstream>
#include <tuple>
#include <set>
#include <numeric>
#include <algorithm>

int main()
{
	using namespace std;
	using namespace string_view_literals;
	auto TestCase = size_t{ 5u };
	auto FBILine = set<size_t>{};
	const auto RgExr = regex{ R"~(.*FBI.*)~", regex_constants::optimize };
	
	for (size_t i = 0; i < TestCase; ++i)
	{
		string AgentName{};
		getline(cin, AgentName);
		const bool result = regex_match(AgentName, RgExr, regex_constants::format_no_copy);
		if (result)
		{
			FBILine.insert(i + 1u);
		}
	}

	if (false == FBILine.empty())
	{
		copy(begin(FBILine), end(FBILine),
			ostream_iterator<int>(cout," "));
	}
	else
	{
		cout << "HE GOT AWAY!" << endl;
	}
	
	
	return 0;
}