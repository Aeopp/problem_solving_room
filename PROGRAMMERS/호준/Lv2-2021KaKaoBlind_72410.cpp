#include <iostream>
#include <string>
#include <regex>
#include <string_view>

// 2021 KAKAO BLIND RECRUITMENT
// 신규 아이디 추천
// https://programmers.co.kr/learn/courses/30/lessons/72410
std::string solution(const std::string_view new_id)
{
	std::string Answer{ new_id };

	// 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
	for (auto& Element : Answer)
		Element = std::tolower(Element);

	// 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
	Answer = std::regex_replace(Answer, std::regex{ R"([^ a-z0-9-_.])" }, R"()");

	// 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
	Answer = std::regex_replace(Answer, std::regex{ R"(([\.]{2,}))" }, R"(.)");

	// 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
	Answer = std::regex_replace(Answer, std::regex{ R"((^\.|\.$))" }, R"()");

	// 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
	if (Answer.empty())
		Answer = "a";

	// 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
	if (Answer.size() > 15)
	{
		Answer = Answer.substr(0, 15);
		// 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		if (Answer.back() == '.')
			Answer.pop_back();
	}

	// 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	if (Answer.size() < 3)
	{
		while (Answer.size() < 3)
			Answer.push_back(Answer.back());
	}

	return Answer;
}
