# problem_solving_room
알고리즘 문제풀이 공유 ^_^

풀어볼 사이트는 다음과 같습니다.
- https://www.acmicpc.net/
- https://programmers.co.kr/learn/challenges




아름답게 ReadMe를 작성해보자
TODO :: 추후에 지워주세요

# Deferred Shading

---

- 지연 쉐이딩 기법으로 레벨에 조명을 여럿 설치해 게임의 분위기를 살렸습니다.
- 원작 리소스를 최대한 활용할 수 있게 쉐이딩 방식으로 PBR을 사용했습니다.
- 명암차이를 풍부하게 표현하고자 HDR을 구현하여 적용했습니다.

---

![Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/Shading_Before_After.png](Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/Shading_Before_After.png)

![Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/pbr_example2.png](Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/pbr_example2.png)

---

![Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/_.png](Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/_.png)

![**HDR을 구현하여 밝은 부분과 어두운 부분의 차이가 극대화 됩니다.**](Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/_____.png)

**HDR을 구현하여 밝은 부분과 어두운 부분의 차이가 극대화 됩니다.**

---

![**구현한 에디터로 조명 매개변수를 조절하며 다수의 조명을 설치하는 모습. (*아래 동영상 참조*)**](Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/Shading_Editor_.png)

**구현한 에디터로 조명 매개변수를 조절하며 다수의 조명을 설치하는 모습. (*아래 동영상 참조*)**

---

![**HDR 톤매핑 구현부 HLSL 톤매핑 방식으로 *Filmic tone map* 사용했습니다.**](Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/Untitled.png)

**HDR 톤매핑 구현부 HLSL 톤매핑 방식으로 *Filmic tone map* 사용했습니다.**

![**방향 조명 Deferred Shading HLSL 구현부입니다.**](Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/pbr.png)

**방향 조명 Deferred Shading HLSL 구현부입니다.**

---

🎞️ ***시연 영상***

[Light Editor](https://youtu.be/UWem1xHJZOY)

![Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/QR_LightEditor.png](Deferred%20Shading%20afd97e653525413d9bdaf53d6728e70c/QR_LightEditor.png)
