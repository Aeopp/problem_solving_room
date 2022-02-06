#include <iostream>
#include <vector>
#include <numeric>
#include <array>

constexpr size_t NumberSize{ 10001 };
std::array<bool, NumberSize> SelfNumberTable;

void InitializeConstructor(const size_t CalcRange/*[ 1, Range )*/)
{
    for (size_t CurrentNumber = 1; CurrentNumber < CalcRange; ++CurrentNumber)
    {
        // 자릿수 합??
        size_t SunOfDigits = 0;
        for (size_t j = CurrentNumber; j != 0; j /= 10)
        {
            SunOfDigits += j % 10;
        }

        // d(n) = 셀프넘버아님
        size_t isNotSelfNumber = CurrentNumber + SunOfDigits;
        if (isNotSelfNumber < SelfNumberTable.size())
        {
            // 마킹
            SelfNumberTable[isNotSelfNumber] = false;
        }
    }

};

int main()
{
    SelfNumberTable.fill(true);
    InitializeConstructor(10001);
    for (size_t i = 1; i < 10001; ++i)
    {
        if (SelfNumberTable[i])
            std::cout << i << std::endl;
    }
}