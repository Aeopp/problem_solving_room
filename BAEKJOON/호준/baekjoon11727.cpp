#include <iostream>
using namespace std;

using int32 = int;
using uint32 = unsigned int;
using uint8 = unsigned char;
using int8 = char;

int32 Data[1000];

// 고유한 경우의 수   n = 1     1  

// n = 2      1 or 2

int32 Tileing(int32 Number)
{
	if (Number == 1) { return 1; }
	if (Number == 2) { return 3; }
	if (Data[Number] != 0) { return Data[Number]; }
	return Data[Number] =( Tileing(Number - 1) + 2 * Tileing(Number - 2))%10'007;
}

int main()
{
	uint32 TargetNumber;
	cin >> TargetNumber;
	cout << Tileing(TargetNumber);

}