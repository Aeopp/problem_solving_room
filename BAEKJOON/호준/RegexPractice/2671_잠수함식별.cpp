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
	auto Sound = string{};
	getline(cin, Sound);
	auto RgExr = regex{R"~((100+1+|01)+)~"};
	const auto Solution = array<string_view, 2>{ "NOISE", "SUBMARINE" };
	std::cout << Solution[static_cast<size_t>(regex_match(Sound, RgExr))];

	return 0;
}