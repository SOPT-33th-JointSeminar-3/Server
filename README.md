## Project
**✈️ 대한항공 KOREAN AIR**
> **SOPT 33th JointSeminar-웹3조**  
> **프로젝트 기간 : 2023.11.18 ~ 2023.11.27**

--- 
<br>

## TEAM
|<img width="200" src="https://github.com/SOPT-33th-JointSeminar-3/Server/assets/76610340/5bdb6ee2-300c-4d2a-8dbb-008af448afe0">|<img width="200" src="https://github.com/SOPT-33th-JointSeminar-3/Server/assets/76610340/a4f9cc94-31df-4512-89df-cb5521f3e4cf">|
|:---:|:---:|
|임주민|윤정원|
|[jumining](https://github.com/jumining)|[gardening-y](https://github.com/gardening-y)|

<br>

## Architecture

<br>



## ER Diagram
<img width="910" alt="스크린샷 2023-11-22 17 02 47" src="https://github.com/SOPT-33th-JointSeminar-3/Server/assets/76610340/746f56f0-599b-4e62-a4e5-b042c322646f">

<br>
<br>

## Task
> [JointSeminar-3조 SERVER](https://shadow-shark-5d9.notion.site/KOREAN-AIR-3-SERVER-0631c0575dfe44fbb6f095b0a85b1943?pvs=4)


| 기능 | 담당자 |
|:----------|:----:|
| `GET` 전체 게시물 조회 | 임주민 |
| `GET` 출발지 목적지 국가 검색 | 윤정원 |
| `GET` 전체 항공권과 좌석 조회 | 임주민 |
| `POST` 항공권 예약하기 | 윤정원 |
| ⚙️ 프로젝트 셋팅 | 윤정원 |
| ⚙️ 깃헙 세팅 | 임주민 |
| 🌐 배포 | 윤정원 |

<br>

## Directory
```
├── JointSeminarApplication.java
├── 🗂️ common
│   ├── 🗂️ dto
│   └── 🗂️ exception
├── 🗂️ config
├── 🗂️ controller
│   └── 🗂️ domain
├── 🗂️ domain
├── 🗂️ dto
│   ├── 🗂️ request
│   └── 🗂️ response
├── 🗂️ repository
└── 🗂️ service
```

<br>



## Git Flow & Convention


```
1. Issue를 생성
2. feature Branch를 생성 (ex.feat/상세기능설명)
3. Add - Commit - Push - Pull Request
4. 작성자 이외의 다른 팀원이 Code Review
5. Code Review가 완료되면 dev Branch로 merge
```

- 개발 중 default 브랜치는 dev 브랜치
- 작은 기능 구현 했을 때마다 자주 커밋
- 커밋 메세지는 첫글자는 대문자로 영문으로 작성
- 코드 포맷팅 : `ctrl + alt + l`(window), `command + option + l`(mac)
- 미사용 Import문 삭제 : `ctrl + alt + o`
  
<br>


