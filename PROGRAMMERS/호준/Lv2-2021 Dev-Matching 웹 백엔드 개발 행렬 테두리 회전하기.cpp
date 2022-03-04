#include <string>
#include <vector>
#include <array>
using namespace std;

array<pair<int, int>, 4> vector_table
{
	pair<int,int>{0,+1}, // right
	{+1,0}, // down
	{0,-1}, // left
	{-1,0} //up
};

using matrix_type = vector<vector<int>>;
int rotate_dir(const matrix_type& mat, const pair<int,int> pos,
	const vector<int>& queries)
{
	if(pos.first >= queries[0] && pos.first <= queries[2]
		&& pos.second >= queries[1] && pos.second <= queries[3])
	{
		return 0;
	}

	return 1;
}

// 무한 회전 안하게 해야함
// up이였다가 right되면 종료할까?

int rotate(matrix_type& mat, const pair<int,int> pos, const int dir_idx,
	const int new_value,
	const vector<int>& queries,
	const pair<int,int> end_pos)
{
	const int old_value = exchange(mat[pos.first][pos.second], new_value);

	if (pos.first == end_pos.first 
		&& pos.second == end_pos.second)
	{
		return old_value;
	}

	pair<int, int> next_step
	{
		pos.first + vector_table[dir_idx].first,
		pos.second + vector_table[dir_idx].second
	};

	const int new_dir_idx = dir_idx + rotate_dir(mat, next_step, queries);

	next_step =
	{
		pos.first + vector_table[new_dir_idx].first,
		pos.second + vector_table[new_dir_idx].second
	};

	return min(rotate(mat, next_step, new_dir_idx, old_value, queries, end_pos), old_value);
}

using namespace std;

vector<int> solution(int rows, int columns, vector<vector<int>> queries)
{
	matrix_type matrix(rows,vector<int>(columns,0));

	int init_value = 0;

	for(int row=0;row<rows;++row)
	{
		for(int col=0;col<columns;++col)
		{
			matrix[row][col] = ++init_value;
		}
	}

	vector<int> answer;

	const auto queries_row_size = queries.size();
	for(int i=0;i< queries_row_size;++i)
	{
		const auto queries_cur_col_size = queries[i].size();
		for(int j=0;j< queries_cur_col_size;++j)
		{
			--queries[i][j];
		}
		const auto init_pos = pair<int, int>{queries[i][0], queries[i][1]};
		const auto end_pos = pair<int, int>{ init_pos.first + 1,init_pos.second };

		const auto init_new_value = matrix[end_pos.first][end_pos.second];
		answer.emplace_back(rotate(matrix, init_pos, 0, init_new_value, queries[i], end_pos));
	}

	return answer;
}

int main()
{
	int rows = 100;
	int columns = 97;
	vector<vector<int>> queries
	{
		{1,1,100,97},
		//{1,2,2,3},
		//{2,1,3,2},
		//{2,2,3,3}
	};
	solution(rows, columns, queries);
}