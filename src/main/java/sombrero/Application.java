package sombrero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Hypermedia As The Engine Of Application State
     * ● 서버: 현재 리소스와 연관된 링크 정보를 클라이언트에게 제공한다.
     * ● 클라이언트: 연관된 링크 정보를 바탕으로 리소스에 접근한다.
     * ● 연관된 링크 정보
     * ○ Relation
     * ○ Hypertext Reference)
     * ● spring-boot-starter-hateoas 의존성 추가
     * ● https://spring.io/understanding/HATEOAS
     * ● https://spring.io/guides/gs/rest-hateoas/
     * ● https://docs.spring.io/spring-hateoas/docs/current/reference/html/
     */

}
