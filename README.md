# Dmoim - Api

### Description
---------------
개발자 소통과 프로젝트 및 코드 품질향상을 목표로 하는 커뮤니티 사이트
MSA형태로 도전해보고자 하는 마음에 준비한 프로젝트입니다
당시 개발진행할때 현업업무가 바쁜관계로 중지했던 프로젝트

### Skill
----------
* Java11
* Spring Webflux - 비동기, 논블러킹 환경제공
* R2dbc - 비동기, 논블러킹 환경제공
* JPA - R2dbc가 아직 ORM처럼 지원이 충족된다고 생각하지않으며, 일부 도메인별로는 JPA 도입시도
* Lombok - 어노테이션 프로세싱을 통한 코드 간단화
* Spring Gateway - 서비스별 통신을 하나로 통합하기위해 MSA 필수요건
* Spring Config - MSA 개발시 프로퍼티값이 배포로만 인해서 제한되니 
* Spring Boot Admin - 어플리케이션 모니터링 상태
* Spring Oauth Authorization - Oauth2 Authorization 구에서 Spring에서 deprecated되고 필요로 인해 다시 spring진영에서 개발 버전이 낮은편;; (https://spring.io/projects/spring-authorization-server)
* Spring Batch - 대용량처리를 위해 도입하였으면 미개발상태
* Quartz - 스케줄링은 batch랑 별도 필요
* Vaddin - Batch 이력에 따른 화면 조회를 vaddin으로 간단하게 구현해볼 예정
* Actuator - 어플리케이션 헬스체킹, 빈상태 확인이 spring boot admin 사용할때도 필요
* Mysql
* Gradle



### Reference
---------------
