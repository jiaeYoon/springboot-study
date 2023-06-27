package Hello.hellospring;

import Hello.hellospring.repository.JdbcTemplateMemberRepository;
import Hello.hellospring.repository.JpaMemberRepository;
import Hello.hellospring.repository.MemberRepository;
import Hello.hellospring.repository.MemoryMemberRepository;
import Hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private EntityManager em;

    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Autowired


    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }
}
