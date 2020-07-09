# 자바 정리

### 1. 자바에서 클래스, 필드, 메소드의 선언

- 클래스

  ```java
  //클래스의 선언(java파일의 이름과 같아야한다)
  public class 클래스이름 {
    //생성자
    public 클래스이름(파라미터){
      
    }
  }
  
  //클래스명 관례: 대문자로 시작하며 명사로 만든다. (파스칼 케이스 사용.)
  ```

  

- 필드

  ```java
  //필드의 선언
  접근제한자 스태틱여부 필드타입 필드이름;
  public static int myInt;
  public static int myInt = 1;
  
  //필드명은 소문자로 짓고 카멜케이스를 사용한다.
  ```



- 메소드

  ```java
  //함수(메소드) 선언
  //함수에 사용 가능한 접근 제한자는 public, private, protected, default
  
  //형식
  접근제한자 스태틱 리턴타입 함수이름(파라미터) {}
  public static void myMethod(){} => 리턴 하지 않는 함수
  public static int myMethod(){} => int 타입의 값을 리턴하는 함수
  public void myMethod(){} => non-static method
    
  //메서드 이름은 소문자로 시작하며 동사로 정한다.
  ```



- 변수명 FYI

  <b>카멜 케이스</b>: 첫단어를 제외한 모든 새로운 단어의 첫문자는 대문자이다. 예)camelCase, helloWorld => 필드명이나 메서드명에 사용

  <b>파스칼 케이스</b>: 모든 단어에서 첫 문자는 대문자로 시작한다. 예)PascalCase, HelloWorld => 클래스명에 사용

  <b>스네이크 케이스</b>: 단어의 사이를 언더바로 이어준다. 예)SNAKE_CASE => 아마도 상수명에 사용하면 되지 않을까 싶네.



### 2. 자바에서 static

- static(정적) 필드 및 메소드는 메모리와 관련있다.

- 자바에서 static 필드나 메소드는 메모리의 static 영역에 저장되며 프로그램이 실행될때부터 종료될때까지 유지된다. 

- 메모리의 static 영역에는 클래스들이 저장되있으며 heap영역에는 클래스들을 이용해 생성된 객체들이 저장된다. 

- static 영역과 heap 영역의 차이는 garbage collection의 유무다. Static 영역에는 garbage collection이 없지만 heap 영역에는 garbage collection이 존재한다.

  

### 3. 패키지

자바에서는 클래스를 체계적으로 관리하기 위하여 패키지를 사용한다. 패키지에는 다음과 같은 특징이 있다.

- 클래스 이름이 동일하더라도 패키지가 다르다면 다른 클래스로 인식한다. 

- 각 클래스파일 안에는 해당되는 패키지 이름을 적어줘야 한다.

  ```java
  //패키지 선언 예제 => com 패키지 안에 mightykim 안에 Mighty 클래스
  
  package com.mightykim;
  
  public class Mighty{
  
  }
  ```

- 패키지명 관례

  - 숫자나 `_` , `$` 를 제외한 특수문자로 시작되어서는 안된다.
  - 모든 문자를 소문자로 작성한다.
  - `java` 로 시작하는 패키지는 자바 표준 API에서만 사용하므로 사용해서는 안된다. 예) java.mightykim 은 사용 불가능하다.

- 자바 패키지의 이름은 흔히 도메인 이름으로 짓는 경우가 많다 (관례이기도 하다). 그 이유는 각 회사마다 고유의 패키지명을 가지고 중복을 최소화하기 위함이다. 예) com.samsung.project, com.hyndai.project, com.mightykim.project.



### 4. 접근 제한자(modifier)

| 접근 제한자 | 적용 대상                    | 접근할 수 없는 클래스                          |
| ----------- | ---------------------------- | ---------------------------------------------- |
| public      | 클래스, 필드, 생성자, 메소드 | 없음                                           |
| private     | 필드, 생성자, 메소드         | 모든 외부 클래스                               |
| protected   | 필드, 생성자, 메소드         | 자식 클래스가 아닌 다른 패키지에 소속된 클래스 |
| default     | 클래스, 필드, 생성자, 메소드 | 다른 패키지에 소속된 클래스                    |

* 클래스에 적용 가능한 접근 제한자는 public 아니면 default 이다.



### 5. final 필드

- 개념: final 필드는 프로그램 실행 도중 변경될 수 없다.

- final 필드에 초기값을 줄 수 있는 방법은 1) 필드 선언시 초기값 설정, 2) 생성자에서 설정

  ```
  //선언과 동시에 초기값 설정
  public class myClass {
  	final int myInt = 10;
  }
  
  //생성자를 통한 초기값 설정
  public class myClass {
  
  	final int myInt;
  	
  	public myClass(int myInt){
  		this.myInt = myInt;
  	}
  }
  ```



### 5. static final 필드

final 과 같은 개념이지만 static final 필드는 상수라고도 부른다. 쉽게 생각하면 절대 변하지 않는 값(pi 값이나 지구의 둘레 및 무게)은 static final로 선언하면 된다. 선언방식은 4 에서 소개한 final 필드와 같다. 

- 상수명을 지을때는 대문자로 짓는다.