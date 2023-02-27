package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderServiceTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
    OrderService orderService = applicationContext.getBean("orderService",OrderService.class);


    @Test
    void createOrder(){
        // Given
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);

        // When
        memberService.join(member);
        Order order = orderService.createOrder(memberId,"itemA",10000);

        // Then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
