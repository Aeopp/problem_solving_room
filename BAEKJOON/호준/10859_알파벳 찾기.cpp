#include <iostream>
#include <string>
#include <array>
#include <algorithm>
#include <iterator>

int main()
{
	using namespace std;
	constexpr uint8_t alphabetNumber{ 'z' - 'a' + 1 };
	constexpr int8_t non_exist{ -1 };
	array<int8_t, alphabetNumber> existTable{};
	existTable.fill(non_exist);
	string input{};
	getline(cin, input);

	const auto convert_offset = [&existTable](const decltype(input)::value_type alphabet)
	{
		const auto convert_index{ static_cast<size_t>(alphabet) - 'a' };
		auto& targetElement = existTable[convert_index];
		static uint8_t alphabet_offset{ 0u };
		if (targetElement == non_exist)
		{
			targetElement = alphabet_offset; 
		}
		++alphabet_offset;
	};
	// ranges::for_each(begin(input), end(input), convert_offset);
	// 	ranges::copy(begin(existTable), end(existTable), ostream_iterator<int>{cout, " "});
	for_each(begin(input), end(input), convert_offset);
	copy(begin(existTable), end(existTable), ostream_iterator<int>{cout, " "});
}