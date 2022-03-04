

#include <string>
#include <vector>
#include <algorithm>
#include <numeric>
using namespace std;

int solution(vector<vector<int>> triangle)
{
	auto max_table = triangle;
	int answer = 0;
	const int bottom = triangle.size() -1;
	for (int floor = 0; floor < bottom; ++floor)
	{
		const int floor_size = floor + 1;

		for (int index = 0; index < floor_size; ++index)
		{
			const int cur_value = max_table[floor][index];
			const int look_down = floor + 1;
			const int left = index;
			const int right = index + 1;

			max_table[look_down][left] = max(triangle[look_down][left] + cur_value, max_table[look_down][left]);
			max_table[look_down][right] = max(triangle[look_down][right] + cur_value, max_table[look_down][right]);
			// answer = max_element(left_max, right_max, answer);
		}
	}

	answer = *max_element(begin(max_table[bottom]), end(max_table[bottom]));

	return answer;
}

//int main()
//{
//	cout << solution(vector<vector<int>>
//	{
//		{7},
//		{3,8},
//		{8,1,0},
//		{2,7,4,4},
//		{4,5,2,6,5}
//	});
//}