# Movie (Kiosk + POS)

- Benchmarking CGV(강남)

## index

* [Introduction](#introduction)

* [Discription](#discription)
 
* [Environment](#environment)
 
* [Usecase Diagram](#usecase-diagram)
 
* [ER Diagram](#ER-Diagram)
 
* [Prerequisite](#prerequisite)
 
* [Usage](#usage)
 
* [Important](#important)
 
* [Feedback](#feedback)

* [Testing](#testing)


## Introduction

- (온오프) 스프링 클라우드를 활용한 응용 sw 개발자 양성 1차 프로젝트 2팀

  - 김의성, 윤수영, 신은철, 이한나, 최웅빈, 나지수

- 프로젝트 기한

  - 2021-07-29 ~ 2021-08-22

- KGITBANK 1차 프로젝트 공통 주제 : **포스기**

  - 주제선정
  
    - 영화 3표(신은철, 이한나, 윤수영) / 음식점 2표(김의성, 최웅빈) / 편의점 2표(나지수, 이한나)


## Discription

사용자 입장에서 사용하는 **키오스크**와 관리자 입장에서 매장 관리를하는 **포스기**를 합친 프로그램 기획

- 키오스크

  - 현장티켓구매 / 예매티켓출력 / 먹거리구매

- 포스기

  - 매출현황 / 재고관리


## Environment

- UI

  - Java Swing
  
- Programming Language

  - Java version 11.0.1

- DB

  - Oracle DB version 18c


## Usecase Diagram

![usecase](https://user-images.githubusercontent.com/84116965/129388756-5ee5683e-bd54-4be5-958f-33405dd59fb1.png)


## ER Diagram

- 총 테이블 8개

  - 현장티켓구매 : 영화 / 상영관 / 좌석
  
  - 예매티켓출력 : 예매번호
  
  - 먹거리구매 : 상품 / 장바구니 / 상품판매 / 결제
  
![erd](https://user-images.githubusercontent.com/84116965/129391140-79714a8c-9b84-44e0-84d0-d9c5f5ad916e.png)


## Prerequisite

- DB관련 외부라이브러리

  - ojdbc6.jar
  
  - HikariCP.jar
  
  - sql.jar

- ~~동영상 실행관련 외부라이브러리~~

  - ~~javaFx.jar~~


## Usage

1. Java와 Oracle DB를 버전에 맞게 설치

2. Prerequisite의 외부라이브러리 연동(ClassPath 확인)

3. DB 폴더의 텍스트 파일의 내용을 본인의 DB에 작성 후 커밋

4. util 패키지의 DBUtil의 ID/PW를 본인 DB와 맞게 작성

5. pos.media 패키지의 mediaFrame의 메인함수 실행


## Important

- 디자인 패턴

  - MVC 패턴을 기반으로한 패키지 구성

![mvc](https://user-images.githubusercontent.com/84116965/129394319-e93b844f-7ddc-4608-b708-b31ccc3b31bb.png)

- Java Swing에 영상 출력

  - mp4파일을 gif로 변환 후 화면에 출력(https://ezgif.com/video-to-gif)

영상

- Swing의 Timer 클래스를 이용한 동적인 처리

  - 해당 시간이 지난 후 이벤트 발생

영상


## Feedback

- Java Swing 동영상 출력

  - javaFx 외부라이브러리를 통한 동영상 출력
  
  ![오류](https://user-images.githubusercontent.com/84116965/129397173-add4f35f-7aec-4145-b7d3-75567cd09e58.png)
 
  - java 11.0.1버전은 해당 외부라이브러리와 연동문제가 생김 -> GIF파일로 대체하여 재생

- 

## Testing

영상
