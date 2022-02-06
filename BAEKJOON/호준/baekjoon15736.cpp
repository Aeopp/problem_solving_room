#include <iostream>
#include <cmath>

using namespace std;

/* n 이하의 제곱수의 개수를 구하는 함수 */
int CountSquares(int n) {
	for (int i = n; 1 <= i; --i) {
		double SquareRoot = sqrt(i);
		int IntPart = floor(SquareRoot);
		/* 만약 근이 정수이면 */
		if (SquareRoot - IntPart == 0) {
			return IntPart;
		}
	}
}

int main() {
	int N;
	cin >> N;

	cout << CountSquares(N);
}