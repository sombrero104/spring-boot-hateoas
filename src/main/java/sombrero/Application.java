package sombrero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 스프링의 HATEOAS
     * HATEOAS를 위해 편리한 기능들을 제공해주는 일종의 스프 라이브러리.
     *
     * HATEOAS (Hypermedia As The Engine Of Application State)
     * ● 서버:
     *      현재 rest API 리소스와 연관된 링크 정보를 클라이언트에게 제공한다.
     * ● 클라이언트:
     *      연관된 링크 정보를 바탕으로 rest API 리소스에 접근한다.
     *
     * ● 연관된 링크 정보 (클라이언트가 리소스에 대한 정보 파악을 할 수 있게 해준다.)
     * ○ Relation
     * ○ Hypertext Reference
     *
     * 예) relation=>'나 자신이다.', ref=>'/(루트)'
     *    relation=>'books', ref=>'/books'
     *
     * ● spring-boot-starter-hateoas 의존성 추가
     *
     * ● https://spring.io/understanding/HATEOAS
     * ● https://spring.io/guides/gs/rest-hateoas/
     * ● https://docs.spring.io/spring-hateoas/docs/current/reference/html/
     */

}
