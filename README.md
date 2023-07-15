# Green-Marsh-tit-login_service
SNS login service using Oauth2

Green marsh tit_team first project : Social Network Service Login

[프로젝트 주제 선정 이유] : 기존 회원가입 방식을 사용해 로그인하면 회원가입이라는 번거로운 절차를 거쳐서 로그인해야 하기 때문에 
                          SNS 계정으로 로그인 하는 기능을 이용해보고 싶어서 평소에 자주 사용하는 네이버, 카카오, 구글의 계정을 이용해 로그인을 구현하게 되었습니다.

[개발 소요 시간] 4.19 ~ 5.10 (3주)

[개발 환경] Eclipse, Java 1.8, Mysql(Mybatis & HikariCP)

[협업 도구] Github

[개발 순서] 프로젝트 계획 → 설계 → 구현 → 평가(테스트) → 프로젝트 종료

[프로젝트 결과] 

주요 기능 : 로그인, 로그인 정보 기억하기, 로그아웃, 회원가입, 회원탈퇴, 회원 정보 변경, 비밀번호 찾기 및 변경, OAuth2.0 이용한 SNS 로그인

[로그인 & 로그인 정보 기억하기]

![image](https://github.com/Jinny0609/Green-Marsh-tit-login_service/assets/71204918/51fb6a62-68f3-40d4-b7a8-f83c4fd5d465)

[회원가입]

![image](https://github.com/Jinny0609/Green-Marsh-tit-login_service/assets/71204918/c94874b0-92c0-465f-8b9c-71f1eedc5a4b)

[로그인 페이지]

![image](https://github.com/Jinny0609/Green-Marsh-tit-login_service/assets/71204918/23f68f33-6fbe-45cb-8068-3ca7cfa65ec2)

[서비스 페이지(로그인 성공)]

![image](https://github.com/Jinny0609/Green-Marsh-tit-login_service/assets/71204918/af9dea7a-d845-4b2a-8833-bf83442d171c)

[비밀번호 찾기 페이지]
![image](https://github.com/Jinny0609/Green-Marsh-tit-login_service/assets/71204918/ad152982-106a-4a5b-85ec-13d398092b3f)

[비밀번호 찾기 페이지1]
![image](https://github.com/Jinny0609/Green-Marsh-tit-login_service/assets/71204918/d89bca3d-10ac-4bdc-a81e-058b3a5a2fc0)

[비밀번호 찾기 페이지2]
![image](https://github.com/Jinny0609/Green-Marsh-tit-login_service/assets/71204918/91e91677-8fd4-4eea-8851-fc95b4824648)

[잘했던점]
첫 팀프로젝트 였는데 원할한 커뮤니케이션과 역할 분담, 그리고 계획과 일정 관리를 효과적으로 수행하여 프로젝트를 시간 안에 완수하는 데 성공했습니다.
역할 분담은 각 팀원의 강점과 관심 분야를 고려하여 적절하게 배정하였고, 각자의 역할을 충실히 수행하여 프로젝트 진행을 원활하게 이끌었습니다.
팀원들의 의견과 피드백을 열린 마음으로 수용했습니다. 상호 간의 의견 교환을 통해 프로젝트의 품질을 높이기 위해 코드와 기능을 개선하는 데 주력했습니다. 이를 통해 더욱 완성도 높은 프로젝트를 구현할 수 있었습니다.

[아쉬운점]
비밀번호 찾기를 했을때 비밀번호를 알려주는게 아니라 변경하는 절차를 진행하도록 했어야 했는데 보안과 개인정보를 보호하지 못했던것 같아서 아쉽습니다.
이메일 주소나 다른 신뢰할 수 있는 인증 수단을 통해 비밀번호를 변경하도록 했어야했는데 그러지 못한점도 아쉽습니다.
마스터 브랜치에 전부 커밋해서 사용했었는데 충돌이 발생할 수 있다는 것을 알게 되었습니다.
그러다 보니 롤백이 어려워서 따로 파일을 백업해서 관리했었는데, 다음 프로젝트 부터는 유연한 협업을 위해 브랜치를 이용해서 프로젝트를 관리해야겠다고 생각이 들었습니다.
