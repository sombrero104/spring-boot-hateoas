# 스프링의 HATEOAS
HATEOAS를 위해 편리한 기능들을 제공해주는 일종의 스프 라이브러리.<br/>
<br/>
HATEOAS (Hypermedia As The Engine Of Application State)<br/>
- 서버:<br/>
     현재 rest API 리소스와 연관된 링크 정보를 클라이언트에게 제공한다.<br/>
- 클라이언트:<br/>
     연관된 링크 정보를 바탕으로 rest API 리소스에 접근한다.<br/>
<br/>
연관된 링크 정보 (클라이언트가 리소스에 대한 정보 파악을 할 수 있게 해준다.)<br/>
- <i><b>Rel</b></i>ation (rel)<br/>
- <i><b>H</b></i>ypertext <i><b>Ref</b></i>erence (href)<br/>
<br/>
<pre>
예) rel=>'나 자신이다.', href=>'/(루트)'
    rel=>'books', href=>'/books'
</pre>
<br/>
spring-boot-starter-hateoas 의존성 추가<br/>
<pre>
❮!-- HATEOAS 의존성 추가. --❯
❮dependency❯
    ❮groupId❯org.springframework.boot❮/groupId❯
    ❮artifactId❯spring-boot-starter-hateoas❮/artifactId❯
❮/dependency❯
</pre>
위 처럼 의존성을 추가하게 되면 아래 두가지를 제공한다.<br/>
<br/>

1. ObjectMapper 제공 (많이 사용.)
- 제공하는 리소스를 json 형태로 변환할 때 사용.
- spring.jackson.* 라이브러리 사용.
- spring-boot-starter-web 의존성만 추가해도 자동으로 빈으로 등록됨.
- Jackson2ObjectMapperBuilder
2. LinkDiscovers 제공 (사용할 일이 많지 않음.)
- 클라이언트 쪽에서 링크 정보를 Rel 이름으로 찾을때 사용할 수 있는 XPath 확장 클래스
<br/>

<br/>
https://spring.io/understanding/HATEOAS <br/>
https://spring.io/guides/gs/rest-hateoas/ <br/>
https://docs.spring.io/spring-hateoas/docs/current/reference/html/ <br/>
<br/>