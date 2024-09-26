<h1 align='center'> <img src='https://github.com/user-attachments/assets/577abd23-7965-441c-abd4-6769499901ee' style='width: 300px; height: 200px;'>&nbsp;</h1>

<h1  align='center'>🏥💊병원 & 약국 지도 프로젝트</h1>
<div align='center'>
  <h3>
    🔗 <a href="">AWS 나중에 추가할 예정</a> 사이트 바로가기
  </h3>
</div>
<br/><br/>



## 목차
- [개요](https://github.com/k-codingmachine/SpringBoot-React#-개요)
- [기술 스택](https://github.com/k-codingmachine/SpringBoot-React#-기술-스택)
- [프로젝트 설계](https://github.com/k-codingmachine/SpringBoot-React#-프로젝트-설계)
- [핵심 기능](https://github.com/k-codingmachine/SpringBoot-React#-핵심-기능)
- [주요기능 실행화면](https://github.com/k-codingmachine/SpringBoot-React#-주요기능-실행화면)
- [개선사항](https://github.com/k-codingmachine/SpringBoot-React#-개선사항)
- [후기](https://github.com/k-codingmachine/SpringBoot-React#-후기)
  
  


## 🚩 개요
- 프로젝트 목표 : 다양한 `API`를 활용한 `SPRINGBOOT` , `REACT` 병원 & 약국 지도 프로젝트
- 개발기간 : 24/08/19 ~ 24/09/24



## 🔧 기술 스택
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/spring Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white"/>
<img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=black">
<img src="https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white">
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
  <br>
<img src="https://img.shields.io/badge/kakaotalk-ffcd00.svg?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/google-4285F4?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/bootstrap-%238511FA.svg?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">





## 👾 프로젝트 설계(DIAGRAM)
<details><summary>프로젝트 설계</summary>   
<div align="center">          

![config](https://github.com/user-attachments/assets/8755da23-b900-4ca7-80c1-6e7392a067b3)
![controller](https://github.com/user-attachments/assets/d27a5acc-8ff4-41a5-b38c-0c7f4294a19a)
![dto](https://github.com/user-attachments/assets/8bc501af-f384-4a39-b000-8d41fbab2ffb)
![entity](https://github.com/user-attachments/assets/c7c4c255-a299-4bc5-9e9a-68dabffd1176)
![jwt](https://github.com/user-attachments/assets/2e1c439c-eb12-453c-8664-29486dc3a816)
![oauth2](https://github.com/user-attachments/assets/b3b9d5bf-a6b7-4aaf-bb7c-b1cfc327ad14)
![react](https://github.com/user-attachments/assets/76c408ed-193a-4cd6-a947-ac766eab8382)
![repository](https://github.com/user-attachments/assets/9edb0726-4254-48e4-a12c-7bfabb097039)
![service](https://github.com/user-attachments/assets/7878ea31-6d1b-4143-91c7-ebebb3f4eb2d)
![serviceHospital](https://github.com/user-attachments/assets/afae578e-eb6f-4fc4-b89a-39866019c2e3)

</div>            
</details>



## 💻 핵심 기능



#### 검색
- 공공 데이터를 활용해 약국 & 병원 정보 DB저장
- 약국 & 병원 검색(키워드 검색, 지역 검색)
- 무한스크롤


#### 유저
- JWT, REFRESH 토근을 이용한 로그인 및 로그아웃
- 소셜 로그인 및 간편 회원가입
- 아이디 중복 처리
- 비밀번호 암호화 처리
- 비밀번호 확인


#### 지도
- 줌에 따라 일정 범위의 클러스터 조절
- 현재 위치 지도에 표시
- 다른 지역 검색 시 해당 위치로 지도 위치 변경


#### 리뷰
- 회원에 한해서 리뷰 작성
- 비회원은 리뷰 보는 것만 가능
- 본인이 쓴 리뷰 삭제 가능
- 한페이지에 10개씩 페이징

 
## 🎇 주요기능 실행화면



* **메인 화면**
  * `현재 위치 허용` 을 통해 지도에 현재 위치를 표시할 수 있습니다.
    
  ![현재 위치](https://github.com/user-attachments/assets/b8a0dfe1-38b6-46c5-91f1-710982d9db17)
* **회원가입 및 로그인**
  * 회원가입시 비밀번호는 암호화된 상태로 저장됩니다.
  
  ![회원가입](https://github.com/user-attachments/assets/cf8fe243-4a05-4558-874c-30f45f90333c)
  * 로그인시 `access`토큰 을 확인해 검증을 진행합니다.

    ![로그인](https://github.com/user-attachments/assets/e67df1b5-4518-47fe-8811-37beefb38e27)

  * `access` 토큰이 없거나 만료된 경우 `refresh` 토큰을 이용하여 재발급을 진행합니다.
 
    ![소셜로그인](https://github.com/user-attachments/assets/9ec5c877-25f4-48f6-bcb8-d9d057bf99be)

  * `kakao`, `google`, `naver` 소셜로그인을 지원합니다. 

* **로그아웃**
  * `Redis`를 통해 일시적은 블랙리스트를 만들어서 로그아웃을 진행합니다.
 
    ![로그아웃](https://github.com/user-attachments/assets/2fe171fd-2b74-416c-8df0-9a1466939ea3)
      
* **키워드 검색**
  * 검색창에 키워드 검색을 하면 해당 키워드의 `병원 or 약국 정보`를 확인할 수 있습니다.
 
    ![키워드 검색](https://github.com/user-attachments/assets/8141ebcd-ce7b-4eed-bc71-86189755ec47)
 
* **지역 검색**
  * 시/군/구를 선택하여 `메인페이지`에서 `지역이름`으로 검색이 가능합니다.

  ![지역검색](https://github.com/user-attachments/assets/7dc0e2da-c790-4869-91ee-769a276c1ceb)

* **상세 정보**

  * 검색한 `약국` or `병원`의 상세정보를 볼 수 있습니다.
 
    ![병원 세부 정보](https://github.com/user-attachments/assets/46632c06-d516-4f62-b907-87a1f5467b37)

  * 스크롤시 `무한스크롤`을 구현하여 계속해서 데이터가 추가 됩니다.

   ![무한스크롤](https://github.com/user-attachments/assets/1fa8b7b4-2b24-4b46-a82a-6c1a9a10db52)

  
  * **클러스터**
 
  * 줌의 따라 클러스터의 갯수가 달라집니다.
    
    ![클러스터](https://github.com/user-attachments/assets/4d42bcad-c74a-4445-bcc9-a87d089183c8)

  * 뭉쳐진 클러스터의 정보를 볼 수 있습니다.
    
   ![각각의 클러스터들의 정보들](https://github.com/user-attachments/assets/8c666493-95d6-4525-b781-11d267a3c612)
    
* **리뷰**
  * `비로그인`시에는 리뷰를 보는 것만 가능합니다.

    ![로그인 안했을때 리뷰 볼수만 있음(+페이징)](https://github.com/user-attachments/assets/6cbb8413-406b-4510-8fa0-f05bf6210bea)
    
  * `병원` or `약국` 상세페이지에서 리뷰를 등록할 수 있습니다.(회원일때)

  ![리뷰 저장](https://github.com/user-attachments/assets/6ccceb8e-f022-45ea-820c-f36ca8a57f7f)

  
  * 본인이 쓴 리뷰에 한해 리뷰 삭제가 가능합니다.

  ![본인이 쓴 리뷰에 한해 리뷰삭제](https://github.com/user-attachments/assets/e8c5026a-c2a0-4030-b545-0b942861e8fc)


* **길찾기**

* 해당 `병원` or `약국`의 목적지 설정이 가능합니다.

  ![길찾기](https://github.com/user-attachments/assets/7f7330d0-4895-47ef-8b94-d22152e2626e)
 
</details>

## 🌄 개선사항
- 병원정보가 부산부터 들어가 있어 검색시 부산부터 검색되는 부분
- 검색시 현재 나와의 거리가 얼마나 떨어져있는지 나타나는 기능


## 👻 후기

이번 개인 프로젝트를 처음 설계할 때 디테일한 부분을 놓쳐 불필요한 시간이 소요된 점이 있었습니다. 또한, 리액트를 처음 사용하면서 원하는 대로 응용하는 데 어려움이 있었고, 스프링부트 역시 첫 프로젝트 경험이라 익숙해지기까지 시간이 걸렸습니다. 그럼에도 불구하고 포기하지 않고 끝까지 프로젝트를 완성할 수 있어서 정말 기뻤고, 이번 경험을 통해 한층 더 성장할 수 있었습니다.



















