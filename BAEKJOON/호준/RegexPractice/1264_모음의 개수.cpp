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

	string CurInput;
	const string_view EndSymbol = "#"sv;
	while (true)
	{
		std::getline(std::cin, CurInput);
		if (EndSymbol == CurInput)
			return 0;

		const auto SearchOption
		{
			regex_constants::optimize
			| regex_constants::extended
		};

		const regex ReExpr(R"([aAeEiIoOuU])", SearchOption);
		auto OnlyNeedTheNumber
		{
			regex_constants::format_no_copy
		};

		auto ResultRange = make_tuple
		(
			sregex_iterator
			{
				cbegin(CurInput), cend(CurInput),ReExpr, OnlyNeedTheNumber
			}
			, sregex_iterator{}
		);

		std::cout << std::distance(get<0>(ResultRange), get<1>(ResultRange)) << std::endl;
	}

	return 0;
}