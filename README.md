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
<br/>
https://spring.io/understanding/HATEOAS <br/>
https://spring.io/guides/gs/rest-hateoas/ <br/>
https://docs.spring.io/spring-hateoas/docs/current/reference/html/ <br/>
<br/>