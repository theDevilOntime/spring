package nba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@ImportResource("classpath:nba-config.xml")
@PropertySource("classpath:app.properties")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class NbaConfig {

    /*@Bean
    public Name getName()  {
        Name n = new Name();
        n.setName("Kobe");
        return n;
    }

    @Bean
    public Jersy getJersy() {
        Jersy j = new Jersy();
        j.setNumber("24");
        return j;
    }

    @Bean
    public Team getTeam() {
        Team t = new Team();
        t.setTeam("Laker");
        return t;
    }*/

    @Bean
    public ShowPlayer getShower(Team t,Jersy j,Name n) {
            return new ShowPlayer(t,j,n);
    }

    @Autowired
    Environment env;

    @Bean
    public Audience getAudience() {
        return new Audience();
    }

    @Bean
    public External getExternal() {
        return new External(env.getProperty("words"));
    }


}
