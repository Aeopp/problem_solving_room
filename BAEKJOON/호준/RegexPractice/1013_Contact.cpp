\#include <iostream>
#include <regex>
#include <string>
#include <string_view>
#include <array>

int main()
{
	const std::array<std::string, 2> Solution{ "NO", "YES"};
	const std::regex re{ R"((100+1+|01)+)" };

	size_t TestCase{ 0 };
	std::cin >> TestCase;

	for (size_t i = 0; i < TestCase; ++i)
	{
		std::string Problem{};
		std::cin >> Problem;
		std::cout << Solution[static_cast<size_t>(std::regex_match(Problem, re))] << std::endl;
	}
}