#include <iostream>
#include <regex>
#include <string>
#include <string_view>
#include <array>
#include <sstream>
#include <tuple>

int main()
{
	using namespace std;
	using namespace string_view_literals;
	string Document;
	string TargetWord;
	getline(std::cin, Document);
	getline(std::cin, TargetWord);
	auto ReExpr = regex{ TargetWord, regex_constants::optimize };
	auto MatchIter = regex_iterator
	{   
		cbegin(Document), cend(Document), 
		ReExpr, regex_constants::format_no_copy
	};
	std::cout << distance(MatchIter, decltype(MatchIter){});

	return 0;
}