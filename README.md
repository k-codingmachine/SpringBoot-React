<h1 align='center'> <img src='https://github.com/user-attachments/assets/577abd23-7965-441c-abd4-6769499901ee' style='width: 300px; height: 200px;'>&nbsp;</h1>

<h1  align='center'>🏥💊병원 & 약국 지도 프로젝트</h1>
<div align='center'>
  <h3>
    🔗 <a href="">AWS 나중에 추가할 예정</a> 사이트 바로가기
  </h3>
</div>
<br/><br/>



## 목차
- [개요](https://github.com/k-codingmachine/Spring-project#-개요)
- [기술 스택](https://github.com/k-codingmachine/Spring-project#-기술-스택)
- [프로젝트 설계](https://github.com/k-codingmachine/Spring-project#-프로젝트-설계)
- [핵심 기능](https://github.com/k-codingmachine/Spring-project#-핵심-기능)
- [주요기능 실행화면](https://github.com/k-codingmachine/Spring-project#-주요기능-실행화면)
- [개선사항](https://github.com/k-codingmachine/Spring-project#-개선사항)
  


## 🚩 개요
- 프로젝트 목표 : 다양한 `API`를 활용한 `SPRINGBOOT` , `REACT` 병원 & 약국 지도 프로젝트
- 개발기간 : 24/08/19 ~ 24/09/24



## 🔧 기술 스택
- API : `카카오 API` `PORTONE API` `VWORLD API` `Tmap API`
- Language : `Java(11)` `JavaScript(1.5)`
- Library & Framework : `Spring(5.3.23)` `Junit(4.12)` `Servlet(4.0.1)` `Spring Security`
- Database : `MySQL(8.0.35)`
- Target : `Web Browser`
- Tool : `SpringSource Tool Suite (STS) 3.9.18.RELEASE`
- Infra : `Linux(Ubuntu)` `EC2`
- Etc : `Git`

  

## 👾 프로젝트 설계(ERD, USECASE)




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

 
## 🎇 주요기능 실행화면



* **메인 화면**
  * `현재 위치 허용` 을 통해 지도에 현재 위치를 표시할 수 있습니다.
    
  ![현재 위치](https://github.com/user-attachments/assets/b8a0dfe1-38b6-46c5-91f1-710982d9db17)
* **회원가입 및 로그인**
  * 회원가입시 비밀번호는 암호화된 상태로 저장됩니다.
  
  ![회원가입](https://github.com/user-attachments/assets/cf8fe243-4a05-4558-874c-30f45f90333c)
  * 로그인시 `access 토큰` 을 확인해 검증을 진행합니다.

    ![로그인](https://github.com/user-attachments/assets/e67df1b5-4518-47fe-8811-37beefb38e27)

  * `access 토큰` 이 없거나 만료된 경우 `refresh 토큰` 을 이용하여 재발급을 진행합니다.
  

* **로그아웃**
  * `Redis`를 통해 일시적은 블랙리스트를 만들어서 로그아웃을 진행합니다.
 
    ![로그아웃](https://github.com/user-attachments/assets/2fe171fd-2b74-416c-8df0-9a1466939ea3)
      
* **상품 상세 조회 및 위시리스트 추가**
  * 상품 목록에서 상품의 사진을 클릭하면 `상품 상세 정보`를 확인할 수 있습니다.
 
    ![iteminfo](https://github.com/appcoding-ux/Spring_Project/assets/112378228/4fa7734d-728c-4186-95b1-682dcfa87cd8)

  * `상품 사이즈`와 `수량`을 선택하여 `예시 가격`을 보여줍니다.

    ![iteminfo_itemStock](https://github.com/appcoding-ux/Spring_Project/assets/112378228/528fead8-2c5a-4955-8843-562880a991ca)

  * `상품 상세` 페이지에서 자신의 `위시리스트`에 추가할 수 있습니다.

    ![iteminfo_wishList](https://github.com/appcoding-ux/Spring_Project/assets/112378228/84c1df81-5dcd-4c8a-92ae-a2b38fe46d5e)

  * `상품 상세 페이지`에서 해당 상품에 대한 `문의`를 등록할 수 있습니다.
 
    ![iteminfo_itemQnA](https://github.com/appcoding-ux/Spring_Project/assets/112378228/555ce8fc-1390-4177-a91c-2cd27c112b1a)

* **상품검색**
  * 기본적인 검색으로 `메인페이지`에서 `상품이름`으로 검색이 가능합니다.

    ![검색 조회](https://github.com/appcoding-ux/Spring_Project/assets/112378228/2d0d44ea-102e-44b9-9f5c-7d049f0f79c3)

  * `색상`과 `상품이름`으로 이중으로 검색이 가능합니다. (색상은 선택)
    
    ![색상 가격순조회](https://github.com/appcoding-ux/Spring_Project/assets/112378228/8f660dcb-9868-43b7-a17c-64117b700c10)

  * 조회된 결과를 토대로 `가격순` 또는 `최신순`으로 조회 할 수 있습니다. (높은 가격, 낮은 가격, 최신순)

    ![가격순조회](https://github.com/appcoding-ux/Spring_Project/assets/112378228/2c81eda6-08f7-458f-b2f0-9f22444510e3)
* **리뷰(한줄평) 작성**
  * `상품 상세` 페이지에서 리뷰를 등록할 수 있습니다.
 
    ![iteminfo_itemReview_buy](https://github.com/appcoding-ux/Spring_Project/assets/112378228/f36d8a73-ebdd-4fc2-9156-cdf2a93ca100)

  * `구매고객` 상품을 구매한 고객만 리뷰를 등록할 수 있습니다.
  
    ![iteminfo_itemReview_nonebuy](https://github.com/appcoding-ux/Spring_Project/assets/112378228/b39c5b8f-ebc2-4702-aad6-9b9e74ece68f)

* **장바구니**
  * `상품 상세 페이지`에서 `장바구니 상품 추가`가 가능합니다.
    ![The shard - 장바구니상품추가](https://github.com/appcoding-ux/Spring_Project/assets/112378228/8d7baeec-e08d-4a51-86a2-b52a81231b10)
 
  * `상품 상세 페이지`에서 해당 상품만 `바로구매`가 가능합니다.

    ![item -  바로주문작성](https://github.com/appcoding-ux/Spring_Project/assets/112378228/e6155015-ddda-487a-a851-14aaba48530f)

  * `상품삭제` 버튼으로 `선택상품삭제`와 `전체상품삭제`가 가능합니다.
    * **선택상품삭제**
     ![Cart - 선택삭제](https://github.com/appcoding-ux/Spring_Project/assets/112378228/ed972507-0a34-4c96-92bc-3eaa949e6d42)
        
    * **전체상품삭제**
     나중에 추가 예정(아직 영상이 없음)
  
  * `장바구니` 메뉴에서 추가한 `상품확인` 및 `수량변경`이 가능합니다. 장바구니의 `주문하기` 를 누르면 주문페이지로 이동합니다.

    ![Cart - 수량조정](https://github.com/appcoding-ux/Spring_Project/assets/112378228/36bac3f5-de0a-46ce-9a35-cc488826da1e)
* **주문하기**
  * `배송주소` 변경이 가능하고 `주소`를 저장하면 `배송지이름`과 같이 저장됩니다.

    ![check out - 주소저장 배송메세지](https://github.com/appcoding-ux/Spring_Project/assets/112378228/09b311cd-fe43-44a4-81e1-5b65aaedc6fd)
    
  * `배송메세지`를 입력할 수 있습니다.
    
    ![check out - 배송메세지](https://github.com/appcoding-ux/Spring_Project/assets/112378228/d8790f82-c2ca-4fff-befa-7155f211cdbb)
    
  * 결제페이지로 가기 전에 `쿠폰`과 `적립금`을 사용할 수 있습니다
    * **쿠폰 사용**
      ![check out - 쿠폰사용](https://github.com/appcoding-ux/Spring_Project/assets/112378228/3d6825b1-03d5-4c88-92eb-7bbd947523a4)

    * **적립금 사용**
      ![check out - 적립금사용](https://github.com/appcoding-ux/Spring_Project/assets/112378228/26987cc8-7d73-48de-ba8f-fb9befb69894)
* **결제하기**
  * `결제하기` 를 누르면 `IamportAPI`와 연동된 `kg이니시스 결제페이지`로 이동합니다.
    ![check out - 결제완료](https://github.com/appcoding-ux/Spring_Project/assets/112378228/56e8d4d5-8518-4886-97b3-4158b437da3a)
    
  *  `kg이니시스 결제페이지`를 닫으면 결제가 `취소`됩니다.
    ![check out - 주문취소](https://github.com/appcoding-ux/Spring_Project/assets/112378228/242992cc-baa3-4a07-a46c-183acf8109af)

  * 결제가 완료되면 `결제 내역` 메뉴에서 결제 정보를 확인할 수 있습니다.
    ![check out - 결제완료후](https://github.com/appcoding-ux/Spring_Project/assets/112378228/eaedc050-6217-40f7-ac9d-f7a1a78a1aa3)
* **관리자 페이지**

  * `제품관리` 메뉴에서 상품을 등록하거나 재고 및 이미지등을, 수정, 삭제 할 수 있습니다.

  ![admin_item](https://github.com/appcoding-ux/Spring_Project/assets/112378228/f1c84a61-005c-48cc-805b-375908ce99ef)
  * `고객관리` 메뉴에서 비정상적인 고객을 비활성화 처리할 수 있습니다.
  
  ![admin_member](https://github.com/appcoding-ux/Spring_Project/assets/112378228/70474bcb-1b92-48af-a771-f9bf02658c4a)
  * `공지사항` 메뉴에서 공지사항 등록, 수정, 삭제 할 수 있습니다.

  ![admin_notice](https://github.com/appcoding-ux/Spring_Project/assets/112378228/845fe822-dbd4-4ba7-9ec4-9d5f36551829)
  * `통계` 메뉴에서 나이대를 비교해 도충한 통계를 확인할 수 있습니다.
    
  ![admin_statistics](https://github.com/appcoding-ux/Spring_Project/assets/112378228/e4475a1c-19a1-4443-ae4c-91a74ed46d35)
  * `문의답변` 메뉴에서 현재 답변하지 않은 문의들을 답변할 수 있습니다.

  ![admin_enswer](https://github.com/appcoding-ux/Spring_Project/assets/112378228/1985c634-83f2-4cf9-b240-ccc548139873)
* **Q&A**
  * `Q&A` 메뉴에서 `회원`은 문의를 등록힐 수 있습니다.
  * 만약 더 궁금한 점이 있을 때 `재문의`를 할 수 있습니다. (단, 관리자가 답변을 했을 경우에만 가능합니다.)

  ![q a_1](https://github.com/appcoding-ux/Spring_Project/assets/112378228/a7da204c-2b9f-4cae-829b-6f215b95a336)
  ![q a_2](https://github.com/appcoding-ux/Spring_Project/assets/112378228/908ab84d-223a-4be3-bb78-ca055c0565fb)
</details>


## 🌄 개선사항
- 배송전 주문취소 기능
- 할인율 높은 쿠폰 자동적용
- 고객의 환불 요청
- 리뷰 수정, 삭제, 리뷰의 대댓글


<img src="https://github.com/user-attachments/assets/cf8fe243-4a05-4558-874c-30f45f90333c" style="width:20px">
</img>


![키워드 검색](https://github.com/user-attachments/assets/8141ebcd-ce7b-4eed-bc71-86189755ec47)

![지역검색](https://github.com/user-attachments/assets/7dc0e2da-c790-4869-91ee-769a276c1ceb)

![소셜로그인](https://github.com/user-attachments/assets/9ec5c877-25f4-48f6-bcb8-d9d057bf99be)

![본인이 쓴 리뷰에 한해 리뷰삭제](https://github.com/user-attachments/assets/e8c5026a-c2a0-4030-b545-0b942861e8fc)

![각각의 클러스터들의 정보들](https://github.com/user-attachments/assets/8c666493-95d6-4525-b781-11d267a3c612)

![길찾기](https://github.com/user-attachments/assets/7f7330d0-4895-47ef-8b94-d22152e2626e)


![로그인 안했을때 리뷰 볼수만 있음(+페이징)](https://github.com/user-attachments/assets/6cbb8413-406b-4510-8fa0-f05bf6210bea)

![리뷰 저장](https://github.com/user-attachments/assets/6ccceb8e-f022-45ea-820c-f36ca8a57f7f)

![무한스크롤](https://github.com/user-attachments/assets/1fa8b7b4-2b24-4b46-a82a-6c1a9a10db52)

![병원 세부 정보](https://github.com/user-attachments/assets/46632c06-d516-4f62-b907-87a1f5467b37)

![클러스터](https://github.com/user-attachments/assets/4d42bcad-c74a-4445-bcc9-a87d089183c8)

