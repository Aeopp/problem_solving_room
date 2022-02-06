#include <iostream>
#include <map>
using namespace std;

int main()
{
	size_t N = 0;
	cin >> N;
	int32_t NumberToCount = 99;

	// 계산할 필요 없음 (답이 정해져 있음)
	std::map<size_t, size_t> FixedAnswer
	{
		{NumberToCount + 1, NumberToCount}
		,{1000,144}
	};

	// 한수의 개수가 m이라 할 때
	// 100 아래면 두자리 숫자이므로 당연히 n = m
	if (N < 100)
	{
		cout << N;
		return  0;
	}

	auto isFixedAnswer = FixedAnswer.find(N);
	if (isFixedAnswer != std::end(FixedAnswer))
	{
		std::cout << isFixedAnswer->second;
		return 0;
	}
	
	for (int i = (int)NumberToCount + 1; i <= N; ++i)
	{
		const int left = i / 100;
		const int mid = (i / 10) % 10;
		const int right = i % 10;

		if (left - mid == mid - right)
		{
			NumberToCount++;
		};
	};

	std::cout << NumberToCount;
	return 0;
};
