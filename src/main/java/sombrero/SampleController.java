package sombrero;

import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public Resource<Hello> hello() {
        Hello hello = new Hello();
        hello.setPrefix("Hey,");
        hello.setName("sombrero");

        /**
         * 링크 정보를 추가하는 방법.
         * 1. HATEOAS 의존성 추가 시 추가되는 라이브러리 중 Resource 사용.
         *      (org.springframework.hateoas.Resource)
         *
         * 아래 코드에서는
         * /hello 메소드의 링크를 따서 "self"라는 릴레이션에 링크를 추가해줌.
         *
         * 추가한 후 결과:
         * ---------------------------------------------------
         *      {
         *          "prefix":"Hey,"
         *          ,"name":"sombrero"
         *          ,"_links":{
         *              "self":{
         *                  "href":"http://localhost/hello"
         *              }
         *          }
         *      }
         * ---------------------------------------------------
         */
        Resource<Hello> helloResource = new Resource<>(hello);
        helloResource.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel());

        return helloResource;
    }

}
