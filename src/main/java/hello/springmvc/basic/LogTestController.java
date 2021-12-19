package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j//    private final Logger log = LoggerFactory.getLogger(getClass()); 자동으로 주입됨. 롬복
@RestController// HTTP메시지 바디에 바로 입력됨?
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logtest() {
        String name = "Spring";

        System.out.println("name = " + name);
        log.trace("trace my log =" + name); // 이렇게 쓰지말것! 절대.

        log.trace("trace log={},{}",name);
        log.debug("debug log={},{}",name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }

}
